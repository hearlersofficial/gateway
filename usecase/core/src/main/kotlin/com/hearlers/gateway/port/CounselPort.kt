package com.hearlers.gateway.port

import com.hearlers.api.proto.v1.model.Counsel
import com.hearlers.api.proto.v1.model.CounselMessage
import com.hearlers.api.proto.v1.model.CounselorUserRelationship
import com.hearlers.api.proto.v1.service.*

interface CounselPort {
    fun createCounsel(request: CreateCounselRequest): CreateCounselResponse
    fun createMessage(request: CreateMessageRequest): CreateMessageResponse
    fun reactMessage(request: ReactMessageRequest): CounselMessage
    fun findCounselById(request: FindCounselByIdRequest): Counsel?
    fun findCounsels(request: FindCounselsRequest): List<Counsel>
    fun findMessages(request: FindMessagesRequest): List<CounselMessage>
    fun findCounselorUserRelationships(request: FindCounselorUserRelationshipsRequest): List<CounselorUserRelationship>

}
