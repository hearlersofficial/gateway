package com.hearlers.gateway.config.security;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.hearlers.gateway.presentation.rest.exception.HttpException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 인증되지 않은 사용자가 보호된 리소스에 접근할 때 호출되는 진입점
 */
@Slf4j
@RequiredArgsConstructor
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

    private final ResponseFormatter responseFormatter;
    
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        log.debug("인증 실패 발생: {}", authException.getMessage());
        Exception ex = (Exception) request.getAttribute("custom.exception");

        if (ex instanceof HttpException httpEx) {
            responseFormatter.formatErrorResponse(
                response,
                HttpStatus.UNAUTHORIZED,
                httpEx.getHttpResultCode().getCode(),
                httpEx.getMessage(),
                authException.getStackTrace().toString(),
                null
            );
            return;
        }
        responseFormatter.formatErrorResponse(
            response, 
            HttpStatus.UNAUTHORIZED, 
            "E40101", 
            "인증이 필요합니다.", 
            authException.getStackTrace().toString(),
            null
        );
    }
}
