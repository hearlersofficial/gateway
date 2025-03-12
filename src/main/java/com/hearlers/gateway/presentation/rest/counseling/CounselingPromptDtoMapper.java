package com.hearlers.gateway.presentation.rest.counseling;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;

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
}