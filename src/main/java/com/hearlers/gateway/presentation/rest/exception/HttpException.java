package com.hearlers.gateway.presentation.rest.exception;


import com.hearlers.gateway.presentation.rest.response.HttpResultCode;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HttpException extends RuntimeException {
    private final HttpResultCode httpResultCode;
    private Object data;
}

