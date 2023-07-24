/*
 * This file is generated by jOOQ.
 */
package com.bros.fooforderingsystem.model.tables.records;


import com.bros.fooforderingsystem.model.tables.Item;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemRecord extends UpdatableRecordImpl<ItemRecord> implements Record9<UUID, String, Double, String, String, UUID, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.item.id</code>.
     */
    public ItemRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.item.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.item.name</code>.
     */
    public ItemRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.item.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.item.price</code>.
     */
    public ItemRecord setPrice(Double value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.item.price</code>.
     */
    public Double getPrice() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.item.description</code>.
     */
    public ItemRecord setDescription(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.item.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.item.image</code>.
     */
    public ItemRecord setImage(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.item.image</code>.
     */
    public String getImage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.item.vendor_id</code>.
     */
    public ItemRecord setVendorId(UUID value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.item.vendor_id</code>.
     */
    public UUID getVendorId() {
        return (UUID) get(5);
    }

    /**
     * Setter for <code>public.item.preparationtime</code>.
     */
    public ItemRecord setPreparationtime(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.item.preparationtime</code>.
     */
    public Integer getPreparationtime() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.item.created_at</code>.
     */
    public ItemRecord setCreatedAt(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.item.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>public.item.updated_at</code>.
     */
    public ItemRecord setUpdatedAt(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.item.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, String, Double, String, String, UUID, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<UUID, String, Double, String, String, UUID, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Item.ITEM.ID;
    }

    @Override
    public Field<String> field2() {
        return Item.ITEM.NAME;
    }

    @Override
    public Field<Double> field3() {
        return Item.ITEM.PRICE;
    }

    @Override
    public Field<String> field4() {
        return Item.ITEM.DESCRIPTION;
    }

    @Override
    public Field<String> field5() {
        return Item.ITEM.IMAGE;
    }

    @Override
    public Field<UUID> field6() {
        return Item.ITEM.VENDOR_ID;
    }

    @Override
    public Field<Integer> field7() {
        return Item.ITEM.PREPARATIONTIME;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Item.ITEM.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Item.ITEM.UPDATED_AT;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Double component3() {
        return getPrice();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public String component5() {
        return getImage();
    }

    @Override
    public UUID component6() {
        return getVendorId();
    }

    @Override
    public Integer component7() {
        return getPreparationtime();
    }

    @Override
    public LocalDateTime component8() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component9() {
        return getUpdatedAt();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Double value3() {
        return getPrice();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public String value5() {
        return getImage();
    }

    @Override
    public UUID value6() {
        return getVendorId();
    }

    @Override
    public Integer value7() {
        return getPreparationtime();
    }

    @Override
    public LocalDateTime value8() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value9() {
        return getUpdatedAt();
    }

    @Override
    public ItemRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public ItemRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ItemRecord value3(Double value) {
        setPrice(value);
        return this;
    }

    @Override
    public ItemRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ItemRecord value5(String value) {
        setImage(value);
        return this;
    }

    @Override
    public ItemRecord value6(UUID value) {
        setVendorId(value);
        return this;
    }

    @Override
    public ItemRecord value7(Integer value) {
        setPreparationtime(value);
        return this;
    }

    @Override
    public ItemRecord value8(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public ItemRecord value9(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public ItemRecord values(UUID value1, String value2, Double value3, String value4, String value5, UUID value6, Integer value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemRecord
     */
    public ItemRecord() {
        super(Item.ITEM);
    }

    /**
     * Create a detached, initialised ItemRecord
     */
    public ItemRecord(UUID id, String name, Double price, String description, String image, UUID vendorId, Integer preparationtime, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(Item.ITEM);

        setId(id);
        setName(name);
        setPrice(price);
        setDescription(description);
        setImage(image);
        setVendorId(vendorId);
        setPreparationtime(preparationtime);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
    }
}
