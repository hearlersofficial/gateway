package com.hearlers.gateway.application.utils.service;

import org.springframework.stereotype.Service;

import com.hearlers.gateway.application.utils.useCases.CreateCookieUseCase.CreateCookieUseCase;
import com.hearlers.gateway.application.utils.useCases.CreateCookieUseCase.dto.CreateCookieRequestDto;
import com.hearlers.gateway.application.utils.useCases.CreateCookieUseCase.dto.CreateCookieResponseDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UtilService {
    private final CreateCookieUseCase createCookieUseCase;

    public CreateCookieResponseDto createCookie(CreateCookieRequestDto request) {
        return createCookieUseCase.execute(request);
    }
}
