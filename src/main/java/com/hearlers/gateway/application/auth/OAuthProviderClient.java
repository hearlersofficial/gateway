package com.hearlers.gateway.application.auth;



public interface OAuthProviderClient {
    AuthInfo.TokenInfo getToken(AuthCommand.GetOAuthAccessTokenRequest request);
    AuthInfo.OAuthUserInfo getOAuthUser(AuthCommand.GetOAuthUserInfoRequest request);
}
