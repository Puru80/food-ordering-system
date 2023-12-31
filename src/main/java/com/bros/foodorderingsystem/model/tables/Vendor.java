/*
 * This file is generated by jOOQ.
 */
package com.bros.foodorderingsystem.model.tables;


import com.bros.foodorderingsystem.model.Keys;
import com.bros.foodorderingsystem.model.Public;
import com.bros.foodorderingsystem.model.tables.records.VendorRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class Vendor extends TableImpl<VendorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.vendor</code>
     */
    public static final Vendor VENDOR = new Vendor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VendorRecord> getRecordType() {
        return VendorRecord.class;
    }

    /**
     * The column <code>public.vendor.id</code>.
     */
    public final TableField<VendorRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.vendor.name</code>.
     */
    public final TableField<VendorRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.vendor.email</code>.
     */
    public final TableField<VendorRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.vendor.location</code>.
     */
    public final TableField<VendorRecord, String> LOCATION = createField(DSL.name("location"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.vendor.acceptingorders</code>.
     */
    public final TableField<VendorRecord, Boolean> ACCEPTINGORDERS = createField(DSL.name("acceptingorders"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field("true", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.vendor.qrcode</code>.
     */
    public final TableField<VendorRecord, String> QRCODE = createField(DSL.name("qrcode"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.vendor.shopimage</code>.
     */
    public final TableField<VendorRecord, String> SHOPIMAGE = createField(DSL.name("shopimage"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.vendor.created_at</code>.
     */
    public final TableField<VendorRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.vendor.updated_at</code>.
     */
    public final TableField<VendorRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    private Vendor(Name alias, Table<VendorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Vendor(Name alias, Table<VendorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.vendor</code> table reference
     */
    public Vendor(String alias) {
        this(DSL.name(alias), VENDOR);
    }

    /**
     * Create an aliased <code>public.vendor</code> table reference
     */
    public Vendor(Name alias) {
        this(alias, VENDOR);
    }

    /**
     * Create a <code>public.vendor</code> table reference
     */
    public Vendor() {
        this(DSL.name("vendor"), null);
    }

    public <O extends Record> Vendor(Table<O> child, ForeignKey<O, VendorRecord> key) {
        super(child, key, VENDOR);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<VendorRecord> getPrimaryKey() {
        return Keys.VENDOR_PKEY;
    }

    @Override
    public List<UniqueKey<VendorRecord>> getKeys() {
        return Arrays.<UniqueKey<VendorRecord>>asList(Keys.VENDOR_PKEY);
    }

    @Override
    public Vendor as(String alias) {
        return new Vendor(DSL.name(alias), this);
    }

    @Override
    public Vendor as(Name alias) {
        return new Vendor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Vendor rename(String name) {
        return new Vendor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Vendor rename(Name name) {
        return new Vendor(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, String, String, String, Boolean, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
