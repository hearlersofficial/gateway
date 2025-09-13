package com.hearlers.gateway.counsel

import com.hearlers.api.proto.v1.model.Counsel
import com.hearlers.api.proto.v1.model.CounselMessage
import com.hearlers.api.proto.v1.model.CounselorUserRelationship
import com.hearlers.api.proto.v1.service.*
import com.hearlers.com.hearlers.gateway.port.CounselPort
import org.springframework.stereotype.Component

@Component
class GrpcCounselAdapter (
    private val counselorServiceCoroutineStub: CounselServiceGrpcKt.CounselServiceCoroutineStub
) : CounselPort {

    override suspend fun findCounselById(request: FindCounselByIdRequest): Counsel? {
        return counselorServiceCoroutineStub.findCounselById(request).counsel
    }

    override suspend fun findCounsels(request: FindCounselsRequest): List<Counsel> {
        return counselorServiceCoroutineStub.findCounsels(request).counselsList
    }

    override suspend fun findMessages(request: FindMessagesRequest): List<CounselMessage> {
        return counselorServiceCoroutineStub.findMessages(request).counselMessagesList
    }

    override suspend fun findCounselorUserRelationships(request: FindCounselorUserRelationshipsRequest): List<CounselorUserRelationship> {
        return counselorServiceCoroutineStub.findCounselorUserRelationships(request)
            .counselorUserRelationshipsList
    }

    override suspend fun createCounsel(request: CreateCounselRequest): CreateCounselResponse {
        return counselorServiceCoroutineStub.createCounsel(request)
    }

    override suspend fun createMessage(request: CreateMessageRequest): CreateMessageResponse {
        return counselorServiceCoroutineStub.createMessage(request)
    }

    override suspend fun reactMessage(request: ReactMessageRequest): CounselMessage {
        return counselorServiceCoroutineStub.reactMessage(request).counselMessage
    }
}
