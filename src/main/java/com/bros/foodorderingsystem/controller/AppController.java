package com.bros.foodorderingsystem.controller;

import com.bros.foodorderingsystem.api.request.CreateVendorRequest;
import com.bros.foodorderingsystem.api.response.CreateVendorResponse;
import com.bros.foodorderingsystem.api.response.FoodResponse;
import com.bros.foodorderingsystem.exception.ApplicationError;
import com.bros.foodorderingsystem.service.VendorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
@Slf4j
public class AppController {

    @Autowired
    private VendorService vendorService;

    @PostMapping("/vendor/create")
    public ResponseEntity<CreateVendorResponse> createVendor(@RequestBody CreateVendorRequest request) throws ApplicationError {
        return ResponseEntity.ok().body(vendorService.createVendor(request));
    }


}
