package com.hearlers.gateway.config.security;

import java.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;

import com.hearlers.gateway.shared.exception.HttpException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ExceptionHandlerFilter extends OncePerRequestFilter {

    private final ResponseFormatter responseFormatter;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        try {
            filterChain.doFilter(request, response);
        } catch (HttpException e) {
            log.debug("ExceptionHandlerFilter에서 HttpException 발생 : {}", e.getMessage());
            responseFormatter.formatErrorResponse(response, e.getHttpResultCode(), e.getData());
        }
    }

}
