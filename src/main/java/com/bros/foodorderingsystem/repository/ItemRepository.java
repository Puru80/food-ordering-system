package com.bros.foodorderingsystem.repository;

import com.bros.foodorderingsystem.api.request.CreateItemRequest;
import com.bros.foodorderingsystem.exception.ApplicationError;
import com.bros.foodorderingsystem.exception.ErrorDetails;
import com.bros.foodorderingsystem.model.tables.pojos.Item;
import com.bros.foodorderingsystem.model.tables.records.ItemRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Slf4j
@Repository
public class ItemRepository {

    @Autowired
    private DSLContext dslContext;

    public Item createItem(CreateItemRequest createItemRequest) throws ApplicationError {

        ItemRecord newRecord;

        try {
            newRecord = dslContext.newRecord(com.bros.foodorderingsystem.model.tables.Item.ITEM);
        } catch (Exception e) {
            log.error("Error in creating campaign", e);
            throw new ApplicationError(
                HttpStatus.INTERNAL_SERVER_ERROR,
                ErrorDetails.builder()
                    .code(50001)
                    .detailedMessage("Error in creating item")
                    .build()
            );
        }

        newRecord.setId(UUID.randomUUID());
        newRecord.setName(createItemRequest.getName());
        newRecord.setPrice(createItemRequest.getPrice());
        newRecord.setVendorId(UUID.fromString(createItemRequest.getVendorId()));
        newRecord.setDescription(createItemRequest.getDescription());
        newRecord.setPreparationtime(createItemRequest.getPreparationTime());

        int rowsInserted = newRecord.insert();

        if (rowsInserted == 0) {
//            String errorMsg = String.format("Error creating campaign of %s", request.getDescription1());
//            log.error(errorMsg);
            throw new ApplicationError(
                HttpStatus.INTERNAL_SERVER_ERROR,
                ErrorDetails.builder()
                    .code(50001)
                    .detailedMessage("Error in creating item")
                    .build()
            );
        }

        return newRecord.into(Item.class);

    }
}
