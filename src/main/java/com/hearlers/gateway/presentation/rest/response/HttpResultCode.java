package com.hearlers.gateway.presentation.rest.response;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum HttpResultCode {
    // 공통(범용) 에러
    INVALID_INPUT(HttpStatus.BAD_REQUEST, "HTTP_INVALID_INPUT", "입력값이 올바르지 않습니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "HTTP_NOT_FOUND", "요청한 정보를 찾을 수 없습니다."),
    DB_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "HTTP_DB_ERROR", "데이터베이스 오류가 발생했습니다."),
    SERVER_SYSTEM_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "HTTP_SERVER_SYSTEM_ERROR", "서버 시스템 오류가 발생했습니다."),

    // 인증 에러
    INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "INVALID_TOKEN", "유효하지 않은 토큰입니다."),
    REFRESH_TOKEN_REQUIRED(HttpStatus.UNAUTHORIZED, "REFRESH_TOKEN_REQUIRED", "Refresh Token이 필요합니다."),
    REFRESH_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "REFRESH_TOKEN_EXPIRED", "Refresh Token이 만료되었습니다."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "인증이 필요합니다."),
    FORBIDDEN(HttpStatus.FORBIDDEN, "FORBIDDEN", "권한이 없습니다.");


    private final HttpStatus status;
    private final String code;
    private final String message;
}
