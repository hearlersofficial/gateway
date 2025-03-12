package com.hearlers.gateway.shared.presentation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseDtoUtil {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private ResponseDtoUtil() {
        // 유틸리티 클래스는 인스턴스화 방지
    }

    /**
     * 기본 성공 응답 DTO를 생성합니다.
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
                .timestamp(LocalDateTime.now().format(DATE_FORMATTER))
                .build();
    }
    
    /**
     * 기본 성공 응답 ResponseEntity를 생성합니다.
     * 
     * @param <T> 응답 데이터 타입
     * @param data 응답 데이터
     * @param message 응답 메시지
     * @return 성공 응답 ResponseEntity
     */
    public static <T> ResponseEntity<ResponseDto.Success<T>> okResponse(T data, String message) {
        return ResponseEntity.ok(success(data, message));
    }
    
    /**
     * 리소스 생성 성공 응답 ResponseEntity를 생성합니다.
     * 
     * @param <T> 응답 데이터 타입
     * @param data 응답 데이터
     * @param message 응답 메시지
     * @return 성공 응답 ResponseEntity (HTTP 201)
     */
    public static <T> ResponseEntity<ResponseDto.Success<T>> createdResponse(T data, String message) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(success(data, message));
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
                .timestamp(LocalDateTime.now().format(DATE_FORMATTER))
                .build();
    }
    
    /**
     * 에러 응답 ResponseEntity를 생성합니다.
     * 
     * @param <T> 응답 데이터 타입
     * @param status HTTP 상태 코드
     * @param code 에러 코드
     * @param message 에러 메시지
     * @param data 추가 데이터
     * @return 에러 응답 ResponseEntity
     */
    public static <T> ResponseEntity<ResponseDto.Error<T>> errorResponse(
            HttpStatus status, String code, String message, T data) {
        return ResponseEntity
                .status(status)
                .body(error(status, code, message, data));
    }
    
    /**
     * 상세 정보가 포함된 에러 응답 DTO를 생성합니다.
     * 
     * @param <T> 응답 데이터 타입
     * @param status HTTP 상태 코드
     * @param code 에러 코드
     * @param message 에러 메시지
     * @param data 추가 데이터
     * @param details 상세 에러 정보
     * @return 에러 응답 DTO
     */
    public static <T> ResponseDto.Error<T> errorWithDetails(HttpStatus status, String code, 
            String message, T data, List<String> details) {
        return ResponseDto.Error.<T>builder()
                .status(status)
                .code(code)
                .message(message)
                .data(data)
                .details(details)
                .timestamp(LocalDateTime.now().format(DATE_FORMATTER))
                .build();
    }
} 