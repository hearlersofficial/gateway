package com.hearlers.gateway.port;

import com.hearlers.api.proto.v1.service.*;

public interface TokenStoragePort {
    SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request);
    VerifyRefreshTokenResponse verifyRefreshToken(VerifyRefreshTokenRequest request);
}
