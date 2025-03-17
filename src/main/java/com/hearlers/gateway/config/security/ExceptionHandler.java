package com.hearlers.gateway.config.security;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.hearlers.gateway.presentation.rest.exception.HttpException;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 다양한 예외 유형을 처리하는 핸들러
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ExceptionHandler {

    private final ResponseFormatter responseFormatter;

    /**
     * 예외 유형에 따라 적절한 응답 생성
     */
    public void handleException(HttpServletRequest request, HttpServletResponse response, Exception exception) {
        if (exception instanceof HttpException) {
            // 애플리케이션에서 명시적으로 던진 HttpException
            HttpException httpEx = (HttpException) exception;
            responseFormatter.formatErrorResponse(response, httpEx.getHttpResultCode(), httpEx.getData());
        } else if (exception instanceof AuthenticationException) {
            // Spring Security 인증 예외
            responseFormatter.formatErrorResponse(response, 
                HttpStatus.UNAUTHORIZED, 
                "E40101", 
                "인증이 필요합니다.", 
                exception.getMessage(),
                null);
        } else if (exception instanceof AccessDeniedException) {
            // 접근 권한 예외
            responseFormatter.formatErrorResponse(response, 
                HttpStatus.FORBIDDEN, 
                "E40301", 
                "접근 권한이 없습니다.", 
                exception.getMessage(),
                null);
        } else if (exception instanceof StatusRuntimeException) {
            // gRPC 예외가 직접 들어온 경우
            handleGrpcException(request, response, (StatusRuntimeException) exception);
        } else if (exception instanceof ServletException) {
            // ServletException인 경우, 원인 예외 확인
            Throwable rootCause = ((ServletException) exception).getRootCause();
            if (rootCause instanceof StatusRuntimeException) {
                // gRPC 예외가 ServletException 내부에 래핑되어 있는 경우
                handleGrpcException(request, response, (StatusRuntimeException) rootCause);
            } else {
                log.error("Servlet 예외 발생: {}", exception.getMessage());
                responseFormatter.formatErrorResponse(response, 
                    HttpStatus.INTERNAL_SERVER_ERROR, 
                    "E50002", 
                    "서블릿 처리 중 오류가 발생했습니다.", 
                    exception.getMessage(),
                    null);
            }
        } else {
            // 그 외 모든 예외는 서버 오류로 처리
            log.error("처리되지 않은 서버 오류: {}", exception.getMessage(), exception);
            responseFormatter.formatErrorResponse(response, 
                HttpStatus.INTERNAL_SERVER_ERROR, 
                "E50001", 
                "서버 내부 오류가 발생했습니다.", 
                exception.getMessage(),
                null);
        }
    }

    /**
     * gRPC 예외 처리
     */
    private void handleGrpcException(HttpServletRequest request, HttpServletResponse response, StatusRuntimeException exception) {
        com.google.rpc.Status protoStatus = StatusProto.fromThrowable(exception);
        String errorMessage = null;
        if (protoStatus != null && protoStatus.getDetailsCount() > 0) {
            // protoStatus.getDetailsList()를 통해 상세 정보를 확인할 수 있음.
            // 예를 들어, 첫번째 상세 정보에 문자열 형태의 메시지가 있다고 가정하면:
            errorMessage = protoStatus.getDetails(0).toString();
        }
        if (errorMessage == null) {
            // fallback으로 기존 값 사용
            errorMessage = exception.getStatus().getDescription();
        }
        Status.Code statusCode = exception.getStatus().getCode();
        
        log.error("gRPC 상태 코드: {}, 메시지: {}", statusCode, errorMessage);
        

        // 에러 응답 처리
        HttpStatus httpStatus;
        String errorCode;
        String errorDesc;

        switch (statusCode) {
            case INVALID_ARGUMENT:
                httpStatus = HttpStatus.BAD_REQUEST;
                errorCode = "E40001";
                errorDesc = "요청 형식이 올바르지 않습니다.";
                break;
            case FAILED_PRECONDITION:
                httpStatus = HttpStatus.BAD_REQUEST;
                errorCode = "E40002";
                errorDesc = "요청 처리 조건이 충족되지 않았습니다.";
                break;
            case OUT_OF_RANGE:
                httpStatus = HttpStatus.BAD_REQUEST;
                errorCode = "E40003";
                errorDesc = "요청 값이 허용 범위를 벗어났습니다.";
                break;
            case UNAUTHENTICATED:
                httpStatus = HttpStatus.UNAUTHORIZED;
                errorCode = "E40101";
                errorDesc = "인증이 필요합니다.";
                break;
            case PERMISSION_DENIED:
                httpStatus = HttpStatus.FORBIDDEN;
                errorCode = "E40301";
                errorDesc = "접근 권한이 없습니다.";
                break;
            case NOT_FOUND:
                httpStatus = HttpStatus.NOT_FOUND;
                errorCode = "E40401";
                errorDesc = "요청한 리소스를 찾을 수 없습니다.";
                break;
            case ALREADY_EXISTS:
                httpStatus = HttpStatus.CONFLICT;
                errorCode = "E40901";
                errorDesc = "이미 존재하는 리소스입니다.";
                break;
            case RESOURCE_EXHAUSTED:
                httpStatus = HttpStatus.TOO_MANY_REQUESTS;
                errorCode = "E42901";
                errorDesc = "요청 한도를 초과했습니다.";
                break;
            case DEADLINE_EXCEEDED:
                httpStatus = HttpStatus.GATEWAY_TIMEOUT;
                errorCode = "E50401";
                errorDesc = "요청 처리 시간이 초과되었습니다.";
                break;
            case UNAVAILABLE:
                httpStatus = HttpStatus.SERVICE_UNAVAILABLE;
                errorCode = "E50301";
                errorDesc = "서비스를 일시적으로 사용할 수 없습니다.";
                break;
            case UNIMPLEMENTED:
                httpStatus = HttpStatus.NOT_IMPLEMENTED;
                errorCode = "E50101";
                errorDesc = "요청한 기능이 구현되지 않았습니다.";
                break;
            case INTERNAL:
            case UNKNOWN:
            case DATA_LOSS:
            case ABORTED:
            default:
                httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
                errorCode = "E50001";
                errorDesc = "서버 내부 오류가 발생했습니다.";
                break;
        }

        responseFormatter.formatErrorResponse(response, httpStatus, errorCode, errorDesc, errorMessage, null);
    }
}
