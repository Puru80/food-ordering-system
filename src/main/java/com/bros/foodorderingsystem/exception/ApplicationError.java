package com.bros.foodorderingsystem.exception;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Builder
@Getter
public class ApplicationError extends Exception {

    private final HttpStatus httpStatus;
    private final ErrorDetails errorDetails;

}
