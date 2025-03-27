package com.hearlers.gateway.presentation.rest.v1.counseling;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Persona;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;


@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CounselingPromptDtoMapper {
    
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

    // Persona → PersonaResponseDto
    @Mapping(source = "id", target = "id")
    @Mapping(source = "body", target = "body")
    @Mapping(source = "counselorId", target = "counselorId")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "updatedAt", target = "updatedAt")
    @Mapping(source = "deletedAt", target = "deletedAt")
    CounselingPromptDto.PersonaResponseDto ofPersona(Persona persona);

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

    // CounselTechnique → CounselTechniqueResponseDto
    default CounselingPromptDto.CounselTechniqueResponseDto ofCounselTechnique(CounselTechnique counselTechnique) {
        if (counselTechnique == null) {
            return null;
        }

        CounselingPromptDto.CounselTechniqueResponseDto dto = new CounselingPromptDto.CounselTechniqueResponseDto();
        dto.setId(counselTechnique.getId());
        dto.setName(counselTechnique.getName());
        dto.setToneId(counselTechnique.getToneId());
        dto.setContext(counselTechnique.getContext());
        dto.setInstruction(counselTechnique.getInstruction());
        
        
        dto.setNextCounselTechniqueId(counselTechnique.getNextCounselTechniqueId());
        dto.setCreatedAt(counselTechnique.getCreatedAt());
        dto.setUpdatedAt(counselTechnique.getUpdatedAt());
        dto.setDeletedAt(counselTechnique.getDeletedAt());
        
        return dto;
    }

    // CreateCounselTechniqueRequestDto → CreateCounselTechniqueRequest
    default CreateCounselTechniqueRequest ofCounselTechnique(CounselingPromptDto.CreateCounselTechniqueRequestDto requestDto) {
        CreateCounselTechniqueRequest.Builder builder = CreateCounselTechniqueRequest.newBuilder()
                .setName(requestDto.getName())
                .setContext(requestDto.getContext())
                .setInstruction(requestDto.getInstruction());

        
        if (requestDto.getToneId() != null) {
            builder.setToneId(requestDto.getToneId());
        }
        
        return builder.build();
    }

    // GetCounselTechniquesRequestDto → FindCounselTechniquesRequest
    default FindCounselTechniquesRequest ofCounselTechniques(CounselingPromptDto.GetCounselTechniquesRequestDto requestDto) {
        FindCounselTechniquesRequest.Builder builder = FindCounselTechniquesRequest.newBuilder();
        
        if (requestDto.getName() != null) {
            builder.setName(requestDto.getName());
        }
        
        if (requestDto.getToneId() != null) {
            builder.setToneId(requestDto.getToneId());
        }
        
        
        return builder.build();
    }

    // String(counselTechniqueId) → FindCounselTechniqueByIdRequest
    default FindCounselTechniqueByIdRequest ofCounselTechniqueId(String counselTechniqueId) {
        return FindCounselTechniqueByIdRequest.newBuilder()
                .setCounselTechniqueId(counselTechniqueId)
                .build();
    }

    // UpdateCounselTechniqueRequestDto → UpdateCounselTechniqueRequest
    default UpdateCounselTechniqueRequest ofCounselTechniqueUpdate(
            CounselingPromptDto.UpdateCounselTechniqueRequestDto requestDto, String counselTechniqueId) {
        UpdateCounselTechniqueRequest.Builder builder = UpdateCounselTechniqueRequest.newBuilder()
                .setCounselTechniqueId(counselTechniqueId);
        
        if (requestDto.getName() != null) {
            builder.setName(requestDto.getName());
        }
        
        if (requestDto.getToneId() != null) {
            builder.setToneId(requestDto.getToneId());
        }
        
        if (requestDto.getContext() != null) {
            builder.setContext(requestDto.getContext());
        }
        
        if (requestDto.getInstruction() != null) {
            builder.setInstruction(requestDto.getInstruction());
        }
        
        
        return builder.build();
    }

    // SaveCounselTechniqueSequenceRequestDto → SaveCounselTechniqueSequenceRequest
    default SaveCounselTechniqueSequenceRequest ofCounselTechniqueSequence(
            CounselingPromptDto.SaveCounselTechniqueSequenceRequestDto requestDto) {
        return SaveCounselTechniqueSequenceRequest.newBuilder()
                .addAllCounselTechniqueIds(requestDto.getCounselTechniqueIds())
                .build();
    }

    // CounselTechnique → CreateCounselTechniqueResponseDto
    default CounselingPromptDto.CreateCounselTechniqueResponseDto ofCounselTechniqueCreate(CounselTechnique counselTechnique) {
        CounselingPromptDto.CreateCounselTechniqueResponseDto responseDto = new CounselingPromptDto.CreateCounselTechniqueResponseDto();
        responseDto.setCounselTechnique(ofCounselTechnique(counselTechnique));
        return responseDto;
    }

    // CounselTechnique → UpdateCounselTechniqueResponseDto
    default CounselingPromptDto.UpdateCounselTechniqueResponseDto ofCounselTechniqueUpdate(CounselTechnique counselTechnique) {
        CounselingPromptDto.UpdateCounselTechniqueResponseDto responseDto = new CounselingPromptDto.UpdateCounselTechniqueResponseDto();
        responseDto.setCounselTechnique(ofCounselTechnique(counselTechnique));
        return responseDto;
    }

    // CounselTechnique → GetCounselTechniqueByIdResponseDto
    default CounselingPromptDto.GetCounselTechniqueByIdResponseDto ofCounselTechniqueById(CounselTechnique counselTechnique) {
        CounselingPromptDto.GetCounselTechniqueByIdResponseDto responseDto = new CounselingPromptDto.GetCounselTechniqueByIdResponseDto();
        responseDto.setCounselTechnique(ofCounselTechnique(counselTechnique));
        return responseDto;
    }

    // List<CounselTechnique> → GetCounselTechniquesResponseDto
    default CounselingPromptDto.GetCounselTechniquesResponseDto ofCounselTechniques(List<CounselTechnique> counselTechniques) {
        List<CounselingPromptDto.CounselTechniqueResponseDto> dtos = counselTechniques.stream()
                .map(this::ofCounselTechnique)
                .collect(Collectors.toList());
        
        CounselingPromptDto.GetCounselTechniquesResponseDto responseDto = new CounselingPromptDto.GetCounselTechniquesResponseDto();
        responseDto.setCounselTechniques(dtos);
        return responseDto;
    }

    // List<CounselTechnique> → SaveCounselTechniqueSequenceResponseDto
    default CounselingPromptDto.SaveCounselTechniqueSequenceResponseDto ofCounselTechniqueSequence(List<CounselTechnique> counselTechniques) {
        List<CounselingPromptDto.CounselTechniqueResponseDto> dtos = counselTechniques.stream()
                .map(this::ofCounselTechnique)
                .collect(Collectors.toList());
        
        CounselingPromptDto.SaveCounselTechniqueSequenceResponseDto responseDto = new CounselingPromptDto.SaveCounselTechniqueSequenceResponseDto();
        responseDto.setCounselTechniques(dtos);
        return responseDto;
    }
}