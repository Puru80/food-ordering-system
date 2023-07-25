package com.bros.foodorderingsystem.api.request;

import lombok.Data;

@Data
public class CreateVendorRequest {

    private String vendorName;
    private String vendorEmail;
    private String vendorLocation;
    private boolean acceptingOrders;
    private String qrCode;
    private String shopImage;

}
