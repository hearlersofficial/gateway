package com.hearlers.gateway.presentation.http.v1.prompt.admin.dto

import com.hearlers.api.proto.v1.model.*
import io.swagger.v3.oas.annotations.media.Schema

object CounselTechniqueTransitionRuleDto {
    @Schema(description = "상담 기법 전환 규칙 응답 DTO")
    data class ResponseModel(
        @field:Schema(description = "상담 기법 전환 규칙 ID", example = "cttr_12345678")
        val id: String,

        @field:Schema(description = "프롬프트 버전 ID", example = "pv_12345678")
        val promptVersionId: String,

        @field:Schema(description = "선행 상담 기법 ID", example = "ct_12345678")
        val fromCounselTechniqueId: String,

        @field:Schema(description = "타겟 상담 기법 ID", example = "ct_87654321")
        val toCounselTechniqueId: String,

        @field:Schema(description = "우선순위", example = "1")
        val priority: Int,

        @field:Schema(description = "최소 현재 기법 메시지 개수", example = "3")
        val minCurrentTechniqueMessageCount: Int?,

        @field:Schema(description = "최대 현재 기법 메시지 개수", example = "8")
        val maxCurrentTechniqueMessageCount: Int?,

        @field:Schema(description = "필수 영향 도메인")
        val requiredImpactDomains: List<ImpactDomain>,

        @field:Schema(description = "필수 시간 프레임")
        val requiredTimeframes: List<Timeframe>,

        @field:Schema(description = "필수 1차 감정")
        val requiredEmotionPrimaries: List<EmotionPrimary>,

        @field:Schema(description = "필수 감정 긍부정")
        val requiredValences: List<Valence>,

        @field:Schema(description = "필수 감정 각성 수준")
        val requiredArousalLevels: List<ArousalLevel>,

        @field:Schema(description = "최소 감정 강도", example = "3")
        val minEmotionIntensity: Int?,

        @field:Schema(description = "최대 감정 강도", example = "7")
        val maxEmotionIntensity: Int?,

        @field:Schema(description = "필수 인지된 통제 수준")
        val requiredPerceivedControls: List<PerceivedControl>,

        @field:Schema(description = "필수 동기 단계")
        val requiredMotivationStages: List<MotivationStage>,

        @field:Schema(description = "최소 자기 효능감", example = "4")
        val minSelfEfficacy: Int?,

        @field:Schema(description = "최대 자기 효능감", example = "8")
        val maxSelfEfficacy: Int?,

        @field:Schema(description = "필수 사회적 지지 수준")
        val requiredSocialSupportLevels: List<SocialSupportLevel>,

        @field:Schema(description = "필수 위험 종류")
        val requiredRiskKinds: List<RiskKind>,

        @field:Schema(description = "최소 위험 심각도", example = "2")
        val minRiskSeverity: Int?,

        @field:Schema(description = "최대 위험 심각도", example = "5")
        val maxRiskSeverity: Int?,

        @field:Schema(description = "필수 수면의 질")
        val requiredSleepQualities: List<SleepQuality>,

        @field:Schema(description = "신체 증상 존재 여부 필요 조건", example = "true")
        val requiredPhysicalSymptomsPresent: Boolean?,

        @field:Schema(description = "필수 인지 부하 수준")
        val requiredCognitiveLoads: List<CognitiveLoad>,

        @field:Schema(description = "필수 동맹 강도")
        val requiredAllianceStrengths: List<AllianceStrength>,

        @field:Schema(description = "심층 탐색 동의 필요 여부", example = "false")
        val requiredConsentToDepth: Boolean?,

        @field:Schema(description = "생성 시각", example = "2025-08-24T17:30:00Z    ")
        val createdAt: String,

        @field:Schema(description = "수정 시각", example = "2025-08-24T18:00:00Z")
        val updatedAt: String,

        @field:Schema(description = "삭제 시각", example = "null")
        val deletedAt: String?,
    )

    @Schema(description = "상담 기법 전환 규칙 생성 요청 DTO")
    data class CreateRequest(
        @field:Schema(description = "선행 상담 기법 ID", example = "ct_12345678")
        val fromCounselTechniqueId: String,

        @field:Schema(description = "타겟 상담 기법 ID", example = "ct_87654321")
        val toCounselTechniqueId: String,

        @field:Schema(description = "우선순위", example = "1")
        val priority: Int,

        @field:Schema(description = "최소 현재 기법 메시지 개수", example = "3")
        val minCurrentTechniqueMessageCount: Int?,

        @field:Schema(description = "최대 현재 기법 메시지 개수", example = "8")
        val maxCurrentTechniqueMessageCount: Int?,

        @field:Schema(description = "필수 영향 도메인")
        val requiredImpactDomains: List<ImpactDomain>,

        @field:Schema(description = "필수 시간 프레임")
        val requiredTimeframes: List<Timeframe>,

        @field:Schema(description = "필수 1차 감정")
        val requiredEmotionPrimaries: List<EmotionPrimary>,

        @field:Schema(description = "필수 감정 긍부정")
        val requiredValences: List<Valence>,

        @field:Schema(description = "필수 감정 각성 수준")
        val requiredArousalLevels: List<ArousalLevel>,

        @field:Schema(description = "최소 감정 강도", example = "3")
        val minEmotionIntensity: Int?,

        @field:Schema(description = "최대 감정 강도", example = "7")
        val maxEmotionIntensity: Int?,

        @field:Schema(description = "필수 인지된 통제 수준")
        val requiredPerceivedControls: List<PerceivedControl>,

        @field:Schema(description = "필수 동기 단계")
        val requiredMotivationStages: List<MotivationStage>,

        @field:Schema(description = "최소 자기 효능감", example = "4")
        val minSelfEfficacy: Int?,

        @field:Schema(description = "최대 자기 효능감", example = "8")
        val maxSelfEfficacy: Int?,

        @field:Schema(description = "필수 사회적 지지 수준")
        val requiredSocialSupportLevels: List<SocialSupportLevel>,

        @field:Schema(description = "필수 위험 종류")
        val requiredRiskKinds: List<RiskKind>,

        @field:Schema(description = "최소 위험 심각도", example = "2")
        val minRiskSeverity: Int?,

        @field:Schema(description = "최대 위험 심각도", example = "5")
        val maxRiskSeverity: Int?,

        @field:Schema(description = "필수 수면의 질")
        val requiredSleepQualities: List<SleepQuality>,

        @field:Schema(description = "신체 증상 존재 여부 필요 조건", example = "true")
        val requiredPhysicalSymptomsPresent: Boolean,

        @field:Schema(description = "필수 인지 부하 수준")
        val requiredCognitiveLoads: List<CognitiveLoad>,

        @field:Schema(description = "필수 동맹 강도")
        val requiredAllianceStrengths: List<AllianceStrength>,

        @field:Schema(description = "심층 탐색 동의 필요 여부", example = "false")
        val requiredConsentToDepth: Boolean?,
    )

