package com.hearlers.com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.User
import com.hearlers.api.proto.v1.service.*


interface UserPort {
    suspend fun findUserByUserId(request: FindUserByUserIdRequest): User?
    suspend fun updateUser(request: UpdateUserRequest): User
    suspend fun checkRemainingTokens(request: CheckRemainingTokensRequest): CheckRemainingTokensResponse
    suspend fun reserveToken(request: ReserveTokensRequest): ReserveTokensResponse
}