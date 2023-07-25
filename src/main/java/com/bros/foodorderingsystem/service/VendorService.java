package com.bros.foodorderingsystem.service;

import com.bros.foodorderingsystem.api.request.CreateVendorRequest;
import com.bros.foodorderingsystem.model.tables.Vendor;
import com.bros.foodorderingsystem.model.tables.records.VendorRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.bros.foodorderingsystem.model.tables.Vendor.VENDOR;

@Service
public class VendorService {

    @Autowired
    DSLContext dslContext;

    public void createVendor(CreateVendorRequest createVendorRequest) {
        dslContext.insertInto(VENDOR)
            .columns(VENDOR.NAME,
                VENDOR.EMAIL,
                VENDOR.LOCATION,
                VENDOR.ACCEPTINGORDERS,
                VENDOR.QRCODE,
                VENDOR.SHOPIMAGE)
            .values(createVendorRequest.getVendorName(),
                createVendorRequest.getVendorEmail(),
                createVendorRequest.getVendorLocation(),
                createVendorRequest.isAcceptingOrders(),
                createVendorRequest.getQrCode(),
                createVendorRequest.getShopImage())
            .execute();

    }

}
