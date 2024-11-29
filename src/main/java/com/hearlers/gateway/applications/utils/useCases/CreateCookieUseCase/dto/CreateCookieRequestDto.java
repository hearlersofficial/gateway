package com.hearlers.gateway.applications.utils.useCases.CreateCookieUseCase.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateCookieRequestDto {
    private String token; // access or refresh
    private String name;
    private int maxAge;
    private boolean httpOnly;
    private String path;
}