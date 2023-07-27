package com.bros.foodorderingsystem.repository;

import com.bros.foodorderingsystem.api.request.CreateVendorRequest;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VendorRepository {

    @Autowired
    DSLContext dslContext;

    public void createVendor(CreateVendorRequest createVendorRequest) {

    }

}
