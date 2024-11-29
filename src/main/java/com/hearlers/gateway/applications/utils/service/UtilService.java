package com.hearlers.gateway.applications.utils.service;

import com.hearlers.gateway.applications.utils.useCases.CreateCookieUseCase.CreateCookieUseCase;
import com.hearlers.gateway.applications.utils.useCases.CreateCookieUseCase.dto.CreateCookieRequestDto;
import com.hearlers.gateway.applications.utils.useCases.CreateCookieUseCase.dto.CreateCookieResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UtilService {
    private final CreateCookieUseCase createCookieUseCase;

    public CreateCookieResponseDto createCookie(CreateCookieRequestDto request) {
        return createCookieUseCase.execute(request);
    }
}
