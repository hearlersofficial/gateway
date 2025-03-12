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

    @Getter
    @Setter
    @Schema(description = "Tone 응답 DTO")
    public static class ToneResponseDto {
        @Schema(description = "Tone ID", example = "tn_123456")
        private String id;

        @Schema(description = "Tone 이름", example = "공감적 상담 톤")
        private String name;

        @Schema(description = "Tone 내용", example = "내담자의 감정에 공감하고 따뜻한 어조로 응답합니다.")
        private String body;

        @Schema(description = "Tone 생성 시간", example = "2024-12-29T12:34:56.000Z")
        private String createdAt;

        @Schema(description = "Tone 수정 시간", example = "2024-12-29T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "Tone 삭제 시간", example = "2024-12-29T12:34:56.000Z")
        private String deletedAt;
    }

    @Getter
    @Setter
    @Schema(description = "Tone 생성 요청 DTO")
    public static class CreateToneRequestDto {
        @NotBlank(message = "Tone 이름은 필수 입력 항목입니다.")
        @Schema(description = "Tone 이름", example = "공감적 상담 톤")
        private String name;

        @NotBlank(message = "Tone 내용은 필수 입력 항목입니다.")
        @Schema(description = "Tone 내용", example = "내담자의 감정에 공감하고 따뜻한 어조로 응답합니다.")
        private String body;
    } 

    @Getter
    @Setter
    @Schema(description = "Tone 생성 응답 DTO")
    public static class CreateToneResponseDto {
        @Schema(description = "Tone 응답 DTO")
        private ToneResponseDto tone;
    } 

    @Getter
    @Setter
    @Schema(description = "Tone 조회 응답 DTO")
    public static class GetToneByIdResponseDto {
        @Schema(description = "Tone 응답 DTO")
        private ToneResponseDto tone;
    } 

    @Getter
    @Setter
    @Schema(description = "Tone 목록 조회 요청 DTO")
    public static class GetTonesRequestDto {
        @Schema(description = "조회할 Tone 이름 (선택사항)", example = "공감적 상담")
        private String name;
    } 

    @Getter
    @Setter
    @Schema(description = "Tone 목록 조회 응답 DTO")
    public static class GetTonesResponseDto {
        @Schema(description = "Tone 목록")
        private List<ToneResponseDto> tones;
    } 

    @Getter
    @Setter
    @Schema(description = "Tone 업데이트 요청 DTO")
    public static class UpdateToneRequestDto {
        @Schema(description = "Tone 이름 (선택사항)", example = "수정된 공감적 상담 톤")
        private String name;
        
        @Schema(description = "Tone 내용 (선택사항)", example = "내담자의 감정에 더욱 깊이 공감하고 더 따뜻한 어조로 응답합니다.")
        private String body;
    } 

    @Getter
    @Setter
    @Schema(description = "Tone 업데이트 응답 DTO")  
    public static class UpdateToneResponseDto {
        @Schema(description = "Tone 응답 DTO")
        private ToneResponseDto tone;
    } 

    @Getter
    @Setter
    @Schema(description = "InstructionItem 응답 DTO")
    public static class InstructionItemResponseDto {
        @Schema(description = "InstructionItem ID", example = "instr_123456")
        private String id;

        @Schema(description = "InstructionItem 내용", example = "내담자의 감정 상태를 먼저 파악하세요.")
        private String body;

        @Schema(description = "InstructionItem 생성 시간", example = "2024-12-29T12:34:56.000Z")
        private String createdAt;

        @Schema(description = "InstructionItem 수정 시간", example = "2024-12-29T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "InstructionItem 삭제 시간", example = "2024-12-29T12:34:56.000Z")
        private String deletedAt;
    }

    @Getter
    @Setter
    @Schema(description = "InstructionItem 생성 요청 DTO")
    public static class CreateInstructionItemRequestDto {
        @NotBlank(message = "InstructionItem 내용은 필수 입력 항목입니다.")
        @Schema(description = "InstructionItem 내용", example = "내담자의 감정 상태를 먼저 파악하세요.")
        private String body;
    }

    @Getter
    @Setter
    @Schema(description = "InstructionItem 생성 응답 DTO")
    public static class CreateInstructionItemResponseDto {
        @Schema(description = "InstructionItem 응답 DTO")
        private InstructionItemResponseDto instructionItem;
    }

    @Getter
    @Setter
    @Schema(description = "InstructionItem 조회 응답 DTO")
    public static class GetInstructionItemByIdResponseDto {
        @Schema(description = "InstructionItem 응답 DTO")
        private InstructionItemResponseDto instructionItem;
    }

    @Getter
    @Setter
    @Schema(description = "InstructionItem 목록 조회 요청 DTO")
    public static class GetInstructionItemsRequestDto {
        @Schema(description = "조회할 키워드 (선택사항)", example = "감정")
        private String keyword;
    }

    @Getter
    @Setter
    @Schema(description = "InstructionItem 목록 조회 응답 DTO")
    public static class GetInstructionItemsResponseDto {
        @Schema(description = "InstructionItem 목록")
        private List<InstructionItemResponseDto> instructionItems;
    }

    @Getter
    @Setter
    @Schema(description = "InstructionItem 업데이트 요청 DTO")
    public static class UpdateInstructionItemRequestDto {
        @Schema(description = "InstructionItem 내용 (선택사항)", example = "내담자의 감정 상태를 더 자세히 파악하세요.")
        private String body;
    }

    @Getter
    @Setter
    @Schema(description = "InstructionItem 업데이트 응답 DTO")
    public static class UpdateInstructionItemResponseDto {
        @Schema(description = "InstructionItem 응답 DTO")
        private InstructionItemResponseDto instructionItem;
    }

    @Getter
    @Setter
    @Schema(description = "Instruction 응답 DTO")
    public static class InstructionResponseDto {
        @Schema(description = "Instruction ID", example = "instr_123456")
        private String id;

        @Schema(description = "Instruction 이름", example = "우울증 상담 지침")
        private String name;

        @Schema(description = "Instruction 초기 문장", example = "안녕하세요, 오늘 어떤 기분이신가요?")
        private String initialSentence;

        @Schema(description = "Instruction 항목 목록")
        private List<InstructionItemResponseDto> instructionItems;

        @Schema(description = "Instruction 생성 시간", example = "2024-12-29T12:34:56.000Z")
        private String createdAt;

        @Schema(description = "Instruction 수정 시간", example = "2024-12-29T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "Instruction 삭제 시간", example = "2024-12-29T12:34:56.000Z")
        private String deletedAt;
    }

    @Getter
    @Setter
    @Schema(description = "Instruction 생성 요청 DTO")
    public static class CreateInstructionRequestDto {
        @NotBlank(message = "Instruction 이름은 필수 입력 항목입니다.")
        @Schema(description = "Instruction 이름", example = "우울증 상담 지침")
        private String name;
        
        @Schema(description = "Instruction 초기 문장", example = "안녕하세요, 오늘 어떤 기분이신가요?")
        private String initialSentence;
        
        @Schema(description = "Instruction 항목 ID 목록", example = "[\"instr_item_123\", \"instr_item_456\"]")
        private List<String> instructionItemIds;
    }

    @Getter
    @Setter
    @Schema(description = "Instruction 생성 응답 DTO")
    public static class CreateInstructionResponseDto {
        @Schema(description = "Instruction 응답 DTO")
        private InstructionResponseDto instruction;
    }

    @Getter
    @Setter
    @Schema(description = "Instruction 조회 응답 DTO")
    public static class GetInstructionByIdResponseDto {
        @Schema(description = "Instruction 응답 DTO")
        private InstructionResponseDto instruction;
    }

    @Getter
    @Setter
    @Schema(description = "Instruction 목록 조회 요청 DTO")
    public static class GetInstructionsRequestDto {
        @Schema(description = "조회할 Instruction 이름 (선택사항)", example = "우울증")
        private String name;
    }

    @Getter
    @Setter
    @Schema(description = "Instruction 목록 조회 응답 DTO")
    public static class GetInstructionsResponseDto {
        @Schema(description = "Instruction 목록")
        private List<InstructionResponseDto> instructions;
    }

    @Getter
    @Setter
    @Schema(description = "Instruction 업데이트 요청 DTO")
    public static class UpdateInstructionRequestDto {
        @Schema(description = "Instruction 이름 (선택사항)", example = "수정된 우울증 상담 지침")
        private String name;
        
        @Schema(description = "Instruction 초기 문장 (선택사항)", example = "안녕하세요, 오늘은 어떤 일이 있으셨나요?")
        private String initialSentence;
        
        @Schema(description = "초기 문장 필드 존재 여부 (null로 변경하려면 true로 설정)", example = "true")
        private Boolean hasInitialSentence;
        
        @Schema(description = "Instruction 항목 ID 목록 (전체 목록을 대체함)", example = "[\"instr_item_123\", \"instr_item_789\"]")
        private List<String> instructionItemIds;
        
        @Schema(description = "항목 ID 목록 필드 존재 여부 (목록을 비우려면 true로 설정)", example = "true")
        private Boolean hasInstructionItemIds;
    }

    @Getter
    @Setter
    @Schema(description = "Instruction 업데이트 응답 DTO")
    public static class UpdateInstructionResponseDto {
        @Schema(description = "Instruction 응답 DTO")
        private InstructionResponseDto instruction;
    }

    @Getter
    @Setter
    @Schema(description = "Persona 응답 DTO")
    public static class PersonaResponseDto {
        @Schema(description = "Persona ID", example = "persona_123456")
        private String id;

        @Schema(description = "Persona 내용", example = "저는 10년 경력의 심리상담사로, 우울증과 불안장애 분야를 전문으로 다룹니다.")
        private String body;
        
        @Schema(description = "상담사 ID", example = "counselor_789012")
        private String counselorId;

        @Schema(description = "Persona 생성 시간", example = "2024-12-29T12:34:56.000Z")
        private String createdAt;

        @Schema(description = "Persona 수정 시간", example = "2024-12-29T12:34:56.000Z")
        private String updatedAt;
        
        @Schema(description = "Persona 삭제 시간", example = "2024-12-29T12:34:56.000Z")
        private String deletedAt;
    }

    @Getter
    @Setter
    @Schema(description = "Persona 생성 요청 DTO")
    public static class CreatePersonaRequestDto {
        @NotBlank(message = "상담사 ID는 필수 입력 항목입니다.")
        @Schema(description = "상담사 ID", example = "counselor_789012")
        private String counselorId;
        
        @NotBlank(message = "Persona 내용은 필수 입력 항목입니다.")
        @Schema(description = "Persona 내용", example = "저는 10년 경력의 심리상담사로, 우울증과 불안장애 분야를 전문으로 다룹니다.")
        private String body;
    }

    @Getter
    @Setter
    @Schema(description = "Persona 생성 응답 DTO")
    public static class CreatePersonaResponseDto {
        @Schema(description = "Persona 응답 DTO")
        private PersonaResponseDto persona;
    }

    @Getter
    @Setter
    @Schema(description = "Persona 조회 응답 DTO")
    public static class GetPersonaByIdResponseDto {
        @Schema(description = "Persona 응답 DTO")
        private PersonaResponseDto persona;
    }

    @Getter
    @Setter
    @Schema(description = "Persona 목록 조회 요청 DTO")
    public static class GetPersonasRequestDto {
        @Schema(description = "조회할 상담사 ID (선택사항)", example = "counselor_789012")
        private String counselorId;
    }

    @Getter
    @Setter
    @Schema(description = "Persona 목록 조회 응답 DTO")
    public static class GetPersonasResponseDto {
        @Schema(description = "Persona 목록")
        private List<PersonaResponseDto> personas;
    }

    @Getter
    @Setter
    @Schema(description = "Persona 업데이트 요청 DTO")
    public static class UpdatePersonaRequestDto {
        @Schema(description = "Persona 내용", example = "저는 12년 경력의 심리상담사로, 우울증, 불안장애, 트라우마 분야를 전문으로 다룹니다.")
        private String body;
    }

    @Getter
    @Setter
    @Schema(description = "Persona 업데이트 응답 DTO")
    public static class UpdatePersonaResponseDto {
        @Schema(description = "Persona 응답 DTO")
        private PersonaResponseDto persona;
    }
}
