package com.hearlers.com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.Counsel
import com.hearlers.api.proto.v1.model.CounselMessage
import com.hearlers.api.proto.v1.model.CounselorUserRelationship
import com.hearlers.api.proto.v1.service.*

interface CounselPort {
    suspend fun createCounsel(request: CreateCounselRequest): CreateCounselResponse
    suspend fun createMessage(request: CreateMessageRequest): CreateMessageResponse
    suspend fun reactMessage(request: ReactMessageRequest): CounselMessage
    suspend fun findCounselById(request: FindCounselByIdRequest): Counsel?
    suspend fun findCounsels(request: FindCounselsRequest): List<Counsel>
    suspend fun findMessages(request: FindMessagesRequest): List<CounselMessage>
    suspend fun findCounselorUserRelationships(request: FindCounselorUserRelationshipsRequest): List<CounselorUserRelationship>

}
