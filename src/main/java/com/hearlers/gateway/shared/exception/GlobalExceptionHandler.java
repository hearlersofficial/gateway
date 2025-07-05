package com.hearlers.gateway.shared.exception;

import com.hearlers.gateway.shared.response.ResponseDtoUtil;

import com.hearlers.gateway.shared.response.ResponseDto;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import jakarta.servlet.ServletException;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * HttpException 처리
     */
    @ExceptionHandler(HttpException.class)
    public ResponseEntity<ResponseDto.Error<Object>> handleHttpException(HttpException e) {
        log.error("HttpException 발생: {}", e.getMessage(), e);
        HttpResultCode resultCode = e.getHttpResultCode();
        
        return ResponseDtoUtil.errorResponse(
            resultCode.getStatus(), 
            resultCode.getCode(),
            resultCode.getMessage(), 
            e.getData()
        );
    }

    /**
     * gRPC 예외 처리
     */
    @ExceptionHandler(StatusRuntimeException.class)
    public ResponseEntity<ResponseDto.Error<Object>> handleGrpcException(StatusRuntimeException e) {
        var protoStatus = StatusProto.fromThrowable(e);
        String errorMessage = null;
        
        if (protoStatus != null && protoStatus.getDetailsCount() > 0) {
            errorMessage = protoStatus.getDetails(0).toString();
        }
        
        if (errorMessage == null) {
            // fallback으로 기존 값 사용
            errorMessage = e.getStatus().getDescription();
        }
        
        var statusCode = e.getStatus().getCode();
        log.error("gRPC 상태 코드: {}, 메시지: {}", statusCode, errorMessage);
        
        GrpcStatusCode resultCode = GrpcStatusCode.fromGrpcCode(statusCode);
        
        return ResponseDtoUtil.errorResponse(
            resultCode.getHttpStatus(), 
            resultCode.getErrorCode(),
            resultCode.getErrorDescription(), 
            errorMessage
        );
    }

    /**
     * ServletException 처리
     */
    @ExceptionHandler(ServletException.class)
    public ResponseEntity<ResponseDto.Error<Object>> handleServletException(ServletException e) {
        Throwable rootCause = getRootCause(e);
    
        // gRPC 예외가 ServletException에 래핑된 경우
        if (rootCause instanceof StatusRuntimeException grpcEx) {
            return handleGrpcException(grpcEx);
        }

        // 특정 예외 타입에 따른 처리
        if (rootCause instanceof MissingServletRequestParameterException missingParamEx) {
            return ResponseDtoUtil.errorResponse(HttpResultCode.MISSING_REQUEST_PARAMETER, "요청 파라미터가 누락되었습니다: " + missingParamEx.getParameterName());
        }

        if (rootCause instanceof MissingRequestHeaderException missingHeaderEx) {
            return ResponseDtoUtil.errorResponse(HttpResultCode.MISSING_REQUEST_HEADER, "요청 헤더가 누락되었습니다: " + missingHeaderEx.getHeaderName());
        }

        if (rootCause instanceof HttpRequestMethodNotSupportedException methodEx) {
            return ResponseDtoUtil.errorResponse(
                    HttpResultCode.METHOD_NOT_ALLOWED,
                    "지원하지 않는 HTTP Method입니다."
            );
        }

        // 기본 서버 오류 처리
    
        // fallback 처리
        log.error("ServletException 발생: {}", e.getMessage(), e);
        HttpResultCode resultCode = HttpResultCode.SERVER_SYSTEM_ERROR;
        
        return ResponseDtoUtil.errorResponse(
            resultCode.getStatus(), 
            resultCode.getCode(), 
            resultCode.getMessage(), 
            null
        );
    }
    
    /**
     * IllegalArgumentException 처리
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ResponseDto.Error<Object>> handleIllegalArgumentException(IllegalArgumentException e) {
        log.error("잘못된 인자: {}", e.getMessage());
        HttpResultCode resultCode = HttpResultCode.INVALID_INPUT;
        
        return ResponseDtoUtil.errorResponse(
            resultCode.getStatus(),
            resultCode.getCode(), 
            resultCode.getMessage(), 
            e.getMessage()
        );
    }

    /**
     * Exception 처리
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDto.Error<Object>> handleException(Exception e) {
        log.error("예상치 못한 예외 발생: {}", e.getMessage(), e);
        
        // 실제 원인 예외 파악
        Throwable rootCause = getRootCause(e);

        HttpResultCode resultCode = HttpResultCode.SERVER_SYSTEM_ERROR;
        
        return ResponseDtoUtil.errorResponse(
            resultCode.getStatus(),
            resultCode.getCode(), 
            resultCode.getMessage(), 
            e.getMessage()
        );
    }
    
    /**
     * 예외의 실제 원인을 찾는 메서드
     */
    private Throwable getRootCause(Throwable throwable) {
        Throwable rootCause = throwable;
        while (rootCause.getCause() != null && rootCause.getCause() != rootCause) {
            rootCause = rootCause.getCause();
        }
        return rootCause;
    }
}