package com.bros.foodorderingsystem.exception;

import com.bros.foodorderingsystem.api.response.FoodResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ServiceExceptionHandler extends ResponseEntityExceptionHandler {

    /*
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ShuttleResponse> handleExceptionArgument(IllegalArgumentException ex, WebRequest webRequest)
    {
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        ApiException apiException = new ApiException(
            ex.getMessage(),
            httpStatus.value(),
            httpStatus.getReasonPhrase(),
            ZonedDateTime.now(ZoneId.of("Asia/Kolkata"))
        );

        return new ResponseEntity<ShuttleResponse>(new ShuttleResponse("Bad Request", apiException),
            httpStatus);
    }
    */

    @ExceptionHandler(ApplicationError.class)
    public ResponseEntity<FoodResponse> handleServiceException(ApplicationError e) {

        ErrorDetails errorDetails = e.getErrorDetails();
        ApiErrorResponse response = new ApiErrorResponse(
            errorDetails.getCode(),
            errorDetails.getUserMessage());

        return new ResponseEntity<>(
            new FoodResponse(
                errorDetails.getUserMessage(),
                response
            ),
            e.getHttpStatus());
    }


}
