package com.hearlers.gateway.config.security;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.http.MediaType;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hearlers.gateway.presentation.rest.dto.ResponseDto;
import com.hearlers.gateway.presentation.rest.exception.HttpException;
import com.hearlers.gateway.presentation.rest.response.HttpResultCode;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpExceptionFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        try {
            filterChain.doFilter(request, response);
        } catch (HttpException e) {
            setErrorResponse(response, e.getHttpResultCode(), e.getData());
        }
    }

    private void setErrorResponse(HttpServletResponse response, HttpResultCode httpResultCode, Object data) {
        ObjectMapper objectMapper = new ObjectMapper();
        response.setStatus(httpResultCode.getStatus().value());
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        try {
            ResponseDto.Error dto = ResponseDto.Error.builder()
                    .status(httpResultCode.getStatus())
                    .code(httpResultCode.getCode())
                    .message(httpResultCode.getMessage())
                    .data(data)
                    .build();

            response.getWriter().write(objectMapper.writeValueAsString(dto));
        } catch (IOException e) {
            throw new HttpException(HttpResultCode.SERVER_SYSTEM_ERROR);
        }
    }
}
