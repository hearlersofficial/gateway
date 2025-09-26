package com.hearlers.gateway

import com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest
import com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse
import com.hearlers.api.proto.v1.service.ReserveTokensRequest
import com.hearlers.api.proto.v1.service.ReserveTokensResponse

interface TokenCheckingUseCase {
    fun checkRemainingTokens(request: CheckRemainingTokensRequest): CheckRemainingTokensResponse
    fun reserveToken(request: ReserveTokensRequest): ReserveTokensResponse
}