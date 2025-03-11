package com.hearlers.gateway.presentation.rest.auth.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hearlers.gateway.shared.enums.AuthChannel;

import lombok.Getter;

@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateUserRequestDto {
    private String nickname;
    private AuthChannel authChannel = AuthChannel.AUTH_CHANNEL_NONE;
}
