package com.hearlers.gateway.config.security;

import java.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 모든 종류의 예외를 표준화된 응답 형식으로 변환하는 필터
 * - 원래 상태 코드와 메시지는 유지하되, 응답 형식만 정규화
 */
@Slf4j
@RequiredArgsConstructor
public class HttpExceptionFilter extends OncePerRequestFilter {

    private final ExceptionHandler exceptionHandler;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        try {
            filterChain.doFilter(request, response);
        } catch (Exception e) {
            log.debug("필터 체인에서 예외 발생: {}", e.getMessage());
            // 예외 처리를 전용 핸들러에 위임
            exceptionHandler.handleException(request, response, e);
        }
    }
}
