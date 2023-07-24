/*
 * This file is generated by jOOQ.
 */
package com.bros.fooforderingsystem.model.tables.records;


import com.bros.fooforderingsystem.model.tables.OrderRating;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderRatingRecord extends UpdatableRecordImpl<OrderRatingRecord> implements Record6<UUID, UUID, Integer, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.order_rating.id</code>.
     */
    public OrderRatingRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.order_rating.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.order_rating.order_id</code>.
     */
    public OrderRatingRecord setOrderId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.order_rating.order_id</code>.
     */
    public UUID getOrderId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.order_rating.rating</code>.
     */
    public OrderRatingRecord setRating(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.order_rating.rating</code>.
     */
    public Integer getRating() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.order_rating.comment</code>.
     */
    public OrderRatingRecord setComment(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.order_rating.comment</code>.
     */
    public String getComment() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.order_rating.created_at</code>.
     */
    public OrderRatingRecord setCreatedAt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.order_rating.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.order_rating.updated_at</code>.
     */
    public OrderRatingRecord setUpdatedAt(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.order_rating.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, UUID, Integer, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UUID, UUID, Integer, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return OrderRating.ORDER_RATING.ID;
    }

    @Override
    public Field<UUID> field2() {
        return OrderRating.ORDER_RATING.ORDER_ID;
    }

    @Override
    public Field<Integer> field3() {
        return OrderRating.ORDER_RATING.RATING;
    }

    @Override
    public Field<String> field4() {
        return OrderRating.ORDER_RATING.COMMENT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return OrderRating.ORDER_RATING.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return OrderRating.ORDER_RATING.UPDATED_AT;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getOrderId();
    }

    @Override
    public Integer component3() {
        return getRating();
    }

    @Override
    public String component4() {
        return getComment();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component6() {
        return getUpdatedAt();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getOrderId();
    }

    @Override
    public Integer value3() {
        return getRating();
    }

    @Override
    public String value4() {
        return getComment();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value6() {
        return getUpdatedAt();
    }

    @Override
    public OrderRatingRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public OrderRatingRecord value2(UUID value) {
        setOrderId(value);
        return this;
    }

    @Override
    public OrderRatingRecord value3(Integer value) {
        setRating(value);
        return this;
    }

    @Override
    public OrderRatingRecord value4(String value) {
        setComment(value);
        return this;
    }

    @Override
    public OrderRatingRecord value5(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public OrderRatingRecord value6(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public OrderRatingRecord values(UUID value1, UUID value2, Integer value3, String value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRatingRecord
     */
    public OrderRatingRecord() {
        super(OrderRating.ORDER_RATING);
    }

    /**
     * Create a detached, initialised OrderRatingRecord
     */
    public OrderRatingRecord(UUID id, UUID orderId, Integer rating, String comment, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(OrderRating.ORDER_RATING);

        setId(id);
        setOrderId(orderId);
        setRating(rating);
        setComment(comment);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
    }
}
