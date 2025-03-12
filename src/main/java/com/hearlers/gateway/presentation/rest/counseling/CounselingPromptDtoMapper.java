package com.hearlers.gateway.presentation.rest.counseling;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.Instruction;
import com.hearlers.api.proto.v1.model.InstructionItem;
import com.hearlers.api.proto.v1.model.Persona;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionRequest;
import com.hearlers.api.proto.v1.service.CreatePersonaRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionsRequest;
import com.hearlers.api.proto.v1.service.FindPersonaByIdRequest;
import com.hearlers.api.proto.v1.service.FindPersonasRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionRequest;
import com.hearlers.api.proto.v1.service.UpdatePersonaRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;
@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CounselingPromptDtoMapper {
    

    // Context → ContextResponseDto
    @Mapping(source = "placeholdersList", target = "placeholders")
    CounselingPromptDto.ContextResponseDto of(Context context);

    // CreateContextRequestDto → CreateContextRequest
    default CreateContextRequest of(CounselingPromptDto.CreateContextRequestDto requestDto) {
        return CreateContextRequest.newBuilder()
                .setName(requestDto.getName())
                .setBody(requestDto.getBody())
                .addAllPlaceholders(requestDto.getPlaceholders() != null ? requestDto.getPlaceholders() : List.of())
                .build();
    }

    // GetContextsRequestDto → FindContextsRequest
    default FindContextsRequest of(CounselingPromptDto.GetContextsRequestDto requestDto) {
        return FindContextsRequest.newBuilder()
                .setName(requestDto.getName() != null ? requestDto.getName() : "")
                .build();
    }

    // String(contextId) → FindContextByIdRequest
    default FindContextByIdRequest of(String contextId) {
        return FindContextByIdRequest.newBuilder()
                .setContextId(contextId)
                .build();
    }

    // UpdateContextRequestDto → UpdateContextRequest
    default UpdateContextRequest of(CounselingPromptDto.UpdateContextRequestDto requestDto, String contextId) {
        UpdateContextRequest.Builder builder = UpdateContextRequest.newBuilder()
                .setContextId(contextId);
        
        if (requestDto.getName() != null) {
            builder.setName(requestDto.getName());
        }
        
        if (requestDto.getBody() != null) {
            builder.setBody(requestDto.getBody());
        }
        
        if (requestDto.getPlaceholders() != null) {
            builder.addAllPlaceholders(requestDto.getPlaceholders());
        }
        
        return builder.build();
    }

    // Context → CreateContextResponseDto
    default CounselingPromptDto.CreateContextResponseDto of(Context context, boolean isCreate) {
        if (!isCreate) return null;
        
        CounselingPromptDto.CreateContextResponseDto responseDto = new CounselingPromptDto.CreateContextResponseDto();
        responseDto.setContext(of(context));
        return responseDto;
    }

    // Context → UpdateContextResponseDto
    default CounselingPromptDto.UpdateContextResponseDto ofUpdate(Context context) {
        CounselingPromptDto.UpdateContextResponseDto responseDto = new CounselingPromptDto.UpdateContextResponseDto();
        responseDto.setContext(of(context));
        return responseDto;
    }

    // Context → GetContextByIdResponseDto
    default CounselingPromptDto.GetContextByIdResponseDto ofSingle(Context context) {
        CounselingPromptDto.GetContextByIdResponseDto responseDto = new CounselingPromptDto.GetContextByIdResponseDto();
        responseDto.setContext(of(context));
        return responseDto;
    }

    // List<Context> → GetContextsResponseDto
    default CounselingPromptDto.GetContextsResponseDto of(List<Context> contexts) {
        List<CounselingPromptDto.ContextResponseDto> dtos = contexts.stream()
                .map(this::of)
                .collect(Collectors.toList());
        
        CounselingPromptDto.GetContextsResponseDto responseDto = new CounselingPromptDto.GetContextsResponseDto();
        responseDto.setContexts(dtos);
        return responseDto;
    }

    // Tone → ToneResponseDto
    CounselingPromptDto.ToneResponseDto of(Tone tone);

    // CreateToneRequestDto → CreateToneRequest
    default CreateToneRequest of(CounselingPromptDto.CreateToneRequestDto requestDto) {
        return CreateToneRequest.newBuilder()
                .setName(requestDto.getName())
                .setBody(requestDto.getBody())
                .build();
    }

    // GetTonesRequestDto → FindTonesRequest
    default FindTonesRequest ofTones(CounselingPromptDto.GetTonesRequestDto requestDto) {
        return FindTonesRequest.newBuilder()
                .setName(requestDto.getName() != null ? requestDto.getName() : "")
                .build();
    }

    // String(toneId) → FindToneByIdRequest
    default FindToneByIdRequest ofTone(String toneId) {
        return FindToneByIdRequest.newBuilder()
                .setToneId(toneId)
                .build();
    }

    // UpdateToneRequestDto → UpdateToneRequest
    default UpdateToneRequest of(CounselingPromptDto.UpdateToneRequestDto requestDto, String toneId) {
        UpdateToneRequest.Builder builder = UpdateToneRequest.newBuilder()
                .setToneId(toneId);
        
        if (requestDto.getName() != null) {
            builder.setName(requestDto.getName());
        }
        
        if (requestDto.getBody() != null) {
            builder.setBody(requestDto.getBody());
        }
        
        return builder.build();
    }

    // Tone → CreateToneResponseDto
    default CounselingPromptDto.CreateToneResponseDto ofCreate(Tone tone) {
        
        CounselingPromptDto.CreateToneResponseDto responseDto = new CounselingPromptDto.CreateToneResponseDto();
        responseDto.setTone(of(tone));
        return responseDto;
    }

    // Tone → UpdateToneResponseDto
    default CounselingPromptDto.UpdateToneResponseDto ofToneUpdate(Tone tone) {
        CounselingPromptDto.UpdateToneResponseDto responseDto = new CounselingPromptDto.UpdateToneResponseDto();
        responseDto.setTone(of(tone));
        return responseDto;
    }

    // Tone → GetToneByIdResponseDto
    default CounselingPromptDto.GetToneByIdResponseDto ofToneSingle(Tone tone) {
        CounselingPromptDto.GetToneByIdResponseDto responseDto = new CounselingPromptDto.GetToneByIdResponseDto();
        responseDto.setTone(of(tone));
        return responseDto;
    }

    // List<Tone> → GetTonesResponseDto
    default CounselingPromptDto.GetTonesResponseDto ofTones(List<Tone> tones) {
        List<CounselingPromptDto.ToneResponseDto> dtos = tones.stream()
                .map(this::of)
                .collect(Collectors.toList());
        
        CounselingPromptDto.GetTonesResponseDto responseDto = new CounselingPromptDto.GetTonesResponseDto();
        responseDto.setTones(dtos);
        return responseDto;
    }

    // InstructionItem → InstructionItemResponseDto
    @Mapping(source = "id", target = "id")
    @Mapping(source = "body", target = "body")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "updatedAt", target = "updatedAt")
    @Mapping(source = "deletedAt", target = "deletedAt")
    CounselingPromptDto.InstructionItemResponseDto ofInstruction(InstructionItem instructionItem);

    // CreateInstructionItemRequestDto → CreateInstructionItemRequest
    default CreateInstructionItemRequest ofInstruction(CounselingPromptDto.CreateInstructionItemRequestDto requestDto) {
        return CreateInstructionItemRequest.newBuilder()
                .setBody(requestDto.getBody())
                .build();
    }

    // GetInstructionItemsRequestDto → FindInstructionItemsRequest
    default FindInstructionItemsRequest ofInstructions(CounselingPromptDto.GetInstructionItemsRequestDto requestDto) {
        FindInstructionItemsRequest.Builder builder = FindInstructionItemsRequest.newBuilder();
        
        if (requestDto.getKeyword() != null) {
            builder.setKeyword(requestDto.getKeyword());
        }
        
        return builder.build();
    }

    // String(instructionItemId) → FindInstructionItemByIdRequest
    default FindInstructionItemByIdRequest ofInstruction(String instructionItemId) {
        return FindInstructionItemByIdRequest.newBuilder()
                .setInstructionItemId(instructionItemId)
                .build();
    }

    // UpdateInstructionItemRequestDto → UpdateInstructionItemRequest
    default UpdateInstructionItemRequest ofInstructionUpdate(CounselingPromptDto.UpdateInstructionItemRequestDto requestDto, String instructionItemId) {
        UpdateInstructionItemRequest.Builder builder = UpdateInstructionItemRequest.newBuilder()
                .setInstructionItemId(instructionItemId);
        
        if (requestDto.getBody() != null) {
            builder.setBody(requestDto.getBody());
        }
        
        return builder.build();
    }

    // InstructionItem → CreateInstructionItemResponseDto
    default CounselingPromptDto.CreateInstructionItemResponseDto ofInstructionCreate(InstructionItem instructionItem) {
        CounselingPromptDto.CreateInstructionItemResponseDto responseDto = new CounselingPromptDto.CreateInstructionItemResponseDto();
        responseDto.setInstructionItem(ofInstruction(instructionItem));
        return responseDto;
    }

    // InstructionItem → UpdateInstructionItemResponseDto
    default CounselingPromptDto.UpdateInstructionItemResponseDto ofInstructionUpdate(InstructionItem instructionItem) {
        CounselingPromptDto.UpdateInstructionItemResponseDto responseDto = new CounselingPromptDto.UpdateInstructionItemResponseDto();
        responseDto.setInstructionItem(ofInstruction(instructionItem));
        return responseDto;
    }

    // InstructionItem → GetInstructionItemByIdResponseDto
    default CounselingPromptDto.GetInstructionItemByIdResponseDto ofInstructionSingle(InstructionItem instructionItem) {
        CounselingPromptDto.GetInstructionItemByIdResponseDto responseDto = new CounselingPromptDto.GetInstructionItemByIdResponseDto();
        responseDto.setInstructionItem(ofInstruction(instructionItem));
        return responseDto;
    }

    // List<InstructionItem> → GetInstructionItemsResponseDto
    default CounselingPromptDto.GetInstructionItemsResponseDto ofInstructions(List<InstructionItem> instructionItems) {
        List<CounselingPromptDto.InstructionItemResponseDto> dtos = instructionItems.stream()
                .map(this::ofInstruction)
                .collect(Collectors.toList());
        
        CounselingPromptDto.GetInstructionItemsResponseDto responseDto = new CounselingPromptDto.GetInstructionItemsResponseDto();
        responseDto.setInstructionItems(dtos);
        return responseDto;
    }

    // InstructionItem을 매핑하기 위한 메서드 (id만 추출)
    default String mapInstructionItemToId(InstructionItem item) {
        return item != null ? item.getId() : null;
    }

    // Instruction → InstructionResponseDto
    default CounselingPromptDto.InstructionResponseDto of(Instruction instruction) {
        if (instruction == null) {
            return null;
        }

        CounselingPromptDto.InstructionResponseDto dto = new CounselingPromptDto.InstructionResponseDto();
        dto.setId(instruction.getId());
        dto.setName(instruction.getName());
        dto.setInitialSentence(instruction.getInitialSentence());
        
        List<CounselingPromptDto.InstructionItemResponseDto> itemDtos = instruction.getInstructionItemsList()
                .stream()
                .map(this::ofInstruction)
                .collect(Collectors.toList());
        dto.setInstructionItems(itemDtos);
        
        dto.setCreatedAt(instruction.getCreatedAt());
        dto.setUpdatedAt(instruction.getUpdatedAt());
        dto.setDeletedAt(instruction.getDeletedAt());
        
        return dto;
    }

    // CreateInstructionRequestDto → CreateInstructionRequest
    default CreateInstructionRequest of(CounselingPromptDto.CreateInstructionRequestDto requestDto) {
        CreateInstructionRequest.Builder builder = CreateInstructionRequest.newBuilder()
                .setName(requestDto.getName());
        
        if (requestDto.getInitialSentence() != null) {
            builder.setInitialSentence(requestDto.getInitialSentence());
        }
        
        if (requestDto.getInstructionItemIds() != null && !requestDto.getInstructionItemIds().isEmpty()) {
            builder.addAllInstructionItemIds(requestDto.getInstructionItemIds());
        }
        
        return builder.build();
    }

    // GetInstructionsRequestDto → FindInstructionsRequest
    default FindInstructionsRequest ofInstructions(CounselingPromptDto.GetInstructionsRequestDto requestDto) {
        FindInstructionsRequest.Builder builder = FindInstructionsRequest.newBuilder();
        
        if (requestDto.getName() != null) {
            builder.setName(requestDto.getName());
        }
        
        return builder.build();
    }

    // String(instructionId) → FindInstructionByIdRequest
    default FindInstructionByIdRequest ofInstructionId(String instructionId) {
        return FindInstructionByIdRequest.newBuilder()
                .setInstructionId(instructionId)
                .build();
    }

    // UpdateInstructionRequestDto → UpdateInstructionRequest
    default UpdateInstructionRequest ofInstructionUpdate(CounselingPromptDto.UpdateInstructionRequestDto requestDto, String instructionId) {
        UpdateInstructionRequest.Builder builder = UpdateInstructionRequest.newBuilder()
                .setInstructionId(instructionId);
        
        if (requestDto.getName() != null) {
            builder.setName(requestDto.getName());
        }
        
        // 초기 문장 처리
        if (requestDto.getHasInitialSentence() != null && requestDto.getHasInitialSentence()) {
            builder.setHasInitialSentence(true);
            if (requestDto.getInitialSentence() != null) {
                builder.setInitialSentence(requestDto.getInitialSentence());
            }
        }
        
        // 항목 ID 목록 처리
        if (requestDto.getHasInstructionItemIds() != null && requestDto.getHasInstructionItemIds()) {
            builder.setHasInstructionItemIds(true);
            if (requestDto.getInstructionItemIds() != null) {
                builder.addAllInstructionItemIds(requestDto.getInstructionItemIds());
            }
        }
        
        return builder.build();
    }

    // Instruction → CreateInstructionResponseDto
    default CounselingPromptDto.CreateInstructionResponseDto ofInstructionCreate(Instruction instruction) {
        CounselingPromptDto.CreateInstructionResponseDto responseDto = new CounselingPromptDto.CreateInstructionResponseDto();
        responseDto.setInstruction(of(instruction));
        return responseDto;
    }

    // Instruction → UpdateInstructionResponseDto
    default CounselingPromptDto.UpdateInstructionResponseDto ofInstructionUpdate(Instruction instruction) {
        CounselingPromptDto.UpdateInstructionResponseDto responseDto = new CounselingPromptDto.UpdateInstructionResponseDto();
        responseDto.setInstruction(of(instruction));
        return responseDto;
    }

    // Instruction → GetInstructionByIdResponseDto
    default CounselingPromptDto.GetInstructionByIdResponseDto ofInstructionById(Instruction instruction) {
        CounselingPromptDto.GetInstructionByIdResponseDto responseDto = new CounselingPromptDto.GetInstructionByIdResponseDto();
        responseDto.setInstruction(of(instruction));
        return responseDto;
    }

    // List<Instruction> → GetInstructionsResponseDto
    default CounselingPromptDto.GetInstructionsResponseDto ofInstructionList(List<Instruction> instructions) {
        List<CounselingPromptDto.InstructionResponseDto> dtos = instructions.stream()
                .map(this::of)
                .collect(Collectors.toList());
        
        CounselingPromptDto.GetInstructionsResponseDto responseDto = new CounselingPromptDto.GetInstructionsResponseDto();
        responseDto.setInstructions(dtos);
        return responseDto;
    }

    // Persona → PersonaResponseDto
    @Mapping(source = "id", target = "id")
    @Mapping(source = "body", target = "body")
    @Mapping(source = "counselorId", target = "counselorId")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "updatedAt", target = "updatedAt")
    @Mapping(source = "deletedAt", target = "deletedAt")
    CounselingPromptDto.PersonaResponseDto ofPersona(Persona persona);

    // CreatePersonaRequestDto → CreatePersonaRequest
    default CreatePersonaRequest ofPersona(CounselingPromptDto.CreatePersonaRequestDto requestDto) {
        return CreatePersonaRequest.newBuilder()
                .setCounselorId(requestDto.getCounselorId())
                .setBody(requestDto.getBody())
                .build();
    }

    // GetPersonasRequestDto → FindPersonasRequest
    default FindPersonasRequest ofPersonas(CounselingPromptDto.GetPersonasRequestDto requestDto) {
        FindPersonasRequest.Builder builder = FindPersonasRequest.newBuilder();
        
        if (requestDto.getCounselorId() != null) {
            builder.setCounselorId(requestDto.getCounselorId());
        }
        
        return builder.build();
    }

    // String(personaId) → FindPersonaByIdRequest
    default FindPersonaByIdRequest ofPersonaId(String personaId) {
        return FindPersonaByIdRequest.newBuilder()
                .setPersonaId(personaId)
                .build();
    }

    // UpdatePersonaRequestDto → UpdatePersonaRequest
    default UpdatePersonaRequest ofPersonaUpdate(CounselingPromptDto.UpdatePersonaRequestDto requestDto, String personaId) {
        UpdatePersonaRequest.Builder builder = UpdatePersonaRequest.newBuilder()
                .setPersonaId(personaId);
        
        if (requestDto.getBody() != null) {
            builder.setBody(requestDto.getBody());
        }
        
        return builder.build();
    }

    // Persona → CreatePersonaResponseDto
    default CounselingPromptDto.CreatePersonaResponseDto ofPersonaCreate(Persona persona) {
        CounselingPromptDto.CreatePersonaResponseDto responseDto = new CounselingPromptDto.CreatePersonaResponseDto();
        responseDto.setPersona(ofPersona(persona));
        return responseDto;
    }

    // Persona → UpdatePersonaResponseDto
    default CounselingPromptDto.UpdatePersonaResponseDto ofPersonaUpdate(Persona persona) {
        CounselingPromptDto.UpdatePersonaResponseDto responseDto = new CounselingPromptDto.UpdatePersonaResponseDto();
        responseDto.setPersona(ofPersona(persona));
        return responseDto;
    }

    // Persona → GetPersonaByIdResponseDto
    default CounselingPromptDto.GetPersonaByIdResponseDto ofPersonaById(Persona persona) {
        CounselingPromptDto.GetPersonaByIdResponseDto responseDto = new CounselingPromptDto.GetPersonaByIdResponseDto();
        responseDto.setPersona(ofPersona(persona));
        return responseDto;
    }

    // List<Persona> → GetPersonasResponseDto
    default CounselingPromptDto.GetPersonasResponseDto ofPersonas(List<Persona> personas) {
        List<CounselingPromptDto.PersonaResponseDto> dtos = personas.stream()
                .map(this::ofPersona)
                .collect(Collectors.toList());
        
        CounselingPromptDto.GetPersonasResponseDto responseDto = new CounselingPromptDto.GetPersonasResponseDto();
        responseDto.setPersonas(dtos);
        return responseDto;
    }
}