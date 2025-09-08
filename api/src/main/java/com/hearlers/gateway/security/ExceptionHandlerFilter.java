package com.hearlers.gateway.security;

import com.hearlers.gateway.shared.exception.HttpException;
import com.hearlers.gateway.shared.response.ResponseFormatter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

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
