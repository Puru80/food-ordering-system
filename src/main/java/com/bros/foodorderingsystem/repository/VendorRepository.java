package com.bros.foodorderingsystem.repository;

import com.bros.foodorderingsystem.api.request.CreateVendorRequest;
import com.bros.foodorderingsystem.exception.ApplicationError;
import com.bros.foodorderingsystem.exception.ErrorDetails;
import com.bros.foodorderingsystem.model.tables.pojos.Vendor;
import com.bros.foodorderingsystem.model.tables.records.VendorRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.UUID;

import static com.bros.foodorderingsystem.model.Tables.VENDOR;

@Slf4j
@Repository
public class VendorRepository {

    @Autowired
    DSLContext dslContext;

    public Vendor createVendor(CreateVendorRequest createVendorRequest) throws ApplicationError {
        VendorRecord newRecord;

        try {
            newRecord = dslContext.newRecord(VENDOR);
        } catch (Exception e) {
            log.error("Error in creating campaign", e);
            throw new ApplicationError(
                HttpStatus.INTERNAL_SERVER_ERROR,
                ErrorDetails.builder()
                    .code(50001)
                    .detailedMessage("Error in creating vendor")
                    .build()
            );
        }

        newRecord.setId(UUID.randomUUID());
        newRecord.setName(createVendorRequest.getVendorName());
        newRecord.setEmail(createVendorRequest.getVendorEmail());
        newRecord.setLocation(createVendorRequest.getVendorLocation());
        newRecord.setAcceptingorders(createVendorRequest.isAcceptingOrders());
        newRecord.setQrcode(createVendorRequest.getQrCode());
        newRecord.setShopimage(createVendorRequest.getShopImage());

        newRecord.setCreatedAt(OffsetDateTime.now().toLocalDateTime());
        newRecord.setUpdatedAt(OffsetDateTime.now().toLocalDateTime());

        int rowsInserted = newRecord.insert();

        if (rowsInserted == 0) {
//            String errorMsg = String.format("Error creating campaign of %s", request.getDescription1());
//            log.error(errorMsg);
            throw new ApplicationError(
                HttpStatus.INTERNAL_SERVER_ERROR,
                ErrorDetails.builder()
                    .code(50001)
                    .detailedMessage("Error in creating campaign")
                    .build()
            );
        }

        return newRecord.into(Vendor.class);

    }

}
