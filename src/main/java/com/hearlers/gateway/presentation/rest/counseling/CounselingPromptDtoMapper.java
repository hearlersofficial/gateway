package com.hearlers.gateway.presentation.rest.counseling;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
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
}