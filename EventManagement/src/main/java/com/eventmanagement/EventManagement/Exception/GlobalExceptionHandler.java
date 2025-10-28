package com.eventmanagement.EventManagement.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.eventmanagement.EventManagement.Utilities.ApiErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ApiErrorResponse> handleUserAlreadyExists(UserAlreadyExistsException exc) {
        return buildErrorResponse(exc,HttpStatus.CONFLICT);
    }
    
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleUserNotFound(UserNotFoundException exc){
    	return buildErrorResponse(exc,HttpStatus.NOT_FOUND);
    }

   
    
    private ResponseEntity<ApiErrorResponse> buildErrorResponse(Exception exc, HttpStatus status){
    	ApiErrorResponse error=new ApiErrorResponse();
    	error.setStatus(status.value());
    	error.setMessage(exc.getMessage());
    	error.setTimestamp(System.currentTimeMillis());
    	return new ResponseEntity<>(error,status);
    }
}

