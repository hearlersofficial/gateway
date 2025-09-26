package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.Counsel
import com.hearlers.api.proto.v1.model.CounselMessage
import com.hearlers.api.proto.v1.model.CounselorUserRelationship
import com.hearlers.api.proto.v1.service.*


interface CounselUseCase {
    // Counsel
    fun createCounsel(request: CreateCounselRequest): CreateCounselResponse
    fun findCounselById(request: FindCounselByIdRequest): Counsel?
    fun findCounsels(request: FindCounselsRequest): List<Counsel>

    // CounselMessage
    fun createMessage(request: CreateMessageRequest, userId: String): CreateMessageResponse
    fun findMessages(request: FindMessagesRequest): List<CounselMessage>
    fun reactMessage(request: ReactMessageRequest): CounselMessage

    // CounselorUserRelationship
    fun findCounselorUserRelationships(request: FindCounselorUserRelationshipsRequest): List<CounselorUserRelationship>
}
