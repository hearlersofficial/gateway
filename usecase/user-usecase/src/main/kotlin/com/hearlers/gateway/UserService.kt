package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.User
import com.hearlers.api.proto.v1.service.FindUserByUserIdRequest
import com.hearlers.api.proto.v1.service.UpdateUserRequest
import com.hearlers.gateway.port.UserPort
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userPort: UserPort
) : UserUseCase {
    override fun updateUser(request: UpdateUserRequest): User {
        return userPort.updateUser(request)
    }

    override fun findUserByUserId(request: FindUserByUserIdRequest): User? {
        return userPort.findUserByUserId(request)
    }
}