package com.hearlers.gateway.presentation.rest.v1.counseling.admin;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

public class CounselPromptDto {

    // PromptVersion 관련 DTO
    @Getter
    @Setter
    @Schema(description = "프롬프트 버전 응답 DTO")
    public static class PromptVersionResponseDto {
        @Schema(description = "프롬프트 버전 ID", example = "pv_123456")
        private String id;
        
        @Schema(description = "프롬프트 버전 이름", example = "2024년 6월 프롬프트 버전")
        private String name;
        
        @Schema(description = "프롬프트 버전 설명", example = "2024년 6월 배포 버전입니다.")
        private String description;
        
        @Schema(description = "활성화 여부", example = "true")
        private boolean isActive;
        
        @Schema(description = "임시 버전 여부", example = "false")
        private boolean isTemporary;
        
        @Schema(description = "북마크 여부", example = "false")
        private boolean isBookmarked;
        
        @Schema(description = "상담사별 프롬프트 목록")
        private List<CounselorScopedPromptResponseDto> counselorScopedPrompts;
        
        @Schema(description = "톤별 프롬프트 목록")
        private List<ToneScopedPromptResponseDto> toneScopedPrompts;
        
        @Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        private String createdAt;
        
        @Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "삭제 시간", example = "null")
        private String deletedAt;
    }
    
    @Getter
    @Setter
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
    @Setter
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
    @Setter
    @Schema(description = "페르소나 프롬프트 응답 DTO")
    public static class PersonaPromptResponseDto {
        @Schema(description = "페르소나 프롬프트 ID", example = "pp_123456")
        private String id;
        
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
    @Setter
    @Schema(description = "톤 프롬프트 응답 DTO")
    public static class TonePromptResponseDto {
        @Schema(description = "톤 프롬프트 ID", example = "tp_123456")
        private String id;
        
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
    @Setter
    @Schema(description = "상담 기법 응답 DTO")
    public static class CounselTechniqueResponseDto {
        @Schema(description = "상담 기법 ID", example = "ct_123456")
        private String id;
        
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
        
        @Schema(description = "임시 기법 여부", example = "false")
        private boolean isTemporary;
        
        @Schema(description = "다음 상담 기법 ID", example = "ct_789012")
        private String nextCounselTechniqueId;
        
        @Schema(description = "생성 시간", example = "2024-06-01T12:34:56.000Z")
        private String createdAt;
        
        @Schema(description = "수정 시간", example = "2024-06-01T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "삭제 시간", example = "null")
        private String deletedAt;
    }
    
    // PromptActivateHistory 관련 DTO
    @Getter
    @Setter
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
    
    // 요청 DTO
    @Getter
    @Setter
    @Schema(description = "프롬프트 버전 조회 요청 DTO")
    public static class FindPromptVersionsRequestDto {
        @Schema(description = "프롬프트 버전 이름", example = "2024년")
        private String name;
    }
    
    @Getter
    @Setter
    @Schema(description = "임시 버전 저장 요청 DTO")
    public static class SaveTemporaryVersionRequestDto {
        @NotBlank(message = "이름은 필수 입력 사항입니다.")
        @Schema(description = "프롬프트 버전 이름", example = "2024년 7월 프롬프트 버전")
        private String name;
        
        @NotBlank(message = "설명은 필수 입력 사항입니다.")
        @Schema(description = "프롬프트 버전 설명", example = "2024년 7월 배포 예정 버전입니다.")
        private String description;
    }
    
    @Getter
    @Setter
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
    @Setter
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
    @Setter
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
    }
    
    @Getter
    @Setter
    @Schema(description = "상담 기법 업데이트 요청 DTO")
    public static class UpdateCounselTechniqueRequestDto {
        @Schema(description = "상담 기법 ID", example = "ct_123456")
        private String counselTechniqueId;
        
        @Schema(description = "상담 기법 이름", example = "개선된 공감 반응 기법")
        private String name;
        
        @Schema(description = "컨텍스트", example = "내담자의 감정에 더 깊이 공감하는 컨텍스트")
        private String context;
        
        @Schema(description = "지시사항", example = "내담자의 감정을 더 깊이 반영하고 공감하세요.")
        private String instruction;
        
        @Schema(description = "메시지 임계값", example = "5")
        private Integer messageThreshold;
    }
    
    @Getter
    @Setter
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
    @Setter
    @Schema(description = "프롬프트 버전 목록 조회 응답 DTO")
    public static class FindPromptVersionsResponseDto {
        @Schema(description = "프롬프트 버전 목록")
        private List<PromptVersionResponseDto> promptVersions;
    }
    
    @Getter
    @Setter
    @Schema(description = "프롬프트 버전 조회 응답 DTO")
    public static class FindPromptVersionByIdResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }
    
    @Getter
    @Setter
    @Schema(description = "임시 버전 조회 응답 DTO")
    public static class FindTemporaryVersionResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }
    
    @Getter
    @Setter
    @Schema(description = "기존 프롬프트 버전 로드 응답 DTO")
    public static class LoadExistingPromptVersionResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }
    
    @Getter
    @Setter
    @Schema(description = "임시 버전 저장 응답 DTO")
    public static class SaveTemporaryVersionResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }
    
    @Getter
    @Setter
    @Schema(description = "프롬프트 버전 활성화 응답 DTO")
    public static class ActivatePromptVersionResponseDto {
        @Schema(description = "프롬프트 버전")
        private PromptVersionResponseDto promptVersion;
    }
    
    @Getter
    @Setter
    @Schema(description = "페르소나 프롬프트 조회 응답 DTO")
    public static class FindPersonaPromptByIdResponseDto {
        @Schema(description = "페르소나 프롬프트")
        private PersonaPromptResponseDto personaPrompt;
    }
    
    @Getter
    @Setter
    @Schema(description = "페르소나 프롬프트 업데이트 응답 DTO")
    public static class UpdatePersonaPromptResponseDto {
        @Schema(description = "페르소나 프롬프트")
        private PersonaPromptResponseDto personaPrompt;
    }
    
    @Getter
    @Setter
    @Schema(description = "톤 프롬프트 조회 응답 DTO")
    public static class FindTonePromptByIdResponseDto {
        @Schema(description = "톤 프롬프트")
        private TonePromptResponseDto tonePrompt;
    }
    
    @Getter
    @Setter
    @Schema(description = "톤 프롬프트 업데이트 응답 DTO")
    public static class UpdateTonePromptResponseDto {
        @Schema(description = "톤 프롬프트")
        private TonePromptResponseDto tonePrompt;
    }
    
    @Getter
    @Setter
    @Schema(description = "상담 기법 생성 응답 DTO")
    public static class CreateCounselTechniqueResponseDto {
        @Schema(description = "상담 기법")
        private CounselTechniqueResponseDto counselTechnique;
    }
    
    @Getter
    @Setter
    @Schema(description = "상담 기법 목록 조회 응답 DTO")
    public static class FindOrderedCounselTechniquesResponseDto {
        @Schema(description = "상담 기법 목록")
        private List<CounselTechniqueResponseDto> counselTechniques;
    }
    
    @Getter
    @Setter
    @Schema(description = "상담 기법 조회 응답 DTO")
    public static class FindCounselTechniqueByIdResponseDto {
        @Schema(description = "상담 기법")
        private CounselTechniqueResponseDto counselTechnique;
    }
    
    @Getter
    @Setter
    @Schema(description = "상담 기법 업데이트 응답 DTO")
    public static class UpdateCounselTechniqueResponseDto {
        @Schema(description = "상담 기법")
        private CounselTechniqueResponseDto counselTechnique;
    }
    
    @Getter
    @Setter
    @Schema(description = "상담 기법 시퀀스 저장 응답 DTO")
    public static class SaveCounselTechniqueSequenceResponseDto {
        @Schema(description = "상담 기법 목록")
        private List<CounselTechniqueResponseDto> counselTechniques;
    }
    
    @Getter
    @Setter
    @Schema(description = "프롬프트 활성화 히스토리 목록 조회 응답 DTO")
    public static class FindPromptActivateHistoriesResponseDto {
        @Schema(description = "프롬프트 활성화 히스토리 목록")
        private List<PromptActivateHistoryResponseDto> promptActivateHistories;
    }
}
