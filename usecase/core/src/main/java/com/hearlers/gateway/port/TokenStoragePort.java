package com.hearlers.gateway.port;

import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse;

public interface TokenStoragePort {
    SaveRefreshTokenResponse saveRefreshToken(SaveRefreshTokenRequest request);
    VerifyRefreshTokenResponse verifyRefreshToken(VerifyRefreshTokenRequest request);
}
