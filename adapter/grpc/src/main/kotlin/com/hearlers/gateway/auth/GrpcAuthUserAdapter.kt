package com.hearlers.gateway.auth

import com.hearlers.api.proto.v1.model.AuthChannel
import com.hearlers.api.proto.v1.model.AuthUser
import com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest
import com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse
import com.hearlers.api.proto.v1.service.FindAuthUserByChannelInfoRequest
import com.hearlers.api.proto.v1.service.InitializeUserRequest
import com.hearlers.api.proto.v1.service.InitializeUserResponse
import com.hearlers.api.proto.v1.service.UpdateAuthorityRequest
import com.hearlers.api.proto.v1.service.UpdateAuthorityResponse
import com.hearlers.api.proto.v1.service.UserServiceGrpcKt
import com.hearlers.gateway.auth.exception.AuthUserNotFoundException
import com.hearlers.gateway.port.AuthUserPort
import io.grpc.Status
import io.grpc.StatusRuntimeException
import org.springframework.stereotype.Component


@Component
class GrpcAuthUserAdapter(
    private val userServiceCoroutineStub: UserServiceGrpcKt.UserServiceCoroutineStub
) : AuthUserPort {

    override suspend fun getAuthUser(uniqueId: String, authChannel: AuthChannel): AuthUser {
        try {
            val request = FindAuthUserByChannelInfoRequest.newBuilder()
                .setUniqueId(uniqueId)
                .setAuthChannel(authChannel)
                .build()
            val response = userServiceCoroutineStub.findAuthUserByChannelInfo(request)
            return response.authUser
        } catch (e: StatusRuntimeException) {
            if (e.status.code == Status.Code.NOT_FOUND) {
                // NOTE: NOT_FOUND는 비즈니스 상 유의미한 에러로 도메인 에러로 해독해서 던짐
                throw AuthUserNotFoundException("AuthUser not found with uniqueId: $uniqueId", e)
            }
            throw e
        }
    }

    override suspend fun initializeUser(request: InitializeUserRequest): InitializeUserResponse {
        return userServiceCoroutineStub.initializeUser(request)
    }

    override suspend fun connectAuthChannel(request: ConnectAuthChannelRequest): ConnectAuthChannelResponse {
        return userServiceCoroutineStub.connectAuthChannel(request)
    }

    override suspend fun updateAuthority(request: UpdateAuthorityRequest): UpdateAuthorityResponse {
        return userServiceCoroutineStub.updateAuthority(request)
    }
}
