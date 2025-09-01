package com.hearlers.gateway.auth;

import com.hearlers.api.proto.v1.service.*;
import com.hearlers.gateway.auth.exception.AuthUserNotFoundException;
import com.hearlers.gateway.port.AuthUserPort;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.UserServiceGrpc.UserServiceBlockingStub;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class GrpcAuthUserAdapter implements AuthUserPort {
    private final UserServiceBlockingStub userServiceBlockingStub;

    @Override
    public AuthUser getAuthUser(String uniqueId, AuthChannel authChannel) {
        try {
            FindAuthUserByChannelInfoRequest findAuthUserByChannelInfoRequest = FindAuthUserByChannelInfoRequest.newBuilder()
                    .setUniqueId(uniqueId)
                    .setAuthChannel(authChannel)
                    .build();

            FindAuthUserByChannelInfoResponse findAuthUserByChannelInfoResponse = userServiceBlockingStub.findAuthUserByChannelInfo(findAuthUserByChannelInfoRequest);

            return findAuthUserByChannelInfoResponse.getAuthUser();
        } catch (StatusRuntimeException e) {
            if (e.getStatus().getCode() == Status.Code.NOT_FOUND) {
                // NOTE: NOT_FOUND는 비즈니스 상 유의미한 에러로 도메인 에러로 해독해서 던짐
                throw new AuthUserNotFoundException("AuthUser not found with uniqueId: " + uniqueId, e);
            }
            throw e;
        }
    }

    @Override
    public InitializeUserResponse initializeUser(InitializeUserRequest request) {
        return userServiceBlockingStub.initializeUser(request);
    }

    @Override
    public ConnectAuthChannelResponse connectAuthChannel(ConnectAuthChannelRequest request) {
        return userServiceBlockingStub.connectAuthChannel(request);
    }

    @Override
    public UpdateAuthorityResponse updateAuthority(UpdateAuthorityRequest request) {
        return userServiceBlockingStub.updateAuthority(request);
    }
    
}
