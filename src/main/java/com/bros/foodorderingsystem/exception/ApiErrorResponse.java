package com.bros.foodorderingsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ApiErrorResponse {

    private int errorCode;
    private String message;

}
