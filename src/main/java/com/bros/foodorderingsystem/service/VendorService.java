package com.bros.foodorderingsystem.service;

import com.bros.foodorderingsystem.api.request.CreateVendorRequest;
import com.bros.foodorderingsystem.api.response.CreateVendorResponse;
import com.bros.foodorderingsystem.exception.ApplicationError;
import com.bros.foodorderingsystem.model.tables.pojos.Vendor;
import com.bros.foodorderingsystem.repository.VendorRepository;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VendorService {

    @Autowired
    DSLContext dslContext;

    @Autowired
    VendorRepository vendorRepository;

    public CreateVendorResponse createVendor(CreateVendorRequest createVendorRequest) throws ApplicationError {
        Vendor vendor;

        try {
            vendor = vendorRepository.createVendor(createVendorRequest);
//        } catch (CampaignServiceException e) {
//            log.error("Error creating campaign ", e);
//            throw new CampaignServiceException(CampaignErrorCode.CAMPAIGN_CREATE_ERROR);
        } catch (ApplicationError e) {
            log.error("Error creating campaign ", e);
            throw e;
        }

        return CreateVendorResponse.builder()
            .vendorId(vendor.getId())
            .name(vendor.getName())
            .email(vendor.getEmail())
            .build();

    }



}
