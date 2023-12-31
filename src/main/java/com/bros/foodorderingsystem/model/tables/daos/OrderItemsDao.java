/*
 * This file is generated by jOOQ.
 */
package com.bros.foodorderingsystem.model.tables.daos;


import com.bros.foodorderingsystem.model.tables.OrderItems;
import com.bros.foodorderingsystem.model.tables.records.OrderItemsRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderItemsDao extends DAOImpl<OrderItemsRecord, com.bros.foodorderingsystem.model.tables.pojos.OrderItems, UUID> {

    /**
     * Create a new OrderItemsDao without any configuration
     */
    public OrderItemsDao() {
        super(OrderItems.ORDER_ITEMS, com.bros.foodorderingsystem.model.tables.pojos.OrderItems.class);
    }

    /**
     * Create a new OrderItemsDao with an attached configuration
     */
    public OrderItemsDao(Configuration configuration) {
        super(OrderItems.ORDER_ITEMS, com.bros.foodorderingsystem.model.tables.pojos.OrderItems.class, configuration);
    }

    @Override
    public UUID getId(com.bros.foodorderingsystem.model.tables.pojos.OrderItems object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchRangeOfId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(OrderItems.ORDER_ITEMS.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchById(UUID... values) {
        return fetch(OrderItems.ORDER_ITEMS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.bros.foodorderingsystem.model.tables.pojos.OrderItems fetchOneById(UUID value) {
        return fetchOne(OrderItems.ORDER_ITEMS.ID, value);
    }

    /**
     * Fetch records that have <code>order_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchRangeOfOrderId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(OrderItems.ORDER_ITEMS.ORDER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchByOrderId(UUID... values) {
        return fetch(OrderItems.ORDER_ITEMS.ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>item_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchRangeOfItemId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(OrderItems.ORDER_ITEMS.ITEM_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>item_id IN (values)</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchByItemId(UUID... values) {
        return fetch(OrderItems.ORDER_ITEMS.ITEM_ID, values);
    }

    /**
     * Fetch records that have <code>quantity BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchRangeOfQuantity(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(OrderItems.ORDER_ITEMS.QUANTITY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>quantity IN (values)</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchByQuantity(Integer... values) {
        return fetch(OrderItems.ORDER_ITEMS.QUANTITY, values);
    }

    /**
     * Fetch records that have <code>created_at BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchRangeOfCreatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(OrderItems.ORDER_ITEMS.CREATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(OrderItems.ORDER_ITEMS.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>updated_at BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchRangeOfUpdatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(OrderItems.ORDER_ITEMS.UPDATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>updated_at IN (values)</code>
     */
    public List<com.bros.foodorderingsystem.model.tables.pojos.OrderItems> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(OrderItems.ORDER_ITEMS.UPDATED_AT, values);
    }
}
