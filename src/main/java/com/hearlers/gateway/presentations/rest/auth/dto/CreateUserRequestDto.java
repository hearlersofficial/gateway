package com.hearlers.gateway.presentations.rest.auth.dto;

import com.hearlers.gateway.presentations.rest.auth.enums.AuthChannel;

public class CreateUserRequestDto {
    private String nickname;
    private AuthChannel auth_channel = AuthChannel.AUTH_CHANNEL_NONE;
}
