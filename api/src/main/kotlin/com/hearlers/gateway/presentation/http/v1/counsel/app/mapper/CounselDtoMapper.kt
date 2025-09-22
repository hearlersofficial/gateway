package com.hearlers.gateway.presentation.http.v1.counsel.app.mapper

import com.hearlers.api.proto.v1.model.Counsel
import com.hearlers.api.proto.v1.model.CounselMessage
import com.hearlers.api.proto.v1.model.CounselorUserRelationship
import com.hearlers.api.proto.v1.service.*
import com.hearlers.gateway.presentation.http.v1.counsel.app.dto.CounselDto

object CounselDtoMapper {

    fun of(counsel: Counsel): CounselDto.Counsel {
        return CounselDto.Counsel(
            id = counsel.id,
            counselorId = counsel.counselorId,
            userId = counsel.userId,
            lastMessage = counsel.lastMessage,
            lastChatedAt = counsel.lastChatedAt,
            promptVersionId = counsel.promptVersionId,
            createdAt = counsel.createdAt,
            updatedAt = counsel.updatedAt,
            deletedAt = counsel.deletedAt
        )
    }

    fun of(counselMessage: CounselMessage): CounselDto.CounselMessage {
        return CounselDto.CounselMessage(
            id = counselMessage.id,
            counselId = counselMessage.counselId,
            message = counselMessage.message,
            isUserMessage = counselMessage.isUserMessage,
            reactedAt = counselMessage.reactedAt,
            reaction = counselMessage.reaction,
            createdAt = counselMessage.createdAt,
            updatedAt = counselMessage.updatedAt,
            deletedAt = counselMessage.deletedAt
        )
    }

    fun of(counselorUserRelationship: CounselorUserRelationship): CounselDto.CounselorUserRelationship {
        return CounselDto.CounselorUserRelationship(
            id = counselorUserRelationship.id,
            counselorId = counselorUserRelationship.counselorId,
            userId = counselorUserRelationship.userId,
            rapport = counselorUserRelationship.rapport,
            createdAt = counselorUserRelationship.createdAt,
            updatedAt = counselorUserRelationship.updatedAt,
            deletedAt = counselorUserRelationship.deletedAt
        )
    }

    fun toCreateCounselRequest(userId: String, counselorId: String, request: CounselDto.CreateCounselRequest): CreateCounselRequest {
        return CreateCounselRequest.newBuilder()
            .setUserId(userId)
            .setCounselorId(counselorId)
            .apply {
                request.bubbleId?.let { setBubbleId(it) }
                request.responseOptionNo?.let { setResponseOptionNo(it) }
            }
            .build()
    }

    fun toCreateCounselResponse(response: CreateCounselResponse): CounselDto.CreateCounselResponse {
        return CounselDto.CreateCounselResponse(
            counsel = of(response.counsel),
            counselMessages = response.counselMessagesList.map(::of)
        )
    }

    fun toFindCounselsRequest(userId: String?, counselorId: String?): FindCounselsRequest {
        return FindCounselsRequest.newBuilder()
            .apply {
                userId?.let { setUserId(it) }
                counselorId?.let { setCounselorId(it) }
            }
            .build()
    }

    fun toFindCounselsResponse(counsels: List<Counsel>): CounselDto.FindCounselsResponse {
        return CounselDto.FindCounselsResponse(
            counsels = counsels.map(::of)
        )
    }

    fun toFindCounselByIdRequest(counselId: String): FindCounselByIdRequest {
        return FindCounselByIdRequest.newBuilder().setCounselId(counselId).build()
    }

    fun toFindCounselByIdResponse(counsel: Counsel): CounselDto.FindCounselByIdResponse {
        return CounselDto.FindCounselByIdResponse(counsel = of(counsel))
    }

    fun toCreateMessageRequest(counselId: String, request: CounselDto.CreateMessageRequest): CreateMessageRequest {
        return CreateMessageRequest.newBuilder()
            .setCounselId(counselId)
            .setMessage(request.message)
            .build()
    }

    fun toCreateMessageResponse(response: CreateMessageResponse): CounselDto.CreateMessageResponse {
        return CounselDto.CreateMessageResponse(
            createdCounselMessage = of(response.createdCounselMessage),
            counselorResponseMessage = of(response.counselorResponseMessage)
        )
    }

    fun toFindMessagesRequest(counselId: String): FindMessagesRequest {
        return FindMessagesRequest.newBuilder().setCounselId(counselId).build()
    }

    fun toFindMessagesResponse(counselMessages: List<CounselMessage>): CounselDto.FindMessagesResponse {
        return CounselDto.FindMessagesResponse(
            counselMessages = counselMessages.map(::of)
        )
    }

    fun toReactMessageRequest(messageId: String, request: CounselDto.ReactMessageRequest): ReactMessageRequest {
        return ReactMessageRequest.newBuilder()
            .setMessageId(messageId)
            .setReaction(request.reaction)
            .build()
    }

    fun toReactMessageResponse(counselMessage: CounselMessage): CounselDto.ReactMessageResponse {
        return CounselDto.ReactMessageResponse(counselMessage = of(counselMessage))
    }

    fun toFindCounselorUserRelationshipsRequest(userId: String?): FindCounselorUserRelationshipsRequest {
        return FindCounselorUserRelationshipsRequest.newBuilder()
            .apply {
                userId?.let { setUserId(it) }
            }
            .build()
    }

    fun toFindCounselorUserRelationshipsResponse(relationships: List<CounselorUserRelationship>): CounselDto.FindCounselorUserRelationshipsResponse {
        return CounselDto.FindCounselorUserRelationshipsResponse(
            counselorUserRelationships = relationships.map(::of)
        )
    }
}
