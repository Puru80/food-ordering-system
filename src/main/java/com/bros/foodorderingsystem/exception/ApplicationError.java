package com.bros.foodorderingsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public class ApplicationError extends Exception {

    private final HttpStatus httpStatus;
    private final ErrorDetails errorDetails;

}
