package com.hearlers.gateway.presentation.http.v1.prompt.admin.dto

import io.swagger.v3.oas.annotations.media.Schema

object PersonaPromptDto {
    @Schema(description = "페르소나 프롬프트 응답 DTO")
    data class ResponseModel(
        @field:Schema(description = "페르소나 프롬프트 ID", example = "pp_123456")
        val id: String,

        @field:Schema(description =  "프롬프트 버전 ID", example = "334324523543")
        val promptVersionId: String,

        @field:Schema(description = "페르소나 프롬프트 내용", example = "저는 10년 경력의 심리상담사로, 우울증과 불안장애 분야를 전문으로 다룹니다.")
        val body: String,

        @field:Schema(description = "상담사 ID", example = "counselor_123456")
        val counselorId: String,

        @field:Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        val createdAt: String,

        @field:Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        val updatedAt: String,

        @field:Schema(description = "삭제 시간", example = "null")
        val deletedAt: String?,
    )

    @Schema(description = "페르소나 프롬프트 조회 응답 DTO")
    data class FindByIdResponse(
        @field:Schema(description = "페르소나 프롬프트")
        val personaPrompt: ResponseModel,
    )

    @Schema(description = "페르소나 프롬프트 전체 조회 요청 DTO")
    data class FindRequest(
        @field:Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        val promptVersionId: String,

        @field:Schema(description = "상담사 ID", example = "counselor_123456")
        val counselorId: String,
    )

    @Schema(description = "페르소나 프롬프트 전체 조회 응답 DTO")
    data class FindResponse(
        @field:Schema(description = "페르소나 프롬프트 목록")
        val personaPrompts: List<ResponseModel>,
    )

    @Schema(description = "페르소나 프롬프트 업데이트 요청 DTO")
    data class UpdateRequest(
        @field:Schema(description = "상담사 ID", example = "counselor_123456")
        val counselorId: String,

        @field:Schema(description = "페르소나 프롬프트 내용", example = "저는 12년 경력의 심리상담사로, 우울증, 불안장애, 트라우마 분야를 전문으로 다룹니다.")
        val body: String,
    )

    @Schema(description = "페르소나 프롬프트 업데이트 응답 DTO")
    data class UpdateResponse(
        @field:Schema(description = "페르소나 프롬프트")
        val personaPrompt: ResponseModel,
    )
}