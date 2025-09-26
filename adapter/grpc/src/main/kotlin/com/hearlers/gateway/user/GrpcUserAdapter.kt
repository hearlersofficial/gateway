package com.hearlers.gateway.user

import com.hearlers.api.proto.v1.model.User
import com.hearlers.api.proto.v1.service.*
import com.hearlers.gateway.port.UserPort
import com.hearlers.gateway.counsel.exception.NoRemainingTokenException
import io.grpc.Status
import io.grpc.StatusRuntimeException
import org.springframework.stereotype.Component

@Component
class GrpcUserAdapter(
    private val stub: UserServiceGrpc.UserServiceBlockingStub
) : UserPort {
    override fun findUserByUserId(request: FindUserByUserIdRequest): User? {
        return stub.findUserByUserId(request).user
    }

    override fun updateUser(request: UpdateUserRequest): User {
        return stub.updateUser(request).user
    }

    override fun checkRemainingTokens(request: CheckRemainingTokensRequest): CheckRemainingTokensResponse {
        return stub.checkRemainingTokens(request)
    }

    override fun reserveToken(request: ReserveTokensRequest): ReserveTokensResponse {
        return try {
            stub.reserveTokens(request)
        } catch (e : StatusRuntimeException) {
            if (e.status.code == Status.Code.PERMISSION_DENIED) {
                throw NoRemainingTokenException("토큰이 부족합니다.", e)
            }
            throw e
        }
    }

}