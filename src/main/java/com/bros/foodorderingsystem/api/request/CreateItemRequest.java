package com.bros.foodorderingsystem.api.request;

import lombok.Data;

@Data
public class CreateItemRequest {

    private String name;
    private Double price;
    private String description;
    private String image;
    private String vendorId;
    private Integer preparationTime;

}
