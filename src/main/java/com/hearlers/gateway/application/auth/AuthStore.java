package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.service.*;

public interface AuthStore {
    InitializeUserResponse initializeUser(InitializeUserRequest request);

    ConnectAuthChannelResponse connectAuthChannel(ConnectAuthChannelRequest request);

    UpdateAuthorityResponse updateAuthority(UpdateAuthorityRequest request);
}
