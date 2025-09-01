package com.hearlers.gateway.infrastructure.auth;


import com.hearlers.gateway.application.auth.AuthCommand;
import com.hearlers.gateway.application.auth.AuthInfo;

public interface OAuthProviderClient {
    AuthInfo.TokenInfo getToken(AuthCommand.GetOAuthAccessTokenRequest request);
    AuthInfo.OAuthUserInfo getOAuthUser(AuthCommand.GetOAuthUserInfoRequest request);
}
