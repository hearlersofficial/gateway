package com.hearlers.gateway.counsel

import com.hearlers.api.proto.v1.model.Counsel
import com.hearlers.api.proto.v1.model.CounselMessage
import com.hearlers.api.proto.v1.model.CounselorUserRelationship
import com.hearlers.api.proto.v1.service.*
import com.hearlers.gateway.port.CounselPort
import org.springframework.stereotype.Component

@Component
class GrpcCounselAdapter (
    private val stub: CounselServiceGrpc.CounselServiceBlockingStub
) : CounselPort {

    override fun findCounselById(request: FindCounselByIdRequest): Counsel? {
        return stub.findCounselById(request).counsel
    }

    override fun findCounsels(request: FindCounselsRequest): List<Counsel> {
        return stub.findCounsels(request).counselsList
    }

    override fun findMessages(request: FindMessagesRequest): List<CounselMessage> {
        return stub.findMessages(request).counselMessagesList
    }

    override fun findCounselorUserRelationships(request: FindCounselorUserRelationshipsRequest): List<CounselorUserRelationship> {
        return stub.findCounselorUserRelationships(request)
            .counselorUserRelationshipsList
    }

    override fun createCounsel(request: CreateCounselRequest): CreateCounselResponse {
        return stub.createCounsel(request)
    }

    override fun createMessage(request: CreateMessageRequest): CreateMessageResponse {
        return stub.createMessage(request)
    }

    override fun reactMessage(request: ReactMessageRequest): CounselMessage {
        return stub.reactMessage(request).counselMessage
    }
}
