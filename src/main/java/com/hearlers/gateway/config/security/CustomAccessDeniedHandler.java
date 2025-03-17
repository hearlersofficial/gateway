package com.hearlers.gateway.config.security;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 인증된 사용자가 권한이 없는 리소스에 접근할 때 호출되는 핸들러
 */
@Slf4j
@RequiredArgsConstructor
public class CustomAccessDeniedHandler implements AccessDeniedHandler {
    
    private final ResponseFormatter responseFormatter;
    
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException, ServletException {
        log.debug("접근 권한 오류 발생: {}", accessDeniedException.getMessage());
        
        responseFormatter.formatErrorResponse(
            response, 
            HttpStatus.FORBIDDEN, 
            "E40301", 
            "접근 권한이 없습니다.", 
            accessDeniedException.getMessage(),
            null
        );
    }
}
