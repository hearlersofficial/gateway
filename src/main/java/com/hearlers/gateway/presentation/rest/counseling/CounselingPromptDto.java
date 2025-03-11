package com.hearlers.gateway.presentation.rest.counseling;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class CounselingPromptDto {

    @Getter
    @Setter
    @Schema(description = "Context 응답 DTO")
    public static class ContextResponseDto {
        @Schema(description = "Context ID", example = "ctx_123456")
        private String id;
    
        @Schema(description = "Context 이름", example = "우울증 상담 컨텍스트")
        private String name;
    
        @Schema(description = "Context 내 플레이스홀더 목록", example = "[\"사용자이름\", \"상담사이름\"]")
        private List<String> placeholders;
    
        @Schema(description = "Context 내용", example = "이 상담은 우울증을 겪고 있는 내담자를 돕기 위한 것입니다.")
        private String body;
    
        @Schema(description = "Context 생성 시간", example = "2024-12-29T12:34:56.000Z")
        private String createdAt;
    
        @Schema(description = "Context 수정 시간", example = "2024-12-29T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "Context 삭제 시간", example = "2024-12-29T12:34:56.000Z")
        private String deletedAt;
    }
    

    @Getter
    @Setter
    @Schema(description = "Context 생성 요청 DTO")
    public static class CreateContextRequestDto {
        @NotBlank(message = "Context 이름은 필수 입력 항목입니다.")
        @Schema(description = "Context 이름", example = "우울증 상담 컨텍스트")
        private String name;

        @NotBlank(message = "Context 내용은 필수 입력 항목입니다.")
        @Schema(description = "Context 내용", example = "이 상담은 우울증을 겪고 있는 내담자를 돕기 위한 것입니다.")
        private String body;

        @Schema(description = "Context 내 플레이스홀더 목록", example = "[\"사용자이름\", \"상담사이름\"]")
        private List<String> placeholders;
    } 

    @Getter
    @Setter
    @Schema(description = "Context 생성 응답 DTO")
    public static class CreateContextResponseDto {
        @Schema(description = "Context 응답 DTO")
        private ContextResponseDto context;
    } 


    @Getter
    @Setter
    @Schema(description = "Context 조회 응답 DTO")
    public static class GetContextByIdResponseDto {
        @Schema(description = "Context 응답 DTO")
        private ContextResponseDto context;
    } 

    @Getter
    @Setter
    @Schema(description = "Context 목록 조회 요청 DTO")
    public static class GetContextsRequestDto {
        @Schema(description = "조회할 Context 이름 (선택사항)", example = "우울증 상담")
        private String name;
    } 

    @Getter
    @Setter
    @Schema(description = "Context 목록 조회 응답 DTO")
    public static class GetContextsResponseDto {
        @Schema(description = "Context 목록")
        private List<ContextResponseDto> contexts;
    } 

    @Getter
    @Setter
    @Schema(description = "Context 업데이트 요청 DTO")
    public static class UpdateContextRequestDto {
        @NotBlank(message = "Context ID는 필수 입력 항목입니다.")
        @Schema(description = "Context ID", example = "ctx_123456")
        private String contextId;
        
        @Schema(description = "Context 이름 (선택사항)", example = "수정된 우울증 상담 컨텍스트")
        private String name;
        
        @Schema(description = "Context 내용 (선택사항)", example = "이 상담은 심각한 우울증을 겪고 있는 내담자를 돕기 위한 수정된 컨텍스트입니다.")
        private String body;
        
        @Schema(description = "Context 내 플레이스홀더 목록", example = "[\"사용자이름\", \"상담사이름\", \"날짜\"]")
        private List<String> placeholders;
    } 

    @Getter
    @Setter
    @Schema(description = "Context 업데이트 응답 DTO")  
    public static class UpdateContextResponseDto {
        @Schema(description = "Context 응답 DTO")
        private ContextResponseDto context;
    } 
}
