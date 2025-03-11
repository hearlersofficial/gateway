package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest;
import com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse;
import com.hearlers.api.proto.v1.service.InitializeUserRequest;
import com.hearlers.api.proto.v1.service.InitializeUserResponse;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse;

public interface AuthPersistor {
    InitializeUserResponse initializeUser(InitializeUserRequest request);

    ConnectAuthChannelResponse connectAuthChannel(ConnectAuthChannelRequest request);

    SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request);

    VerifyRefreshTokenResponse verifyRefreshToken(VerifyRefreshTokenRequest request);
}
