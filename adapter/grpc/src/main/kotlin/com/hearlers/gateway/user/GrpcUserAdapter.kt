package com.hearlers.gateway.user

import com.hearlers.api.proto.v1.model.User
import com.hearlers.api.proto.v1.service.*
import com.hearlers.com.hearlers.gateway.port.UserPort
import com.hearlers.gateway.counsel.exception.NoRemainingTokenException
import io.grpc.Status
import io.grpc.StatusRuntimeException
import org.springframework.stereotype.Component

@Component
class GrpcUserAdapter(
    private val userServiceCoroutineStub: UserServiceGrpcKt.UserServiceCoroutineStub
) : UserPort {
    override suspend fun findUserByUserId(request: FindUserByUserIdRequest): User? {
        return userServiceCoroutineStub.findUserByUserId(request).user
    }

    override suspend fun updateUser(request: UpdateUserRequest): User {
        return userServiceCoroutineStub.updateUser(request).user
    }

    override suspend fun checkRemainingTokens(request: CheckRemainingTokensRequest): CheckRemainingTokensResponse {
        return userServiceCoroutineStub.checkRemainingTokens(request)
    }

    override suspend fun reserveToken(request: ReserveTokensRequest): ReserveTokensResponse {
        return try {
            userServiceCoroutineStub.reserveTokens(request)
        } catch (e : StatusRuntimeException) {
            if (e.status.code == Status.Code.PERMISSION_DENIED) {
                throw NoRemainingTokenException("토큰이 부족합니다.", e)
            }
            throw e
        }
    }

}