package com.hearlers.gateway.presentation.http.v1.prompt.admin.dto

import com.hearlers.api.proto.v1.model.AiModel
import io.swagger.v3.oas.annotations.media.Schema

object PromptVersionDto {
    @Schema(description = "프롬프트 버전 응답 DTO")
    data class ResponseModel(
        @field:Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        val id: String,

        @field:Schema(description = "프롬프트 버전 이름", example = "2024년 6월 프롬프트 버전")
        val name: String,

        @field:Schema(description = "프롬프트 버전 설명", example = "2024년 6월 배포 버전입니다.")
        val description: String,

        @field:Schema(description = "활성화 여부", example = "true")
        val isActive: Boolean,

        @field:Schema(description = "임시 버전 여부", example = "false")
        val isTemporary: Boolean,

        @field:Schema(description = "북마크 여부", example = "false")
        val isBookmarked: Boolean,

        @field:Schema(description =  "AI 모델")
        val aiModel: AiModel,

        @field:Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        val createdAt: String,

        @field:Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        val updatedAt: String,

        @field:Schema(description = "삭제 시간", example = "null")
        val deletedAt: String?,
    )

    @Schema(description = "프롬프트 버전 조회 요청 DTO")
    data class FindRequest(
        @field:Schema(description = "프롬프트 버전 이름", example = "2024년")
        val name: String?,
    )

    @Schema(description = "프롬프트 버전 수정 요청 DTO")
    data class UpdateRequest(
        @field:Schema(description = "프롬프트 버전 이름", example = "2024년 7월 프롬프트 버전")
        val name: String,

        @field:Schema(description = "프롬프트 버전 설명", example = "2024년 7월 배포 예정 버전입니다.")
        val description: String,

        @field:Schema(description = "북마크 여부", example = "false")
        val isBookmarked: Boolean,

        @field:Schema(description = "AI 모델", example = "gpt-4o-mini")
        val aiModel: AiModel,
    )

    @Schema(description = "프롬프트 버전 수정 응답 DTO")
    data class UpdateResponse(
        @field:Schema(description = "프롬프트 버전")
        val promptVersion: ResponseModel,
    )

    @Schema(description = "프롬프트 버전 삭제 응답 DTO")
    data class DeleteResponse(
        @field:Schema(description = "프롬프트 버전 삭제 성공 여부", example = "true")
        val isSuccess: Boolean,
    )

    @Schema(description = "임시 버전 저장 요청 DTO")
    data class SaveTemporaryVersionRequest(
        @field:Schema(description = "프롬프트 버전 이름", example = "2024년 7월 프롬프트 버전")
        val name: String,

        @field:Schema(description = "프롬프트 버전 설명", example = "2024년 7월 배포 예정 버전입니다.")
        val description: String,

        @field:Schema(description = "북마크 여부")
        val isBookmarked: Boolean,

        @field:Schema(description = "AI 모델")
        val aiModel: AiModel,
    )

    @Schema(description = "임시 버전 저장 응답 DTO")
    data class SaveTemporaryVersionResponse(
        @field:Schema(description = "프롬프트 버전")
        val promptVersion: ResponseModel,
    )

    @Schema(description = "프롬프트 버전 활성화 응답 DTO")
    data class ActivatePromptVersionResponse(
        @field:Schema(description = "프롬프트 버전")
        val promptVersion: ResponseModel,
    )

    @Schema(description = "프롬프트 버전 목록 조회 응답 DTO")
    data class FindResponse(
        @field:Schema(description = "프롬프트 버전 목록")
        val promptVersions: List<ResponseModel>,
    )

    @Schema(description = "프롬프트 버전 조회 응답 DTO")
    data class FindByIdResponse(
        @field:Schema(description = "프롬프트 버전")
        val promptVersion: ResponseModel,
    )

    @Schema(description = "활성 버전 조회 응답 DTO")
    data class FindActiveVersionResponse(
        @field:Schema(description = "프롬프트 버전")
        val promptVersion: ResponseModel,
    )

    @Schema(description = "임시 버전 조회 응답 DTO")
    data class FindTemporaryVersionResponse(
        @field:Schema(description = "프롬프트 버전")
        val promptVersion: ResponseModel,
    )

    @Schema(description = "기존 프롬프트 버전 로드 응답 DTO")
    data class LoadExistingPromptVersionResponse(
        @field:Schema(description = "프롬프트 버전")
        val promptVersion: ResponseModel,
    )
}
