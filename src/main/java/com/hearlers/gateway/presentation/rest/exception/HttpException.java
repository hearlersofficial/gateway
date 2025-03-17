package com.hearlers.gateway.presentation.rest.exception;


import com.hearlers.gateway.presentation.rest.response.HttpResultCode;

import lombok.Getter;

@Getter
public class HttpException extends RuntimeException {
    private final HttpResultCode httpResultCode;
    private Object data;
    
    /**
     * 기본 생성자 - 결과 코드만 지정
     */
    public HttpException(HttpResultCode httpResultCode) {
        super(httpResultCode.getMessage());
        this.httpResultCode = httpResultCode;
    }
    
    /**
     * 결과 코드와 상세 메시지를 덮어씌우는 생성자
     */
    public HttpException(HttpResultCode httpResultCode, String message) {
        super(message);
        this.httpResultCode = httpResultCode;
        this.data = message;
    }
    
    /**
     * 결과 코드와 데이터를 덮어씌우는 생성자
     */
    public HttpException(HttpResultCode httpResultCode, Object data) {
        super(httpResultCode.getMessage());
        this.httpResultCode = httpResultCode;
        this.data = data;
    }
}

