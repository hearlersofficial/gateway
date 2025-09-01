package com.hearlers.gateway.auth.exception;

public class AuthUserNotFoundException extends RuntimeException {
    public AuthUserNotFoundException(String message) {
        super(message);
    }

    public AuthUserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
