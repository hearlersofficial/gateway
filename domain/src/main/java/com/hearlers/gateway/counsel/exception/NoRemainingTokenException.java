package com.hearlers.gateway.counsel.exception;

public class NoRemainingTokenException extends RuntimeException {
    public NoRemainingTokenException(String message) {
        super(message);
    }

    public NoRemainingTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
