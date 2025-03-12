package com.hearlers.gateway.shared.presentation;

import org.springframework.http.HttpStatus;

public class ResponseDtoUtil {

    private ResponseDtoUtil() {
        // 유틸리티 클래스는 인스턴스화 방지
    }

    /**
     * 성공 응답 DTO를 생성합니다.
     * 
     * @param <T> 응답 데이터 타입
     * @param data 응답 데이터
     * @param message 응답 메시지
     * @return 성공 응답 DTO
     */
    public static <T> ResponseDto.Success<T> success(T data, String message) {
        return ResponseDto.Success.<T>builder()
                .message(message)
                .data(data)
                .build();
    }

    /**
     * 에러 응답 DTO를 생성합니다.
     * 
     * @param <T> 응답 데이터 타입
     * @param status HTTP 상태 코드
     * @param code 에러 코드
     * @param message 에러 메시지
     * @param data 추가 데이터
     * @return 에러 응답 DTO
     */
    public static <T> ResponseDto.Error<T> error(HttpStatus status, String code, String message, T data) {
        return ResponseDto.Error.<T>builder()
                .status(status)
                .code(code)
                .message(message)
                .data(data)
                .build();
    }
} 