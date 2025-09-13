package com.hearlers.gateway

import com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest
import com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse
import com.hearlers.api.proto.v1.service.ReserveTokensRequest
import com.hearlers.api.proto.v1.service.ReserveTokensResponse

interface TokenCheckingUseCase {
    suspend fun checkRemainingTokens(request: CheckRemainingTokensRequest): CheckRemainingTokensResponse
    suspend fun reserveToken(request: ReserveTokensRequest): ReserveTokensResponse
}