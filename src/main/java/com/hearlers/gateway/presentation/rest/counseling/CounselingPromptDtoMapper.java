package com.hearlers.gateway.presentation.rest.counseling;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.service.FindContextsRequest;



@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CounselingPromptDtoMapper {

    @Mapping(source = "placeholdersList", target = "placeholders")
    CounselingPromptDto.ContextResponseDto of(Context context);

    // default FindContextsRequest of(CounselingPromptDto.GetContextsRequestDto request) {
    //     return FindContextsRequest.newBuilder()
    //             .setName(request.getName())
    //             .build();
    // }

    FindContextsRequest of(CounselingPromptDto.GetContextsRequestDto request);


}