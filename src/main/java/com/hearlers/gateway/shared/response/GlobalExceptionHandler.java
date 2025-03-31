package com.hearlers.gateway.shared.response;

import com.hearlers.gateway.presentation.grpc.response.GrpcStatusCode;
import com.hearlers.gateway.presentation.rest.exception.HttpException;
import com.hearlers.gateway.presentation.rest.response.HttpResultCode;
import com.hearlers.gateway.shared.presentation.ResponseDto;
import com.hearlers.gateway.shared.presentation.ResponseDtoUtil;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import jakarta.servlet.ServletException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * HttpException 처리
     */
    @ExceptionHandler(HttpException.class)
    public <T> ResponseEntity<ResponseDto.Error<T>> handleHttpException(HttpException e) {
        log.error("HttpException 발생: {}", e.getMessage(), e);
        var resultCode = e.getHttpResultCode();

        @SuppressWarnings("unchecked")
        T data = (T) e.getData();

        return ResponseDtoUtil.errorResponse(resultCode.getStatus(), resultCode.getCode(),
                resultCode.getMessage(), data);
    }

    /**
     * gRPC 예외 처리
     */
    @ExceptionHandler(StatusRuntimeException.class)
    public <T> ResponseEntity<ResponseDto.Error<T>> handleGrpcException(StatusRuntimeException e) {
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

        log.error("gRPC 상태 코드 : {}, 메시지 : {}", statusCode, errorMessage);

        var resultCode = GrpcStatusCode.fromGrpcCode(statusCode);

        @SuppressWarnings("unchecked")
        T data = (T) errorMessage;

        return ResponseDtoUtil.errorResponse(resultCode.getHttpStatus(), resultCode.getErrorCode(),
                resultCode.getErrorDescription(), data);
    }

    /**
     * ServletException 처리
     */
    @ExceptionHandler(ServletException.class)
    public <T> ResponseEntity<ResponseDto.Error<T>> handleServletException(ServletException e) {
        // ServletException인 경우 원인 예외 확인
        Throwable rootCause = ((ServletException) e).getRootCause();

        // gRPC 예외가 ServletException 내부에 래핑되어 있는 경우
        if (rootCause instanceof StatusRuntimeException) {
            return handleGrpcException((StatusRuntimeException) rootCause);
        } else {
            log.error("ServletException 발생 : {}", e.getMessage());
            var resultCode = HttpResultCode.SERVER_SYSTEM_ERROR;
            return ResponseDtoUtil.errorResponse(resultCode.getStatus(), resultCode.getCode(),
                    resultCode.getMessage(), null);
        }

    }

    /**
     * IllegalArgumentException 처리
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public <T> ResponseEntity<ResponseDto.Error<T>> handleIllegalArgumentException(IllegalArgumentException e) {
        log.error("잘못된 인자: {}", e.getMessage());
        @SuppressWarnings("unchecked")
        T data = (T) e.getMessage();
        return ResponseDtoUtil.errorResponse(HttpResultCode.INVALID_INPUT.getStatus(),
                HttpResultCode.INVALID_INPUT.getCode(), HttpResultCode.INVALID_INPUT.getMessage(), data);
    }

    /**
     * Exception 처리
     */
    @ExceptionHandler(Exception.class)
    public <T> ResponseEntity<ResponseDto.Error<T>> handleException(Exception e) {
        log.error("예상치 못한 예외 발생: {}", e.getMessage(), e);
        @SuppressWarnings("unchecked")
        T data = (T) e.getMessage();
        return ResponseDtoUtil.errorResponse(HttpResultCode.SERVER_SYSTEM_ERROR.getStatus(),
                HttpResultCode.SERVER_SYSTEM_ERROR.getCode(), HttpResultCode.SERVER_SYSTEM_ERROR.getMessage(), data);
    }
}