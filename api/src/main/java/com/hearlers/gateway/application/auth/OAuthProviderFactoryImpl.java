package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class OAuthProviderFactoryImpl implements OAuthProviderFactory {
    private final Map<AuthChannel, OAuthProviderService> providerMap;


    public OAuthProviderFactoryImpl(List<OAuthProviderService> providers) {
        this.providerMap = providers.stream()
                .collect(Collectors.toMap(
                        OAuthProviderService::getSupportedChannel,
                        Function.identity()
                ));
    }
    
    /**
     * 인증 채널에 맞는 OAuth 제공자 서비스를 반환합니다.
     */
    @Override
    public OAuthProviderService getOAuthProvider(AuthChannel authChannel) {
        OAuthProviderService provider = providerMap.get(authChannel);
        if (provider == null) {
            throw new IllegalArgumentException("Unsupported auth channel: " + authChannel);
        }
        return provider;
    }
}
