/*
 * This file is generated by jOOQ.
 */
package com.bros.foodorderingsystem.model.tables;


import com.bros.foodorderingsystem.model.Keys;
import com.bros.foodorderingsystem.model.Public;
import com.bros.foodorderingsystem.model.tables.records.OrderRatingRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderRating extends TableImpl<OrderRatingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.order_rating</code>
     */
    public static final OrderRating ORDER_RATING = new OrderRating();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderRatingRecord> getRecordType() {
        return OrderRatingRecord.class;
    }

    /**
     * The column <code>public.order_rating.id</code>.
     */
    public final TableField<OrderRatingRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.order_rating.order_id</code>.
     */
    public final TableField<OrderRatingRecord, UUID> ORDER_ID = createField(DSL.name("order_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.order_rating.rating</code>.
     */
    public final TableField<OrderRatingRecord, Integer> RATING = createField(DSL.name("rating"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.order_rating.comment</code>.
     */
    public final TableField<OrderRatingRecord, String> COMMENT = createField(DSL.name("comment"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.order_rating.created_at</code>.
     */
    public final TableField<OrderRatingRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.order_rating.updated_at</code>.
     */
    public final TableField<OrderRatingRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    private OrderRating(Name alias, Table<OrderRatingRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderRating(Name alias, Table<OrderRatingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.order_rating</code> table reference
     */
    public OrderRating(String alias) {
        this(DSL.name(alias), ORDER_RATING);
    }

    /**
     * Create an aliased <code>public.order_rating</code> table reference
     */
    public OrderRating(Name alias) {
        this(alias, ORDER_RATING);
    }

    /**
     * Create a <code>public.order_rating</code> table reference
     */
    public OrderRating() {
        this(DSL.name("order_rating"), null);
    }

    public <O extends Record> OrderRating(Table<O> child, ForeignKey<O, OrderRatingRecord> key) {
        super(child, key, ORDER_RATING);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<OrderRatingRecord> getPrimaryKey() {
        return Keys.ORDER_RATING_PKEY;
    }

    @Override
    public List<UniqueKey<OrderRatingRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderRatingRecord>>asList(Keys.ORDER_RATING_PKEY);
    }

    @Override
    public List<ForeignKey<OrderRatingRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrderRatingRecord, ?>>asList(Keys.ORDER_RATING__ORDER_RATING_ORDER_ID_FKEY);
    }

    private transient Order _order;

    public Order order() {
        if (_order == null)
            _order = new Order(this, Keys.ORDER_RATING__ORDER_RATING_ORDER_ID_FKEY);

        return _order;
    }

    @Override
    public OrderRating as(String alias) {
        return new OrderRating(DSL.name(alias), this);
    }

    @Override
    public OrderRating as(Name alias) {
        return new OrderRating(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderRating rename(String name) {
        return new OrderRating(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderRating rename(Name name) {
        return new OrderRating(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, UUID, Integer, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
