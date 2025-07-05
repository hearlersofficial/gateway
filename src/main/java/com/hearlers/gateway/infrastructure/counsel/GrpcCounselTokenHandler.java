package com.hearlers.gateway.infrastructure.counsel;

import com.hearlers.api.proto.v1.service.*;
import com.hearlers.gateway.application.counsel.CounselTokenHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GrpcCounselTokenHandler implements CounselTokenHandler {
    private final UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    @Override
    public CheckRemainingTokensResponse checkRemainingTokens(CheckRemainingTokensRequest request) {
        return this.userServiceBlockingStub.checkRemainingTokens(request);
    }

    @Override
    public ReserveTokensResponse reserveToken(ReserveTokensRequest request) {
        return this.userServiceBlockingStub.reserveTokens(request);
    }
}
