package com.hearlers.gateway.application.auth;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.gateway.infrastructure.auth.KakaoOAuthProviderClient;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class OAuthProviderFactory {
    private final KakaoOAuthProviderClient kakaoOAuthProviderClient;

    public OAuthProviderClient getOAuthProviderClient(AuthChannel authChannel) {
        return switch (authChannel) {
            case AUTH_CHANNEL_KAKAO -> kakaoOAuthProviderClient;
            default -> throw new IllegalArgumentException("Invalid auth channel: " + authChannel);
        };
    }
}
