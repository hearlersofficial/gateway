package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.Counsel
import com.hearlers.api.proto.v1.model.CounselMessage
import com.hearlers.api.proto.v1.model.CounselorUserRelationship
import com.hearlers.api.proto.v1.service.*
import com.hearlers.com.hearlers.gateway.port.CounselPort
import org.springframework.stereotype.Service

@Service
class CounselService (
    private val counselPort: CounselPort,
    private val tokenCheckingUseCase: TokenCheckingUseCase
): CounselUseCase {


    // Counsel 관련 메서드
    override suspend fun createCounsel(request: CreateCounselRequest): CreateCounselResponse {
        return counselPort.createCounsel(request)
    }

    override suspend fun findCounselById(request: FindCounselByIdRequest): Counsel? {
        return counselPort.findCounselById(request)
    }

    override suspend fun findCounsels(request: FindCounselsRequest): List<Counsel> {
        return counselPort.findCounsels(request)
    }

    // CounselMessage 관련 메서드
    override suspend fun createMessage(request: CreateMessageRequest, userId: String): CreateMessageResponse {
        this.tokenCheckingUseCase.reserveToken(ReserveTokensRequest.newBuilder().setUserId(userId).build())
        return counselPort.createMessage(request)
    }

    override suspend fun findMessages(request: FindMessagesRequest): List<CounselMessage> {
        return counselPort.findMessages(request)
    }

    override suspend fun reactMessage(request: ReactMessageRequest): CounselMessage {
        return counselPort.reactMessage(request)
    }

    // CounselorUserRelationship 관련 메서드
    override suspend fun findCounselorUserRelationships(request: FindCounselorUserRelationshipsRequest): List<CounselorUserRelationship> {
        return counselPort.findCounselorUserRelationships(request)
    }
}