package com.hearlers.gateway.presentation.rest.response;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum HttpResultCode {
    // 공통(범용) 에러
    INVALID_INPUT(HttpStatus.BAD_REQUEST, "HTTP_INVALID_INPUT", "입력값이 올바르지 않습니다."),
    MISSING_REQUEST_PARAMETER(HttpStatus.BAD_REQUEST, "HTTP_MISSING_REQUEST_PARAMETER", "필수 파라미터가 누락되었습니다."),
    MISSING_REQUEST_HEADER(HttpStatus.BAD_REQUEST, "HTTP_MISSING_REQUEST_HEADER", "필수 요청 헤더가 누락되었습니다."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "HTTP_METHOD_NOT_ALLOWED", "허용되지 않은 HTTP 메서드입니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "HTTP_NOT_FOUND", "요청한 정보를 찾을 수 없습니다."),
    DB_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "HTTP_DB_ERROR", "데이터베이스 오류가 발생했습니다."),
    SERVER_SYSTEM_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "HTTP_SERVER_SYSTEM_ERROR", "서버 시스템 오류가 발생했습니다."),

    // 인증 에러
    INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "INVALID_TOKEN", "유효하지 않은 토큰입니다."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "인증이 필요합니다."),
    COOKIE_NOT_FOUND(HttpStatus.UNAUTHORIZED, "COOKIE_NOT_FOUND", "인증 쿠키가 없습니다."),
    ACCESS_TOKEN_REQUIRED(HttpStatus.UNAUTHORIZED, "ACCESS_TOKEN_REQUIRED", "Access Token이 필요합니다."),
    ACCESS_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "ACCESS_TOKEN_EXPIRED", "액세스 토큰이 만료되었습니다."),
    ACCESS_TOKEN_INVALID(HttpStatus.UNAUTHORIZED, "ACCESS_TOKEN_INVALID", "액세스 토큰이 유효하지 않습니다."),
    REFRESH_TOKEN_REQUIRED(HttpStatus.UNAUTHORIZED, "REFRESH_TOKEN_REQUIRED", "Refresh Token이 필요합니다."),
    REFRESH_TOKEN_NOT_FOUND(HttpStatus.UNAUTHORIZED, "REFRESH_TOKEN_NOT_FOUND", "해당 Refresh Token을 찾을 수 없습니다."),
    REFRESH_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "REFRESH_TOKEN_EXPIRED", "Refresh Token이 만료되었습니다."),
    REFRESH_TOKEN_INVALID(HttpStatus.UNAUTHORIZED, "REFRESH_TOKEN_INVALID", "Refresh Token이 유효하지 않습니다."),
    FORBIDDEN(HttpStatus.FORBIDDEN, "FORBIDDEN", "권한이 없습니다."),

    // 카카오 에러
    KAKAO_PROCESSING_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "KAKAO_PROCESSING_ERROR", "카카오 처리 중 오류가 발생했습니다.");


    private final HttpStatus status;
    private final String code;
    private final String message;
}
