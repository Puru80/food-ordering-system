package com.bros.foodorderingsystem.exception;

import lombok.Getter;

@Getter
public enum ServiceErrorCode {

    USER_NOT_FOUND( 40002, "User not found"),
    DB_ERROR_MSG(50001, "Something went wrong, please try after some time");

    private final int code;
    private final String message;

    ServiceErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
