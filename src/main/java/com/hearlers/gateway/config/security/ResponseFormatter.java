package com.hearlers.gateway.config.security;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hearlers.gateway.presentation.rest.response.HttpResultCode;
import com.hearlers.gateway.shared.presentation.ResponseDto;
import com.hearlers.gateway.shared.presentation.ResponseDtoUtil;

import io.grpc.Status;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 응답 형식을 생성하는 클래스
 * HttpServletResponse에 직접 응답을 작성하는 기능 담당
 * (ResponseDtoUtil은 ResponseEntity 반환에 특화됨)
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ResponseFormatter {
    
    private final ObjectMapper objectMapper;
    
    /**
     * HttpResultCode 기반으로 표준화된 에러 응답 설정
     */
    public void formatErrorResponse(HttpServletResponse response, HttpResultCode resultCode, Object data) {
        try {
            response.setStatus(resultCode.getStatus().value());
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            response.setCharacterEncoding(StandardCharsets.UTF_8.name());
            
            // ResponseDtoUtil 활용하여 중복 코드 제거
            ResponseDto.Error errorDto = ResponseDtoUtil.error(
                resultCode.getStatus(),
                resultCode.getCode(),
                resultCode.getMessage(),
                data
            );
            
            response.getWriter().write(objectMapper.writeValueAsString(errorDto));
            response.getWriter().flush();
        } catch (IOException e) {
            log.error("에러 응답 생성 중 오류 발생: {}", e.getMessage(), e);
        }
    }
    
    /**
     * 표준화된 에러 응답 설정 (직접 값 지정)
     */
    public void formatErrorResponse(HttpServletResponse response, HttpStatus status, String code, 
                                  String message, String detail, Object data) {
        try {
            response.setStatus(status.value());
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            response.setCharacterEncoding(StandardCharsets.UTF_8.name());
            
            // ResponseDtoUtil 활용하여 중복 코드 제거
            ResponseDto.Error errorDto;
            if (detail != null) {
                errorDto = ResponseDtoUtil.errorWithDetails(
                    status,
                    code,
                    message,
                    data,
                    Collections.singletonList(detail)
                );
            } else {
                errorDto = ResponseDtoUtil.error(
                    status,
                    code,
                    message,
                    data
                );
            }
            
            response.getWriter().write(objectMapper.writeValueAsString(errorDto));
            response.getWriter().flush();
        } catch (IOException e) {
            log.error("에러 응답 생성 중 오류 발생: {}", e.getMessage(), e);
        }
    }
    
    /**
     * gRPC 성공 응답 처리
     */
    public void handleGrpcSuccessResponse(HttpServletResponse response, Status.Code statusCode, String message) {
        // 204 No Content 응답 처리
        if (message.contains("HTTP status code 204")) {
            sendNoContentResponse(response);
            return;
        }
        
        // 일반적인 성공 응답은 그대로 전달
        try {
            response.setStatus(HttpStatus.OK.value());
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            response.getWriter().write(message);
            response.getWriter().flush();
        } catch (IOException e) {
            log.error("응답 처리 중 오류: {}", e.getMessage(), e);
        }
    }
    
    /**
     * 204 No Content 응답 설정 (바디 없음)
     */
    public void sendNoContentResponse(HttpServletResponse response) {
        response.setStatus(HttpStatus.NO_CONTENT.value());
        // 204 응답은 바디를 갖지 않음
    }
} 