package com.bros.foodorderingsystem.exception;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorDetails {

    public static final int DEFAULT_ERROR_CODE = 5001;
    private final int code;
    private final String userMessage;
    private final String detailedMessage;

}
