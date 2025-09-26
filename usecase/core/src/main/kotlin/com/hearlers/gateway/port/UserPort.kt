package com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.User
import com.hearlers.api.proto.v1.service.*


interface UserPort {
    fun findUserByUserId(request: FindUserByUserIdRequest): User?
    fun updateUser(request: UpdateUserRequest): User
    fun checkRemainingTokens(request: CheckRemainingTokensRequest): CheckRemainingTokensResponse
    fun reserveToken(request: ReserveTokensRequest): ReserveTokensResponse
}