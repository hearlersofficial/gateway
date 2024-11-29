package com.hearlers.gateway.presentations.rest.auth.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hearlers.gateway.presentations.rest.auth.enums.AuthChannel;
import lombok.Getter;

@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateTokenRequestDto {
    private int id;
    private AuthChannel authChannel;

    public CreateTokenRequestDto(int id, AuthChannel authChannel) {
        this.id = id;
        this.authChannel = authChannel;
    }
}
