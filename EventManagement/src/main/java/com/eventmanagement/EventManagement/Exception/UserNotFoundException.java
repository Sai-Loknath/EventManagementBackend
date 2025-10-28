package com.eventmanagement.EventManagement.Exception;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String message) {
        super(message);
    }
}
