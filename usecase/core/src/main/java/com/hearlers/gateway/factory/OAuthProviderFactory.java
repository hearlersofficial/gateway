package com.hearlers.gateway.factory;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.com.hearlers.gateway.port.OAuthProviderPort;

public interface OAuthProviderFactory {
    OAuthProviderPort getOAuthProviderPort(AuthChannel authChannel);
}
