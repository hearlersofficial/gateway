package com.hearlers.gateway.presentation.http.v1.prompt.admin;

import java.util.List;

import com.hearlers.api.proto.v1.model.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestParam;

public class CounselPromptDto {

    // PromptVersion 관련 DTO
    @Getter
    @Builder
    @Schema(description = "프롬프트 버전 응답 DTO")
    public static class PromptVersionResponseDto {
        @Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        private String id;
        
        @Schema(description = "프롬프트 버전 이름", example = "2024년 6월 프롬프트 버전")
        private String name;
        
        @Schema(description = "프롬프트 버전 설명", example = "2024년 6월 배포 버전입니다.")
        private String description;
        
        @Schema(description = "활성화 여부", example = "true")
        private Boolean isActive;
        
        @Schema(description = "임시 버전 여부", example = "false")
        private Boolean isTemporary;
        
        @Schema(description = "북마크 여부", example = "false")
        private Boolean isBookmarked;

        @Schema(description =  "AI 모델")
        private AiModel aiModel;
        
        @Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        private String createdAt;
        
        @Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "삭제 시간", example = "null")
        private String deletedAt;
    }
    
    @Getter
    @Builder
    @Schema(description = "상담사별 프롬프트 응답 DTO")
    public static class CounselorScopedPromptResponseDto {
        @Schema(description = "상담사 ID", example = "counselor_123456")
        private String counselorId;
        
        @Schema(description = "페르소나 프롬프트 ID", example = "pp_123456")
        private String personaPromptId;
        
        @Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        private String createdAt;
        
        @Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "삭제 시간", example = "null")
        private String deletedAt;
    }
    
    @Getter
    @Builder
    @Schema(description = "톤별 프롬프트 응답 DTO")
    public static class ToneScopedPromptResponseDto {
        @Schema(description = "톤 ID", example = "tone_123456")
        private String toneId;
        
        @Schema(description = "톤 프롬프트 ID", example = "tp_123456")
        private String tonePromptId;
        
        @Schema(description = "첫 번째 상담 기법 ID", example = "ct_123456")
        private String firstCounselTechniqueId;
        
        @Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        private String createdAt;
        
        @Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "삭제 시간", example = "null")
        private String deletedAt;
    }
    
    // PersonaPrompt 관련 DTO
    @Getter
    @Builder
    @Schema(description = "페르소나 프롬프트 응답 DTO")
    public static class PersonaPromptResponseDto {
        @Schema(description = "페르소나 프롬프트 ID", example = "pp_123456")
        private String id;

        @Schema(description =  "프롬프트 버전 ID", example = "334324523543")
        private String promptVersionId;
        
        @Schema(description = "페르소나 프롬프트 내용", example = "저는 10년 경력의 심리상담사로, 우울증과 불안장애 분야를 전문으로 다룹니다.")
        private String body;
        
        @Schema(description = "상담사 ID", example = "counselor_123456")
        private String counselorId;
        
        @Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        private String createdAt;
        
        @Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "삭제 시간", example = "null")
        private String deletedAt;
    }
    
    // TonePrompt 관련 DTO
    @Getter
    @Builder
    @Schema(description = "톤 프롬프트 응답 DTO")
    public static class TonePromptResponseDto {
        @Schema(description = "톤 프롬프트 ID", example = "tp_123456")
        private String id;

        @Schema(description =  "프롬프트 버전 ID", example = "334324523543")
        private String promptVersionId;
        
        @Schema(description = "톤 프롬프트 내용", example = "공감적이고 따뜻한 어조로 대화하세요.")
        private String body;
        
        @Schema(description = "톤 ID", example = "tone_123456")
        private String toneId;
        
        @Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        private String createdAt;
        
        @Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "삭제 시간", example = "null")
        private String deletedAt;
    }
    
    // CounselTechnique 관련 DTO
    @Getter
    @Builder
    @Schema(description = "상담 기법 응답 DTO")
    public static class CounselTechniqueResponseDto {
        @Schema(description = "상담 기법 ID", example = "ct_123456")
        private String id;

        @Schema(description =  "프롬프트 버전 ID", example = "334324523543")
        private String promptVersionId;

        @Schema(description = "상담 기법 이름", example = "공감 반응 기법")
        private String name;
        
        @Schema(description = "톤 ID", example = "tone_123456")
        private String toneId;
        
        @Schema(description = "컨텍스트", example = "내담자의 감정에 공감하는 컨텍스트")
        private String context;
        
        @Schema(description = "지시사항", example = "내담자의 감정을 반영하고 공감하세요.")
        private String instruction;
        
        @Schema(description = "메시지 임계값", example = "3")
        private int messageThreshold;
        
        @Schema(description = "시작 기법 여부", example = "false")
        private Boolean isStartTechnique;

        @Schema(description = "AI 모델 temperature 값")
        private double temperature;
        
        @Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        private String createdAt;
        
        @Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "삭제 시간", example = "null")
        private String deletedAt;
    }
    
    // PromptActivateHistory 관련 DTO
    @Getter
    @Builder
    @Schema(description = "프롬프트 활성화 히스토리 응답 DTO")
    public static class PromptActivateHistoryResponseDto {
        @Schema(description = "프롬프트 활성화 히스토리 ID", example = "pah_123456")
        private String id;
        
        @Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        private String promptVersionId;
        
        @Schema(description = "활성화 시간", example = "2024-06-01T12:34:56.000Z")
        private String activatedAt;
        
        @Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        private String createdAt;
        
        @Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "삭제 시간", example = "null")
        private String deletedAt;
    }



    @Getter
    @Builder
    @Schema(description = "상담 기법 전환 규칙 응답 DTO")
    public static class CounselTechniqueTransitionRuleResponseDto {
        @Schema(description = "상담 기법 전환 규칙 ID", example = "cttr_12345678")
        private String id;

        @Schema(description = "프롬프트 버전 ID", example = "pv_12345678")
        private String promptVersionId;

        @Schema(description = "선행 상담 기법 ID", example = "ct_12345678")
        private String fromCounselTechniqueId;

        @Schema(description = "타겟 상담 기법 ID", example = "ct_87654321")
        private String toCounselTechniqueId;

        @Schema(description = "우선순위", example = "1")
        private int priority;

        @Schema(description = "최소 현재 기법 메시지 개수", example = "3")
        private Integer minCurrentTechniqueMessageCount;

        @Schema(description = "최대 현재 기법 메시지 개수", example = "8")
        private Integer maxCurrentTechniqueMessageCount;

        @Schema(description = "필수 영향 도메인")
        private List<ImpactDomain> requiredImpactDomains;

        @Schema(description = "필수 시간 프레임")
        private List<Timeframe> requiredTimeframes;

        @Schema(description = "필수 1차 감정")
        private List<EmotionPrimary> requiredEmotionPrimaries;

        @Schema(description = "필수 감정 긍부정")
        private List<Valence> requiredValences;

        @Schema(description = "필수 감정 각성 수준")
        private List<ArousalLevel> requiredArousalLevels;

        @Schema(description = "최소 감정 강도", example = "3")
        private Integer minEmotionIntensity;

        @Schema(description = "최대 감정 강도", example = "7")
        private Integer maxEmotionIntensity;

        @Schema(description = "필수 인지된 통제 수준")
        private List<PerceivedControl> requiredPerceivedControls;

        @Schema(description = "필수 동기 단계")
        private List<MotivationStage> requiredMotivationStages;

        @Schema(description = "최소 자기 효능감", example = "4")
        private Integer minSelfEfficacy;

        @Schema(description = "최대 자기 효능감", example = "8")
        private Integer maxSelfEfficacy;

        @Schema(description = "필수 사회적 지지 수준")
        private List<SocialSupportLevel> requiredSocialSupportLevels;

        @Schema(description = "필수 위험 종류")
        private List<RiskKind> requiredRiskKinds;

        @Schema(description = "최소 위험 심각도", example = "2")
        private Integer minRiskSeverity;

        @Schema(description = "최대 위험 심각도", example = "5")
        private Integer maxRiskSeverity;

        @Schema(description = "필수 수면의 질")
        private List<SleepQuality> requiredSleepQualities;

        @Schema(description = "신체 증상 존재 여부 필요 조건", example = "true")
        private Boolean requiredPhysicalSymptomsPresent;

        @Schema(description = "필수 인지 부하 수준")
        private List<CognitiveLoad> requiredCognitiveLoads;

        @Schema(description = "필수 동맹 강도")
        private List<AllianceStrength> requiredAllianceStrengths;

        @Schema(description = "심층 탐색 동의 필요 여부", example = "false")
        private Boolean requiredConsentToDepth;

        @Schema(description = "생성 시각", example = "2025-08-24T17:30:00Z")
        private String createdAt;

        @Schema(description = "수정 시각", example = "2025-08-24T18:00:00Z")
        private String updatedAt;

        @Schema(description = "삭제 시각", example = "null")
        private String deletedAt;
    }


    // 요청 DTO
    @Getter
    @Builder
    @Schema(description = "프롬프트 버전 조회 요청 DTO")
    public static class FindPromptVersionsRequestDto {
        @Schema(description = "프롬프트 버전 이름", example = "2024년")
        private String name;

    }

    @Getter
    @Builder
    @Schema(description = "프롬프트 버전 수정 요청 DTO")
    public static class UpdatePromptVersionRequestDto {
        @Schema(description = "프롬프트 버전 이름", example = "2024년 7월 프롬프트 버전")
        private String name;

        @Schema(description = "프롬프트 버전 설명", example = "2024년 7월 배포 예정 버전입니다.")
        private String description;
        
        @Schema(description = "북마크 여부", example = "false")
        private Boolean isBookmarked;

        @Schema(description = "AI 모델", example = "gpt-4o-mini")
        private AiModel aiModel;
    }

    @Getter
    @Builder
    @Schema(description = "프롬프트 버전 수정 응답 DTO")
    public static class UpdatePromptVersionResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }



    @Getter
    @Builder
    @Schema(description = "프롬프트 버전 삭제 응답 DTO")
    public static class DeletePromptVersionResponseDto {
        @Schema(description = "프롬프트 버전 삭제 성공 여부", example = "true")
        private Boolean isSuccess;
    }
        

    @Getter
    @Builder
    @Schema(description = "임시 버전 저장 요청 DTO")
    public static class SaveTemporaryVersionRequestDto {
        @NotBlank(message = "이름은 필수 입력 사항입니다.")
        @Schema(description = "프롬프트 버전 이름", example = "2024년 7월 프롬프트 버전")
        private String name;
        
        @NotBlank(message = "설명은 필수 입력 사항입니다.")
        @Schema(description = "프롬프트 버전 설명", example = "2024년 7월 배포 예정 버전입니다.")
        private String description;

        @NotNull
        @Schema(description = "북마크 여부")
        private Boolean isBookmarked;

        @NotNull
        @Schema(description = "AI 모델")
        private AiModel aiModel;
    }
    
    @Getter
    @Builder
    @Schema(description = "톤 프롬프트 업데이트 요청 DTO")
    public static class UpdateTonePromptRequestDto {
        @NotBlank(message = "톤 ID는 필수 입력 사항입니다.")
        @Schema(description = "톤 ID", example = "tone_123456")
        private String toneId;
        
        @NotBlank(message = "내용은 필수 입력 사항입니다.")
        @Schema(description = "톤 프롬프트 내용", example = "공감적이고 따뜻한 어조로 대화하세요.")
        private String body;
    }
    
    @Getter
    @Builder
    @Schema(description = "페르소나 프롬프트 업데이트 요청 DTO")
    public static class UpdatePersonaPromptRequestDto {
        @NotBlank(message = "상담사 ID는 필수 입력 사항입니다.")
        @Schema(description = "상담사 ID", example = "counselor_123456")
        private String counselorId;
        
        @NotBlank(message = "내용은 필수 입력 사항입니다.")
        @Schema(description = "페르소나 프롬프트 내용", example = "저는 12년 경력의 심리상담사로, 우울증, 불안장애, 트라우마 분야를 전문으로 다룹니다.")
        private String body;
    }
    
    @Getter
    @Builder
    @Schema(description = "상담 기법 생성 요청 DTO")
    public static class CreateCounselTechniqueRequestDto {
        @NotBlank(message = "이름은 필수 입력 사항입니다.")
        @Schema(description = "상담 기법 이름", example = "공감 반응 기법")
        private String name;
        
        @NotBlank(message = "톤 ID는 필수 입력 사항입니다.")
        @Schema(description = "톤 ID", example = "tone_123456")
        private String toneId;
        
        @NotBlank(message = "컨텍스트는 필수 입력 사항입니다.")
        @Schema(description = "컨텍스트", example = "내담자의 감정에 공감하는 컨텍스트")
        private String context;
        
        @NotBlank(message = "지시사항은 필수 입력 사항입니다.")
        @Schema(description = "지시사항", example = "내담자의 감정을 반영하고 공감하세요.")
        private String instruction;
        
        @NotNull(message = "메시지 임계값은 필수 입력 사항입니다.")
        @Schema(description = "메시지 임계값", example = "3")
        private Integer messageThreshold;

        @NotNull(message = "temperature 은 필수 입력 사항입니다.")
        @Schema(description = "AI 모델 temperature 값")
        private double temperature;
    }
    
    @Getter
    @Builder
    @Schema(description = "상담 기법 업데이트 요청 DTO")
    public static class UpdateCounselTechniqueRequestDto {
        @Schema(description = "상담 기법 이름", example = "개선된 공감 반응 기법")
        private String name;
        
        @Schema(description = "컨텍스트", example = "내담자의 감정에 더 깊이 공감하는 컨텍스트")
        private String context;
        
        @Schema(description = "지시사항", example = "내담자의 감정을 더 깊이 반영하고 공감하세요.")
        private String instruction;
        
        @Schema(description = "메시지 임계값", example = "5")
        private Integer messageThreshold;

        @Schema(description = "AI 모델 temperature 값")
        private double temperature;
    }
    
    @Getter
    @Builder
    @Schema(description = "상담 기법 시퀀스 저장 요청 DTO")
    public static class SaveCounselTechniqueSequenceRequestDto {
        @NotBlank(message = "톤 ID는 필수 입력 사항입니다.")
        @Schema(description = "톤 ID", example = "tone_123456")
        private String toneId;
        
        @NotEmpty(message = "상담 기법 ID 목록은 필수 입력 사항입니다.")
        @Schema(description = "상담 기법 ID 목록", example = "[\"ct_123456\", \"ct_789012\"]")
        private List<String> counselTechniqueIds;
    }
    
    // 응답 DTO
    @Getter
    @Builder
    @Schema(description = "프롬프트 버전 목록 조회 응답 DTO")
    public static class FindPromptVersionsResponseDto {
        @Schema(description = "프롬프트 버전 목록")
        private List<PromptVersionResponseDto> promptVersions;
    }
    
    @Getter
    @Builder
    @Schema(description = "프롬프트 버전 조회 응답 DTO")
    public static class FindPromptVersionByIdResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }

    @Getter
    @Builder
    @Schema(description = "활성 버전 조회 응답 DTO")
    public static class FindActiveVersionResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }

    @Getter
    @Builder
    @Schema(description = "임시 버전 조회 응답 DTO")
    public static class FindTemporaryVersionResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }
    
    @Getter
    @Builder
    @Schema(description = "기존 프롬프트 버전 로드 응답 DTO")
    public static class LoadExistingPromptVersionResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }
    
    @Getter
    @Builder
    @Schema(description = "임시 버전 저장 응답 DTO")
    public static class SaveTemporaryVersionResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }
    
    @Getter
    @Builder
    @Schema(description = "프롬프트 버전 활성화 응답 DTO")
    public static class ActivatePromptVersionResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }
    
    @Getter
    @Builder
    @Schema(description = "페르소나 프롬프트 조회 응답 DTO")
    public static class FindPersonaPromptByIdResponseDto {
        @Schema(description = "페르소나 프롬프트")
        private PersonaPromptResponseDto personaPrompt;
    }

    @Getter
    @Builder
    @Schema(description = "페르소나 프롬프트 전체 조회 응답 DTO")
    public static class FindPersonaPromptsResponseDto {
        @Schema(description = "페르소나 프롬프트 목록")
        private List<PersonaPromptResponseDto> personaPrompts;
    }
    
    @Getter
    @Builder
    @Schema(description = "페르소나 프롬프트 업데이트 응답 DTO")
    public static class UpdatePersonaPromptResponseDto {
        @Schema(description = "페르소나 프롬프트")
        private PersonaPromptResponseDto personaPrompt;
    }
    
    @Getter
    @Builder
    @Schema(description = "톤 프롬프트 조회 응답 DTO")
    public static class FindTonePromptByIdResponseDto {
        @Schema(description = "톤 프롬프트")
        private TonePromptResponseDto tonePrompt;
    }

    @Getter
    @Builder
    @Schema(description = "톤 프롬프트 전체 조회 응답 DTO")
    public static class FindTonePromptsResponseDto {
        @Schema(description = "톤 프롬프트 목록")
        private List<TonePromptResponseDto> tonePrompts;
    }
    
    @Getter
    @Builder
    @Schema(description = "톤 프롬프트 업데이트 응답 DTO")
    public static class UpdateTonePromptResponseDto {
        @Schema(description = "톤 프롬프트")
        private TonePromptResponseDto tonePrompt;
    }
    
    @Getter
    @Builder
    @Schema(description = "상담 기법 생성 응답 DTO")
    public static class CreateCounselTechniqueResponseDto {
        @Schema(description = "상담 기법")
        private CounselTechniqueResponseDto counselTechnique;
    }
    
    @Getter
    @Builder
    @Schema(description = "상담 기법 전체 조회 응답 DTO")
    public static class FindCounselTechniquesResponseDto {
        @Schema(description = "상담 기법 목록")
        private List<CounselTechniqueResponseDto> counselTechniques;
    }
    
    @Getter
    @Builder
    @Schema(description = "상담 기법 조회 응답 DTO")
    public static class FindCounselTechniqueByIdResponseDto {
        @Schema(description = "상담 기법")
        private CounselTechniqueResponseDto counselTechnique;
    }
    
    @Getter
    @Builder
    @Schema(description = "상담 기법 업데이트 응답 DTO")
    public static class UpdateCounselTechniqueResponseDto {
        @Schema(description = "상담 기법")
        private CounselTechniqueResponseDto counselTechnique;
    }
    
    
    @Getter
    @Builder
    @Schema(description = "프롬프트 활성화 히스토리 목록 조회 응답 DTO")
    public static class FindPromptActivateHistoriesResponseDto {
        @Schema(description = "프롬프트 활성화 히스토리 목록")
        private List<PromptActivateHistoryResponseDto> promptActivateHistories;
    }
    
    // 요청 DTO 추가
    @Getter
    @Builder
    @Schema(description = "페르소나 프롬프트 전체 조회 요청 DTO")
    public static class FindPersonaPromptsRequestDto {
        @Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        @NotNull
        private String promptVersionId;
        
        @Schema(description = "상담사 ID", example = "counselor_123456")
        private String counselorId;
    }
    
    @Getter
    @Setter
    @Builder
    @Schema(description = "톤 프롬프트 전체 조회 요청 DTO")
    public static class FindTonePromptsRequestDto {
        @Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        @NotNull
        private String promptVersionId;
        
        @Schema(description = "톤 ID", example = "tone_123456")
        private String toneId;
    }
    
    @Getter
    @Setter
    @Builder
    @Schema(description = "상담 기법 전체 조회 요청 DTO")
    public static class FindCounselTechniquesRequestDto {
        @Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        @NotNull
        private String promptVersionId;
        
        @Schema(description = "톤 ID", example = "tone_123456")
        private String toneId;
    }


    @Getter
    @Builder
    @Schema(description = "상담 기법 전환 규칙 생성 요청 DTO")
    public static class CreateCounselTechniqueTransitionRuleRequestDto {

        @Schema(description = "선행 상담 기법 ID", example = "ct_12345678")
        @NotNull
        private String fromCounselTechniqueId;

        @Schema(description = "타겟 상담 기법 ID", example = "ct_87654321")
        @NotNull
        private String toCounselTechniqueId;

        @Schema(description = "우선순위", example = "1")
        @NotNull
        private int priority;

        @Schema(description = "최소 현재 기법 메시지 개수", example = "3")
        @NotNull
        private Integer minCurrentTechniqueMessageCount;

        @Schema(description = "최대 현재 기법 메시지 개수", example = "8")
        @NotNull
        private Integer maxCurrentTechniqueMessageCount;

        @Schema(description = "필수 영향 도메인")
        @NotNull
        private List<ImpactDomain> requiredImpactDomains;

        @Schema(description = "필수 시간 프레임")
        @NotNull
        private List<Timeframe> requiredTimeframes;

        @Schema(description = "필수 1차 감정")
        @NotNull
        private List<EmotionPrimary> requiredEmotionPrimaries;

        @Schema(description = "필수 감정 긍부정")
        @NotNull
        private List<Valence> requiredValences;

        @Schema(description = "필수 감정 각성 수준")
        @NotNull
        private List<ArousalLevel> requiredArousalLevels;

        @Schema(description = "최소 감정 강도", example = "3")
        @Nullable
        private Integer minEmotionIntensity;

        @Schema(description = "최대 감정 강도", example = "7")
        @Nullable
        private Integer maxEmotionIntensity;

        @Schema(description = "필수 인지된 통제 수준")
        @NotNull
        private List<PerceivedControl> requiredPerceivedControls;

        @Schema(description = "필수 동기 단계")
        @NotNull
        private List<MotivationStage> requiredMotivationStages;

        @Schema(description = "최소 자기 효능감", example = "4")
        @Nullable
        private Integer minSelfEfficacy;

        @Schema(description = "최대 자기 효능감", example = "8")
        @Nullable
        private Integer maxSelfEfficacy;

        @Schema(description = "필수 사회적 지지 수준")
        @NotNull
        private List<SocialSupportLevel> requiredSocialSupportLevels;

        @Schema(description = "필수 위험 종류")
        @NotNull
        private List<RiskKind> requiredRiskKinds;

        @Schema(description = "최소 위험 심각도", example = "2")
        @Nullable
        private Integer minRiskSeverity;

        @Schema(description = "최대 위험 심각도", example = "5")
        @Nullable
        private Integer maxRiskSeverity;

        @Schema(description = "필수 수면의 질")
        @NotNull
        private List<SleepQuality> requiredSleepQualities;

        @Schema(description = "신체 증상 존재 여부 필요 조건", example = "true")
        @Nullable
        private Boolean requiredPhysicalSymptomsPresent;

        @Schema(description = "필수 인지 부하 수준")
        @NotNull
        private List<CognitiveLoad> requiredCognitiveLoads;

        @Schema(description = "필수 동맹 강도")
        @NotNull
        private List<AllianceStrength> requiredAllianceStrengths;

        @Schema(description = "심층 탐색 동의 필요 여부", example = "false")
        @Nullable
        private Boolean requiredConsentToDepth;
    }

    @Getter
    @Builder
    @Schema(description = "상담 기법 전환 조건 생성 응답 DTO")
    public static class CreateCounselTechniqueTransitionRuleResponseDto {
        @Schema(description = "상담 기번 전환 조건")
        private CounselTechniqueTransitionRuleResponseDto counselTechniqueTransitionRule;
    }

    @Getter
    @Builder
    @Schema(description = "상담 기법 전환 규칙 수정 요청 DTO")
    public static class UpdateCounselTechniqueTransitionRuleRequestDto {

        @Schema(description = "우선순위", example = "1")
        private int priority;

        @Schema(description = "최소 현재 기법 메시지 개수", example = "3")
        @NotNull
        private int minCurrentTechniqueMessageCount;

        @Schema(description = "최대 현재 기법 메시지 개수", example = "8")
        @NotNull
        private int maxCurrentTechniqueMessageCount;

        @Schema(description = "필수 영향 도메인")
        @NotNull
        private List<ImpactDomain> requiredImpactDomains;

        @Schema(description = "필수 시간 프레임")
        @NotNull
        private List<Timeframe> requiredTimeframes;

        @Schema(description = "필수 1차 감정")
        @NotNull
        private List<EmotionPrimary> requiredEmotionPrimaries;

        @Schema(description = "필수 감정 긍부정")
        @NotNull
        private List<Valence> requiredValences;

        @Schema(description = "필수 감정 각성 수준")
        @NotNull
        private List<ArousalLevel> requiredArousalLevels;

        @Schema(description = "최소 감정 강도", example = "3")
        @Nullable
        private Integer minEmotionIntensity;

        @Schema(description = "최대 감정 강도", example = "7")
        @Nullable
        private Integer maxEmotionIntensity;

        @Schema(description = "필수 인지된 통제 수준")
        @NotNull
        private List<PerceivedControl> requiredPerceivedControls;

        @Schema(description = "필수 동기 단계")
        @NotNull
        private List<MotivationStage> requiredMotivationStages;

        @Schema(description = "최소 자기 효능감", example = "4")
        @Nullable
        private Integer minSelfEfficacy;

        @Schema(description = "최대 자기 효능감", example = "8")
        @Nullable
        private Integer maxSelfEfficacy;

        @Schema(description = "필수 사회적 지지 수준")
        @NotNull
        private List<SocialSupportLevel> requiredSocialSupportLevels;

        @Schema(description = "필수 위험 종류") 
        @NotNull
        private List<RiskKind> requiredRiskKinds;

        @Schema(description = "최소 위험 심각도", example = "2")
        @Nullable
        private Integer minRiskSeverity;

        @Schema(description = "최대 위험 심각도", example = "5")
        @Nullable
        private Integer maxRiskSeverity;

        @Schema(description = "필수 수면의 질")
        @NotNull
        private List<SleepQuality> requiredSleepQualities;

        @Schema(description = "신체 증상 존재 여부 필요 조건", example = "true")
        @Nullable
        private Boolean requiredPhysicalSymptomsPresent;

        @Schema(description = "필수 인지 부하 수준")
        @NotNull
        private List<CognitiveLoad> requiredCognitiveLoads;

        @Schema(description = "필수 동맹 강도")
        @NotNull
        private List<AllianceStrength> requiredAllianceStrengths;

        @Schema(description = "심층 탐색 동의 필요 여부", example = "false")
        @Nullable
        private Boolean requiredConsentToDepth;
    }

    @Getter
    @Builder
    @Schema(description = "상담 기법 전환 조건 수정 응답 DTO")
    public static class UpdateCounselTechniqueTransitionRuleResponseDto {
        @Schema(description = "상담 기번 전환 조건")
        private CounselTechniqueTransitionRuleResponseDto counselTechniqueTransitionRule;
    }

    @Getter
    @Builder
    @Schema(description = "상담 기법 전환 조건 삭제 응답 DTO")
    public static class DeleteCounselTechniqueTransitionRuleResponseDto {
        @Schema(description = "프롬프트 버전 삭제 성공 여부", example = "true")
        private Boolean isSuccess;
    }



    @Getter
    @Builder
    @Schema(description = "상담 기법 전환 조건 조회 응답 DTO")
    public static class FindCounselTechniqueTransitionRuleByIdResponseDto {
        @Schema(description = "상담 기번 전환 조건")
        private CounselTechniqueTransitionRuleResponseDto counselTechniqueTransitionRule;
    }

    @Getter
    @Setter
    @Schema(description = "상담 기법 전환 조건 목록 조회 요청 DTO")
    public static class FindCounselTechniqueTransitionRulesRequestDto {
        @Schema(description = "선행 상담 기법 ID", example = "ct_123456")
        @Nullable
        private String fromCounselTechniqueId;

        @Schema(description = "후행 상담 기법 ID", example = "ct_123456")
        @Nullable
        private String toCounselTechniqueId;

        @Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        @NotNull
        private String promptVersionId;
    }


    @Getter
    @Builder
    @Schema(description = "상담 기법 전환 조건 목록 조회 응답 DTO")
    public static class FindCounselTechniqueTransitionRulesResponseDto {
        @Schema(description = "상담 기번 전환 조건 목록")
        private List<CounselTechniqueTransitionRuleResponseDto> counselTechniqueTransitionRules;
    }
}
