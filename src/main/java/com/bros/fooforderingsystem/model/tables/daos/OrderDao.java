/*
 * This file is generated by jOOQ.
 */
package com.bros.fooforderingsystem.model.tables.daos;


import com.bros.fooforderingsystem.model.tables.Order;
import com.bros.fooforderingsystem.model.tables.records.OrderRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderDao extends DAOImpl<OrderRecord, com.bros.fooforderingsystem.model.tables.pojos.Order, UUID> {

    /**
     * Create a new OrderDao without any configuration
     */
    public OrderDao() {
        super(Order.ORDER, com.bros.fooforderingsystem.model.tables.pojos.Order.class);
    }

    /**
     * Create a new OrderDao with an attached configuration
     */
    public OrderDao(Configuration configuration) {
        super(Order.ORDER, com.bros.fooforderingsystem.model.tables.pojos.Order.class, configuration);
    }

    @Override
    public UUID getId(com.bros.fooforderingsystem.model.tables.pojos.Order object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchRangeOfId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(Order.ORDER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchById(UUID... values) {
        return fetch(Order.ORDER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.bros.fooforderingsystem.model.tables.pojos.Order fetchOneById(UUID value) {
        return fetchOne(Order.ORDER.ID, value);
    }

    /**
     * Fetch records that have <code>student_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchRangeOfStudentId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Order.ORDER.STUDENT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>student_id IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchByStudentId(String... values) {
        return fetch(Order.ORDER.STUDENT_ID, values);
    }

    /**
     * Fetch records that have <code>vendor_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchRangeOfVendorId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(Order.ORDER.VENDOR_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>vendor_id IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchByVendorId(UUID... values) {
        return fetch(Order.ORDER.VENDOR_ID, values);
    }

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchRangeOfStatus(String lowerInclusive, String upperInclusive) {
        return fetchRange(Order.ORDER.STATUS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchByStatus(String... values) {
        return fetch(Order.ORDER.STATUS, values);
    }

    /**
     * Fetch records that have <code>otp BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchRangeOfOtp(String lowerInclusive, String upperInclusive) {
        return fetchRange(Order.ORDER.OTP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>otp IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchByOtp(String... values) {
        return fetch(Order.ORDER.OTP, values);
    }

    /**
     * Fetch records that have <code>created_at BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchRangeOfCreatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Order.ORDER.CREATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(Order.ORDER.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>updated_at BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchRangeOfUpdatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Order.ORDER.UPDATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>updated_at IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.Order> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(Order.ORDER.UPDATED_AT, values);
    }
}
