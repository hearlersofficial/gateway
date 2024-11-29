package com.hearlers.gateway.applications.utils.useCases.CreateCookieUseCase.dto;

import jakarta.servlet.http.Cookie;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class CreateCookieResponseDto {
    private Cookie cookie;
}
