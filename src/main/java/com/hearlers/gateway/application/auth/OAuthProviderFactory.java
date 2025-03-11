package com.hearlers.gateway.application.auth;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.gateway.infrastructure.auth.KakaoOAuthProviderClient;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class OAuthProviderFactory {
    private final Map<AuthChannel, OAuthProviderClient> oAuthProviderClients;
    private final KakaoOAuthProviderClient kakaoOAuthProviderClient;

    @PostConstruct
    public void init() {
        oAuthProviderClients.put(AuthChannel.AUTH_CHANNEL_KAKAO, kakaoOAuthProviderClient);
    }

    public OAuthProviderClient getOAuthProviderClient(AuthChannel authChannel) {
        return oAuthProviderClients.get(authChannel);
    }
}
