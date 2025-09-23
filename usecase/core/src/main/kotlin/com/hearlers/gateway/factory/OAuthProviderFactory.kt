package com.hearlers.gateway.factory

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.gateway.port.OAuthProviderPort

interface OAuthProviderFactory {
    /**
     * 인증 채널에 맞는 OAuth 제공자 서비스를 반환합니다.
     * 지원하지 않는 채널에 대해서는 이 메서드가 호출되는 런타임에 예외를 던집니다.
     */
    fun getOAuthProviderPort(authChannel: AuthChannel): OAuthProviderPort
}