package com.hearlers.gateway.presentation.http.v1.counsel.app.dto

import com.hearlers.api.proto.v1.model.CounselMessageReaction
import io.swagger.v3.oas.annotations.media.Schema

object CounselDto {

    @Schema(description = "상담")
    data class Counsel(
        @field:Schema(description = "상담 ID", example = "123534543")
        val id: String,
        @field:Schema(description = "상담사 ID", example = "53453454323")
        val counselorId: String,
        @field:Schema(description = "유저 ID", example = "53453454323")
        val userId: String,
        @field:Schema(description = "마지막 메시지", example = "안녕하세요, 상담사님!", nullable = true)
        val lastMessage: String?,
        @field:Schema(description = "마지막 채팅 날짜", example = "2024-12-29T12:34:56.000Z", nullable = true)
        val lastChatedAt: String?,
        @field:Schema(description = "프롬프트 버전 ID", example = "5435345345")
        val promptVersionId: String,
        @field:Schema(description = "상담 생성 시간")
        val createdAt: String,
        @field:Schema(description = "상담 수정 시간")
        val updatedAt: String,
        @field:Schema(description = "상담 삭제 시간", nullable = true)
        val deletedAt: String?
    )

    @Schema(description = "상담 메세지")
    data class CounselMessage(
        @field:Schema(description = "메시지 ID")
        val id: String,
        @field:Schema(description = "상담 ID")
        val counselId: String,
        @field:Schema(description = "메시지 내용")
        val message: String,
        @field:Schema(description = "유저 메시지 여부")
        val isUserMessage: Boolean,
        @field:Schema(description = "메시지 반응 시간 (ISO 8601)", nullable = true)
        val reactedAt: String?,
        @field:Schema(description = "메시지 반응 객체", nullable = true)
        val reaction: CounselMessageReaction?,
        @field:Schema(description = "생성 시간 (ISO 8601)")
        val createdAt: String,
        @field:Schema(description = "수정 시간 (ISO 8601)")
        val updatedAt: String,
        @field:Schema(description = "삭제 시간 (ISO 8601)", nullable = true)
        val deletedAt: String?
    )

    @Schema(description = "상담사와 유저의 관계")
    data class CounselorUserRelationship(
        @field:Schema(description = "관계 ID")
        val id: String,
        @field:Schema(description = "상담사 ID")
        val counselorId: String,
        @field:Schema(description = "유저 ID")
        val userId: String,
        @field:Schema(description = "라포 점수")
        val rapport: Int,
        @field:Schema(description = "생성 시간 (ISO 8601)")
        val createdAt: String,
        @field:Schema(description = "수정 시간 (ISO 8601)")
        val updatedAt: String,
        @field:Schema(description = "삭제 시간 (ISO 8601)", nullable = true)
        val deletedAt: String?
    )

    @Schema(description = "상담 생성 요청")
    data class CreateCounselRequest(
        @field:Schema(description = "버블 ID", nullable = true)
        val bubbleId: String?,
        @field:Schema(description = "응답 옵션 번호", nullable = true)
        val responseOptionNo: Int?
    )

    @Schema(description = "상담 생성 응답")
    data class CreateCounselResponse(
        @field:Schema(description = "생성된 상담")
        val counsel: Counsel,
        @field:Schema(description = "상담 메시지 목록")
        val counselMessages: List<CounselMessage>
    )

    @Schema(description = "상담 목록 조회 응답")
    data class FindCounselsResponse(
        @field:Schema(description = "상담 목록")
        val counsels: List<Counsel>
    )

    @Schema(description = "상담 단건 조회 응답")
    data class FindCounselByIdResponse(
        @field:Schema(description = "상담", nullable = true)
        val counsel: Counsel?
    )

    @Schema(description = "메시지 생성 요청")
    data class CreateMessageRequest(
        @field:Schema(description = "메시지 내용", required = true)
        val message: String
    )

    @Schema(description = "메시지 생성 응답")
    data class CreateMessageResponse(
        @field:Schema(description = "생성된 상담 메시지")
        val createdCounselMessage: CounselMessage,
        @field:Schema(description = "상담사 응답 메시지")
        val counselorResponseMessage: CounselMessage
    )

    @Schema(description = "메시지 목록 조회 응답")
    data class FindMessagesResponse(
        @field:Schema(description = "상담 메시지 목록")
        val counselMessages: List<CounselMessage>
    )

    @Schema(description = "메시지 반응 요청")
    data class ReactMessageRequest(
        @field:Schema(description = "메시지 반응", required = true)
        val reaction: CounselMessageReaction
    )

    @Schema(description = "메시지 반응 응답")
    data class ReactMessageResponse(
        @field:Schema(description = "반응이 추가된 상담 메시지")
        val counselMessage: CounselMessage
    )

    @Schema(description = "상담사와 유저 관계 조회 응답")
    data class FindCounselorUserRelationshipsResponse(
        @field:Schema(description = "상담사와 유저 관계 목록")
        val counselorUserRelationships: List<CounselorUserRelationship>
    )
}
