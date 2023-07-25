/*
 * This file is generated by jOOQ.
 */
package com.bros.fooforderingsystem.model.tables.records;


import com.bros.fooforderingsystem.model.tables.Order;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> implements Record7<UUID, String, UUID, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.order.id</code>.
     */
    public OrderRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.order.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.order.student_id</code>.
     */
    public OrderRecord setStudentId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.order.student_id</code>.
     */
    public String getStudentId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.order.vendor_id</code>.
     */
    public OrderRecord setVendorId(UUID value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.order.vendor_id</code>.
     */
    public UUID getVendorId() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>public.order.status</code>.
     */
    public OrderRecord setStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.order.status</code>.
     */
    public String getStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.order.otp</code>.
     */
    public OrderRecord setOtp(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.order.otp</code>.
     */
    public String getOtp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.order.created_at</code>.
     */
    public OrderRecord setCreatedAt(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.order.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>public.order.updated_at</code>.
     */
    public OrderRecord setUpdatedAt(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.order.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<UUID, String, UUID, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<UUID, String, UUID, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Order.ORDER.ID;
    }

    @Override
    public Field<String> field2() {
        return Order.ORDER.STUDENT_ID;
    }

    @Override
    public Field<UUID> field3() {
        return Order.ORDER.VENDOR_ID;
    }

    @Override
    public Field<String> field4() {
        return Order.ORDER.STATUS;
    }

    @Override
    public Field<String> field5() {
        return Order.ORDER.OTP;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Order.ORDER.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Order.ORDER.UPDATED_AT;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getStudentId();
    }

    @Override
    public UUID component3() {
        return getVendorId();
    }

    @Override
    public String component4() {
        return getStatus();
    }

    @Override
    public String component5() {
        return getOtp();
    }

    @Override
    public LocalDateTime component6() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component7() {
        return getUpdatedAt();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getStudentId();
    }

    @Override
    public UUID value3() {
        return getVendorId();
    }

    @Override
    public String value4() {
        return getStatus();
    }

    @Override
    public String value5() {
        return getOtp();
    }

    @Override
    public LocalDateTime value6() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value7() {
        return getUpdatedAt();
    }

    @Override
    public OrderRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public OrderRecord value2(String value) {
        setStudentId(value);
        return this;
    }

    @Override
    public OrderRecord value3(UUID value) {
        setVendorId(value);
        return this;
    }

    @Override
    public OrderRecord value4(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public OrderRecord value5(String value) {
        setOtp(value);
        return this;
    }

    @Override
    public OrderRecord value6(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public OrderRecord value7(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public OrderRecord values(UUID value1, String value2, UUID value3, String value4, String value5, LocalDateTime value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRecord
     */
    public OrderRecord() {
        super(Order.ORDER);
    }

    /**
     * Create a detached, initialised OrderRecord
     */
    public OrderRecord(UUID id, String studentId, UUID vendorId, String status, String otp, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(Order.ORDER);

        setId(id);
        setStudentId(studentId);
        setVendorId(vendorId);
        setStatus(status);
        setOtp(otp);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
    }
}
