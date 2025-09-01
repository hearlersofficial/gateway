package com.hearlers.gateway.port;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.*;

public interface AuthUserPort {
    AuthUser getAuthUser(String uniqueId, AuthChannel authChannel);
    InitializeUserResponse initializeUser(InitializeUserRequest request);
    ConnectAuthChannelResponse connectAuthChannel(ConnectAuthChannelRequest request);
    UpdateAuthorityResponse updateAuthority(UpdateAuthorityRequest request);
}
