package com.hearlers.gateway

import com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest
import com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse
import com.hearlers.api.proto.v1.service.ReserveTokensRequest
import com.hearlers.api.proto.v1.service.ReserveTokensResponse
import com.hearlers.gateway.port.UserPort
import org.springframework.stereotype.Service

@Service
class TokenCheckingService (
    private val userPort: UserPort
) : TokenCheckingUseCase {
    override fun checkRemainingTokens(request: CheckRemainingTokensRequest): CheckRemainingTokensResponse {
        return userPort.checkRemainingTokens(request)
    }

    override fun reserveToken(request: ReserveTokensRequest): ReserveTokensResponse {
        return userPort.reserveToken(request)
    }
}