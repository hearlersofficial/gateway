package com.hearlers.gateway.factory;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.com.hearlers.gateway.port.OAuthProviderPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class DefaultOAuthProviderFactory implements OAuthProviderFactory {
    private final Map<AuthChannel, OAuthProviderPort> providerMap;


    public DefaultOAuthProviderFactory(List<OAuthProviderPort> providers) {
        this.providerMap = providers.stream()
                .collect(Collectors.toMap(
                        OAuthProviderPort::getSupportedChannel,
                        Function.identity()
                ));
    }
    
    /**
     * 인증 채널에 맞는 OAuth 제공자 서비스를 반환합니다.
     */
    @Override
    public OAuthProviderPort getOAuthProviderPort(AuthChannel authChannel) {
        OAuthProviderPort provider = providerMap.get(authChannel);
        if (provider == null) {
            throw new IllegalArgumentException("Unsupported auth channel: " + authChannel);
        }
        return provider;
    }
}
