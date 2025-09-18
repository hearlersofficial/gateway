package com.hearlers.gateway.presentation.http.v1.prompt.admin.dto

import io.swagger.v3.oas.annotations.media.Schema


object CounselTechniqueDto {
    @Schema(description = "상담 기법 응답 DTO")
    data class ResponseModel(
        @field:Schema(description = "상담 기법 ID", example = "ct_123456")
        val id: String,

        @field:Schema(description =  "프롬프트 버전 ID", example = "334324523543")
        val promptVersionId: String,

        @field:Schema(description = "상담 기법 이름", example = "공감 반응 기법")
        val name: String,

        @field:Schema(description = "톤 ID", example = "tone_123456")
        val toneId: String,

        @field:Schema(description = "컨텍스트", example = "내담자의 감정에 공감하는 컨텍스트")
        val context: String,

        @field:Schema(description = "지시사항", example = "내담자의 감정을 반영하고 공감하세요.")
        val instruction: String,

        @field:Schema(description = "시작 기법 여부", example = "false")
        val isStartTechnique: Boolean,

        @field:Schema(description = "AI 모델 temperature 값")
        val temperature: Double,

        @field:Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        val createdAt: String,

        @field:Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        val updatedAt: String,

        @field:Schema(description = "삭제 시간", example = "null")
        val deletedAt: String?,
    )

    @Schema(description = "상담 기법 생성 요청 DTO")
    data class CreateRequest(
        @field:Schema(description = "상담 기법 이름", example = "공감 반응 기법")
        val name: String,

        @field:Schema(description = "톤 ID", example = "tone_123456")
        val toneId: String,

        @field:Schema(description = "컨텍스트", example = "내담자의 감정에 공감하는 컨텍스트")
        val context: String,

        @field:Schema(description = "지시사항", example = "내담자의 감정을 반영하고 공감하세요.")
        val instruction: String,

        @field:Schema(description = "AI 모델 temperature 값")
        val temperature: Double,

        @field:Schema(description = "시작 기법 여부")
        val isStartTechnique: Boolean,
    )

    @Schema(description = "상담 기법 업데이트 요청 DTO")
    data class UpdateRequest(
        @field:Schema(description = "상담 기법 이름", example = "개선된 공감 반응 기법")
        val name: String,

        @field:Schema(description = "컨텍스트", example = "내담자의 감정에 더 깊이 공감하는 컨텍스트")
        val context: String,

        @field:Schema(description = "지시사항", example = "내담자의 감정을 더 깊이 반영하고 공감하세요.")
        val instruction: String,

        @field:Schema(description = "AI 모델 temperature 값")
        val temperature: Double,

        @field:Schema(description = "시작 기법 여부")
        val isStartTechnique: Boolean,
    )

    @Schema(description = "상담 기법 생성 응답 DTO")
    data class CreateResponse(
        @field:Schema(description = "상담 기법")
        val counselTechnique: ResponseModel,
    ) 

    @Schema(description = "상담 기법 전체 조회 응답 DTO")
    data class FindResponse(
        @field:Schema(description = "상담 기법 목록")
        val counselTechniques: List<ResponseModel>,
    ) 

    @Schema(description = "상담 기법 조회 응답 DTO")
    data class FindByIdResponse(
        @field:Schema(description = "상담 기법")
        val counselTechnique: ResponseModel,
    ) 

    @Schema(description = "상담 기법 업데이트 응답 DTO")
    data class UpdateResponse(
        @field:Schema(description = "상담 기법")
        val counselTechnique: ResponseModel,
    ) 

    @Schema(description = "상담 기법 전체 조회 요청 DTO")
    data class FindRequest(
        @field:Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        val promptVersionId: String?,

        @field:Schema(description = "톤 ID", example = "tone_123456")
        val toneId: String?
    )
}