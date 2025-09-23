package com.hearlers.gateway.factory

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.gateway.port.OAuthProviderPort

import org.springframework.stereotype.Component
import java.util.EnumMap

@Component
class DefaultOAuthProviderFactory(
    providers: List<OAuthProviderPort>
) : OAuthProviderFactory {

    private val providerMap: Map<AuthChannel, OAuthProviderPort> =
        EnumMap(providers.associateBy { it.supportedChannel })

    override fun getOAuthProviderPort(authChannel: AuthChannel): OAuthProviderPort {
        return providerMap[authChannel]
            ?: throw IllegalArgumentException("지원하지 않는 인증 채널입니다: $authChannel")
    }
}