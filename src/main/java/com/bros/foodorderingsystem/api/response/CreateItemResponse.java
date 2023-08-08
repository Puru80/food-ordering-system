package com.bros.foodorderingsystem.api.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateItemResponse {

    private String itemId;
    private String name;
    private String description;

}
