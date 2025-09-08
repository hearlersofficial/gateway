package com.hearlers.gateway;


import com.hearlers.gateway.auth.model.AuthInfo;

public interface OAuthProviderClient {
    AuthInfo.TokenInfo getToken(String code, String state, String clientId);
    AuthInfo.OAuthUserInfo getOAuthUser(String accessToken);
}
