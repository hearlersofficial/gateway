package com.hearlers.gateway.presentations.rest.counselors.dto;

import lombok.Getter;

// Bubble 입장 시 DTO
@Getter
public class CreateCounselRequestDto {
    private String introMessage;
    private String response;
}
