package com.hearlers.gateway.application.auth;

import com.hearlers.gateway.application.auth.dto.GetOAuthAccessTokenRequest;
import com.hearlers.gateway.application.auth.dto.GetOAuthAccessTokenResponse;
import com.hearlers.gateway.application.auth.dto.GetOAuthUserInfoRequest;
import com.hearlers.gateway.application.auth.dto.GetOAuthUserInfoResponse;

public interface OAuthProviderClient {
    GetOAuthAccessTokenResponse execute(GetOAuthAccessTokenRequest request);
    GetOAuthUserInfoResponse getUserInfo(GetOAuthUserInfoRequest request);
}
