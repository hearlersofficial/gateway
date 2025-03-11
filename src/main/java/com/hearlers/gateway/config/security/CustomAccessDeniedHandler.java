package com.hearlers.gateway.config.security;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hearlers.gateway.presentation.rest.dto.ResponseDto;
import com.hearlers.gateway.presentation.rest.exception.HttpException;
import static com.hearlers.gateway.presentation.rest.response.HttpResultCode.FORBIDDEN;
import static com.hearlers.gateway.presentation.rest.response.HttpResultCode.SERVER_SYSTEM_ERROR;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException, ServletException {
        ObjectMapper objectMapper = new ObjectMapper();
        ResponseDto.Error dto = ResponseDto.Error.builder()
                .status(FORBIDDEN.getStatus())
                .code(FORBIDDEN.getCode())
                .message(FORBIDDEN.getMessage())
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
