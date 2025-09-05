package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;

public interface OAuthProviderFactory {
    OAuthProviderService getOAuthProvider(AuthChannel authChannel);
}