    @Schema(description = "상담 기법 전환 조건 생성 응답 DTO")
    data class CreateResponse(
        @field:Schema(description = "상담 기번 전환 조건")
        val counselTechniqueTransitionRule: ResponseModel,
    )

    @Schema(description = "상담 기법 전환 규칙 수정 요청 DTO")
    data class UpdateRequest(
        @field:Schema(description = "우선순위", example = "1")
        val priority: Int,

        @field:Schema(description = "최소 현재 기법 메시지 개수", example = "3")
        val minCurrentTechniqueMessageCount: Int?,

        @field:Schema(description = "최대 현재 기법 메시지 개수", example = "8")
        val maxCurrentTechniqueMessageCount: Int?,

        @field:Schema(description = "필수 영향 도메인")
        val requiredImpactDomains: List<ImpactDomain>,

        @field:Schema(description = "필수 시간 프레임")
        val requiredTimeframes: List<Timeframe>,

        @field:Schema(description = "필수 1차 감정")
        val requiredEmotionPrimaries: List<EmotionPrimary>,

        @field:Schema(description = "필수 감정 긍부정")
        val requiredValences: List<Valence>,

        @field:Schema(description = "필수 감정 각성 수준")
        val requiredArousalLevels: List<ArousalLevel>,

        @field:Schema(description = "최소 감정 강도", example = "3")
        val minEmotionIntensity: Int?,

        @field:Schema(description = "최대 감정 강도", example = "7")
        val maxEmotionIntensity: Int?,

        @field:Schema(description = "필수 인지된 통제 수준")
        val requiredPerceivedControls: List<PerceivedControl>,

        @field:Schema(description = "필수 동기 단계")
        val requiredMotivationStages: List<MotivationStage>,

        @field:Schema(description = "최소 자기 효능감", example = "4")
        val minSelfEfficacy: Int?,

        @field:Schema(description = "최대 자기 효능감", example = "8")
        val maxSelfEfficacy: Int?,

        @field:Schema(description = "필수 사회적 지지 수준")
        val requiredSocialSupportLevels: List<SocialSupportLevel>,

        @field:Schema(description = "필수 위험 종류")
        val requiredRiskKinds: List<RiskKind>,

        @field:Schema(description = "최소 위험 심각도", example = "2")
        val minRiskSeverity: Int?,

        @field:Schema(description = "최대 위험 심각도", example = "5")
        val maxRiskSeverity: Int?,

        @field:Schema(description = "필수 수면의 질")
        val requiredSleepQualities: List<SleepQuality>,

        @field:Schema(description = "신체 증상 존재 여부 필요 조건", example = "true")
        val requiredPhysicalSymptomsPresent: Boolean?,

        @field:Schema(description = "필수 인지 부하 수준")
        val requiredCognitiveLoads: List<CognitiveLoad>,

        @field:Schema(description = "필수 동맹 강도")
        val requiredAllianceStrengths: List<AllianceStrength>,

        @field:Schema(description = "심층 탐색 동의 필요 여부", example = "false")
        val requiredConsentToDepth: Boolean?,
    )

    @Schema(description = "상담 기법 전환 조건 수정 응답 DTO")
    data class UpdateResponse(
        @field:Schema(description = "상담 기번 전환 조건")
        val counselTechniqueTransitionRule: ResponseModel,
    )

    @Schema(description = "상담 기법 전환 조건 삭제 응답 DTO")
    data class DeleteResponse(
        @field:Schema(description = "프롬프트 버전 삭제 성공 여부", example = "true")
        val isSuccess: Boolean,
    )

    @Schema(description = "상담 기법 전환 조건 조회 응답 DTO")
    data class FindByIdResponse(
        @field:Schema(description = "상담 기번 전환 조건")
        val counselTechniqueTransitionRule: ResponseModel,
    )

    @Schema(description = "상담 기법 전환 조건 목록 조회 요청 DTO")
    data class FindRequest(
        @field:Schema(description = "선행 상담 기법 ID", example = "ct_123456")
        val fromCounselTechniqueId: String?,

        @field:Schema(description = "후행 상담 기법 ID", example = "ct_123456")
        val toCounselTechniqueId: String?,

        @field:Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        val promptVersionId: String?,
    )

    @Schema(description = "상담 기법 전환 조건 목록 조회 응답 DTO")
    data class FindResponse(
        @field:Schema(description = "상담 기번 전환 조건 목록")
        val counselTechniqueTransitionRules: List<ResponseModel>,
    )

}