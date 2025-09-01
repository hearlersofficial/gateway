package com.hearlers.gateway.auth.exception;

public class OauthProcessingErrorException extends RuntimeException {
    public OauthProcessingErrorException(String message) {
        super(message);
    }

    public OauthProcessingErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
