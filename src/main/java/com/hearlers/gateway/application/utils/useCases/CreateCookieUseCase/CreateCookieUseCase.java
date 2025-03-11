package com.hearlers.gateway.application.utils.useCases.CreateCookieUseCase;

import org.springframework.stereotype.Component;

import com.hearlers.gateway.application.utils.useCases.CreateCookieUseCase.dto.CreateCookieRequestDto;
import com.hearlers.gateway.application.utils.useCases.CreateCookieUseCase.dto.CreateCookieResponseDto;
import com.hearlers.gateway.shared.application.UseCase;

import jakarta.servlet.http.Cookie;

@Component
public class CreateCookieUseCase implements
        UseCase<CreateCookieRequestDto, CreateCookieResponseDto> {

    @Override
    public CreateCookieResponseDto execute(CreateCookieRequestDto createCookieRequestDto) {
        Cookie cookie = new Cookie(createCookieRequestDto.getName(),
                createCookieRequestDto.getToken());
        cookie.setMaxAge(createCookieRequestDto.getMaxAge());
        cookie.setHttpOnly(createCookieRequestDto.isHttpOnly());
        cookie.setPath(createCookieRequestDto.getPath());
        return new CreateCookieResponseDto(cookie);
    }
}