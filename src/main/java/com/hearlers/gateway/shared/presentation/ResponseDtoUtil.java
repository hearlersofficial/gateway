package com.hearlers.gateway.shared.presentation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.hearlers.gateway.presentation.rest.exception.HttpException;
import com.hearlers.gateway.presentation.rest.response.HttpResultCode;

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
    
    /**
     * HttpResultCode를 사용하여 에러 응답을 생성합니다.
     * 
     * @param resultCode 에러 결과 코드
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> errorResponse(HttpResultCode resultCode) {
        return errorResponse(
            resultCode.getStatus(),
            resultCode.getCode(),
            resultCode.getMessage(),
            null
        );
    }
    
    /**
     * HttpResultCode와 추가 데이터를 사용하여 에러 응답을 생성합니다.
     * 
     * @param resultCode 에러 결과 코드
     * @param data 추가 데이터
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> errorResponse(HttpResultCode resultCode, Object data) {
        return errorResponse(
            resultCode.getStatus(),
            resultCode.getCode(),
            resultCode.getMessage(),
            data
        );
    }
    
    /**
     * HttpResultCode와 커스텀 메시지를 사용하여 에러 응답을 생성합니다.
     * 
     * @param resultCode 에러 결과 코드
     * @param message 커스텀 메시지
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> errorResponse(HttpResultCode resultCode, String message) {
        return errorResponse(
            resultCode.getStatus(),
            resultCode.getCode(),
            message,
            null
        );
    }
    
    /**
     * HttpException에서 에러 응답을 생성합니다.
     * 
     * @param ex HttpException 인스턴스
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> errorResponse(HttpException ex) {
        HttpResultCode resultCode = ex.getHttpResultCode();
        return errorResponse(
            resultCode.getStatus(),
            resultCode.getCode(),
            ex.getMessage(),
            ex.getData()
        );
    }
    
    /**
     * 파라미터 누락 예외에서 에러 응답을 생성합니다.
     * 
     * @param ex MissingServletRequestParameterException 인스턴스
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> errorResponse(MissingServletRequestParameterException ex) {
        String message = String.format("필수 파라미터 '%s'가 누락되었습니다.", ex.getParameterName());
        return errorResponse(HttpResultCode.MISSING_REQUEST_PARAMETER, message);
    }
    
    /**
     * 헤더 누락 예외에서 에러 응답을 생성합니다.
     * 
     * @param ex MissingRequestHeaderException 인스턴스
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> errorResponse(MissingRequestHeaderException ex) {
        String message = String.format("필수 헤더 '%s'가 누락되었습니다.", ex.getHeaderName());
        return errorResponse(HttpResultCode.MISSING_REQUEST_HEADER, message);
    }
    
    /**
     * 리소스를 찾을 수 없는 예외에서 에러 응답을 생성합니다.
     * 
     * @param ex NoHandlerFoundException 인스턴스
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> errorResponse(NoHandlerFoundException ex) {
        String message = String.format("요청한 리소스를 찾을 수 없습니다: %s %s", 
                ex.getHttpMethod(), ex.getRequestURL());
        return errorResponse(HttpResultCode.NOT_FOUND, message);
    }
    
    /**
     * 파라미터 타입 불일치 예외에서 에러 응답을 생성합니다.
     * 
     * @param ex MethodArgumentTypeMismatchException 인스턴스
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> errorResponse(MethodArgumentTypeMismatchException ex) {
        String paramName = ex.getName();
        String requiredType = ex.getRequiredType() != null ? ex.getRequiredType().getSimpleName() : "unknown";
        String message = String.format("파라미터 '%s'의 타입이 올바르지 않습니다. 필요한 타입: %s", 
                paramName, requiredType);
        return errorResponse(HttpResultCode.INVALID_INPUT, message);
    }
    
    /**
     * BAD_REQUEST 에러 응답을 생성합니다.
     * 
     * @param message 에러 메시지
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> badRequest(String message) {
        return errorResponse(HttpResultCode.INVALID_INPUT, message);
    }
    
    /**
     * UNAUTHORIZED 에러 응답을 생성합니다.
     * 
     * @param message 에러 메시지
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> unauthorized(String message) {
        return errorResponse(HttpResultCode.UNAUTHORIZED, message);
    }
    
    /**
     * FORBIDDEN 에러 응답을 생성합니다.
     * 
     * @param message 에러 메시지
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> forbidden(String message) {
        return errorResponse(HttpResultCode.FORBIDDEN, message);
    }
    
    /**
     * NOT_FOUND 에러 응답을 생성합니다.
     * 
     * @param message 에러 메시지
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> notFound(String message) {
        return errorResponse(HttpResultCode.NOT_FOUND, message);
    }
    
    /**
     * SERVER_ERROR 에러 응답을 생성합니다.
     * 
     * @param message 에러 메시지
     * @return 에러 응답 ResponseEntity
     */
    public static ResponseEntity<ResponseDto.Error<Object>> serverError(String message) {
        return errorResponse(HttpResultCode.SERVER_SYSTEM_ERROR, message);
    }
} 