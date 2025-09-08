package com.hearlers.gateway;


import com.hearlers.gateway.auth.model.AuthInfo;
import com.hearlers.gateway.command.AuthCommand;

public interface OAuthProviderClient {
    AuthInfo.TokenInfo getToken(String code, String state, String clientId);
    AuthInfo.OAuthUserInfo getOAuthUser(String accessToken);
}
