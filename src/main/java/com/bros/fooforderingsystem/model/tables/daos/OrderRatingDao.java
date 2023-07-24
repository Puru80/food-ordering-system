/*
 * This file is generated by jOOQ.
 */
package com.bros.fooforderingsystem.model.tables.daos;


import com.bros.fooforderingsystem.model.tables.OrderRating;
import com.bros.fooforderingsystem.model.tables.records.OrderRatingRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderRatingDao extends DAOImpl<OrderRatingRecord, com.bros.fooforderingsystem.model.tables.pojos.OrderRating, UUID> {

    /**
     * Create a new OrderRatingDao without any configuration
     */
    public OrderRatingDao() {
        super(OrderRating.ORDER_RATING, com.bros.fooforderingsystem.model.tables.pojos.OrderRating.class);
    }

    /**
     * Create a new OrderRatingDao with an attached configuration
     */
    public OrderRatingDao(Configuration configuration) {
        super(OrderRating.ORDER_RATING, com.bros.fooforderingsystem.model.tables.pojos.OrderRating.class, configuration);
    }

    @Override
    public UUID getId(com.bros.fooforderingsystem.model.tables.pojos.OrderRating object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchRangeOfId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(OrderRating.ORDER_RATING.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchById(UUID... values) {
        return fetch(OrderRating.ORDER_RATING.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.bros.fooforderingsystem.model.tables.pojos.OrderRating fetchOneById(UUID value) {
        return fetchOne(OrderRating.ORDER_RATING.ID, value);
    }

    /**
     * Fetch records that have <code>order_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchRangeOfOrderId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(OrderRating.ORDER_RATING.ORDER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchByOrderId(UUID... values) {
        return fetch(OrderRating.ORDER_RATING.ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>rating BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchRangeOfRating(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(OrderRating.ORDER_RATING.RATING, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rating IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchByRating(Integer... values) {
        return fetch(OrderRating.ORDER_RATING.RATING, values);
    }

    /**
     * Fetch records that have <code>comment BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchRangeOfComment(String lowerInclusive, String upperInclusive) {
        return fetchRange(OrderRating.ORDER_RATING.COMMENT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>comment IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchByComment(String... values) {
        return fetch(OrderRating.ORDER_RATING.COMMENT, values);
    }

    /**
     * Fetch records that have <code>created_at BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchRangeOfCreatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(OrderRating.ORDER_RATING.CREATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(OrderRating.ORDER_RATING.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>updated_at BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchRangeOfUpdatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(OrderRating.ORDER_RATING.UPDATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>updated_at IN (values)</code>
     */
    public List<com.bros.fooforderingsystem.model.tables.pojos.OrderRating> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(OrderRating.ORDER_RATING.UPDATED_AT, values);
    }
}
