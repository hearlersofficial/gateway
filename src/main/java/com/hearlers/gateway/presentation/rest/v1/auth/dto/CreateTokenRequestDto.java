package com.hearlers.gateway.presentation.rest.v1.auth.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hearlers.api.proto.v1.model.AuthChannel;

import lombok.Getter;

@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateTokenRequestDto {
    private String id;
    private com.hearlers.api.proto.v1.model.AuthChannel authChannel;

    public CreateTokenRequestDto(String id, AuthChannel authChannel) {
        this.id = id;
        this.authChannel = com.hearlers.api.proto.v1.model.AuthChannel.valueOf(authChannel.name());
    }
}
