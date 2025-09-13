package com.hearlers.gateway

import com.hearlers.api.proto.v1.model.Counsel
import com.hearlers.api.proto.v1.model.CounselMessage
import com.hearlers.api.proto.v1.model.CounselorUserRelationship
import com.hearlers.api.proto.v1.service.*


interface CounselUseCase {
    // Counsel
    suspend fun createCounsel(request: CreateCounselRequest): CreateCounselResponse
    suspend fun findCounselById(request: FindCounselByIdRequest): Counsel?
    suspend fun findCounsels(request: FindCounselsRequest): List<Counsel>

    // CounselMessage
    suspend fun createMessage(request: CreateMessageRequest, userId: String): CreateMessageResponse
    suspend fun findMessages(request: FindMessagesRequest): List<CounselMessage>
    suspend fun reactMessage(request: ReactMessageRequest): CounselMessage

    // CounselorUserRelationship
    suspend fun findCounselorUserRelationships(request: FindCounselorUserRelationshipsRequest): List<CounselorUserRelationship>
}
