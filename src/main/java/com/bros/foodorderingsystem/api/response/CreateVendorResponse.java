package com.bros.foodorderingsystem.api.response;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CreateVendorResponse {
    private UUID vendorId;
    private String name;
    private String email;
}
