package com.hearlers.gateway.applications.auth.service.dto;

import com.hearlers.api.proto.v1.model.AuthChannel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ConnectAuthChannelRequestDto {
    private int userId;
    private AuthChannel authChannel;
    private String uniqueId; // kakaoId
}
