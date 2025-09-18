package com.hearlers.gateway.presentation.http.v1.prompt.admin.dto

import io.swagger.v3.oas.annotations.media.Schema


object PromptActivateHistoryDto {

    @Schema(description = "프롬프트 활성화 히스토리 응답 DTO")
    data class ResponseModel(
        @field:Schema(description = "프롬프트 활성화 히스토리 ID", example = "pah_123456")
        val id: String,

        @field:Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        val promptVersionId: String,

        @field:Schema(description = "활성화 시간", example = "2024-06-01T12:34:56.000Z")
        val activatedAt: String,

        @field:Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        val createdAt: String,

        @field:Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        val updatedAt: String,

        @field:Schema(description = "삭제 시간", example = "null")
        val deletedAt: String?,
    )

    @Schema(description = "프롬프트 활성화 히스토리 목록 조회 응답 DTO")
    data class FindResponse(
        @field:Schema(description = "프롬프트 활성화 히스토리 목록")
        val promptActivateHistories: List<ResponseModel>,
    )

}

