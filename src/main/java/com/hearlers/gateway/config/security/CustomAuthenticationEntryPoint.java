package com.hearlers.gateway.config.security;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hearlers.gateway.presentation.rest.exception.HttpException;
import static com.hearlers.gateway.presentation.rest.response.HttpResultCode.SERVER_SYSTEM_ERROR;
import static com.hearlers.gateway.presentation.rest.response.HttpResultCode.UNAUTHORIZED;
import com.hearlers.gateway.shared.presentation.ResponseDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        ObjectMapper objectMapper = new ObjectMapper();
        ResponseDto.Error dto = ResponseDto.Error.builder()
                .status(UNAUTHORIZED.getStatus())
                .code(UNAUTHORIZED.getCode())
                .message(UNAUTHORIZED.getMessage())
                .data(null)
                .build();

        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        try {
            response.getWriter().write(objectMapper.writeValueAsString(dto));
            response.getWriter().flush();
        } catch (IOException e) {
            throw new HttpException(SERVER_SYSTEM_ERROR);
        }
    }
}
