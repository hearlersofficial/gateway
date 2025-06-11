package com.hearlers.gateway.presentation.rest.v1.counsel.app;

import java.util.List;

import com.hearlers.api.proto.v1.model.Counsel;
import com.hearlers.api.proto.v1.model.CounselMessage;
import com.hearlers.api.proto.v1.model.CounselorUserRelationship;
import com.hearlers.api.proto.v1.service.*;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CounselDtoMapper {

    // Model mappings
    CounselDto.Counsel of(Counsel counsel);
    CounselDto.CounselMessage of(CounselMessage counselMessage);
    CounselDto.CounselorUserRelationship of(CounselorUserRelationship counselorUserRelationship);

    // Counsel
    // Create
    CreateCounselRequest toCreateCounselRequest(String userId, String counselorId, CounselDto.CreateCounselRequest request);
    default CounselDto.CreateCounselResponse toCreateCounselResponse(CreateCounselResponse response) {
        return CounselDto.CreateCounselResponse.builder()
                .counsel(of(response.getCounsel()))
                .counselMessages(response.getCounselMessagesList().stream()
                        .map(this::of)
                        .toList())
                .build();
    }

    FindCounselsRequest toFindCounselsRequest(String userId, String counselorId);
    default CounselDto.FindCounselsResponse toFindCounselsResponse(List<Counsel> counsels) {
        return CounselDto.FindCounselsResponse.builder()
                .counsels(counsels.stream()
                        .map(this::of)
                        .toList())
                .build();
    }

    FindCounselByIdRequest toFindCounselByIdRequest(String counselId);
    CounselDto.FindCounselByIdResponse toFindCounselByIdResponse(Counsel counsel);

    // Messages
    // Create
    CreateMessageRequest toCreateMessageRequest(String counselId, CounselDto.CreateMessageRequest request);
    CounselDto.CreateMessageResponse toCreateMessageResponse(CreateMessageResponse response);

    // FindMany Messages
    FindMessagesRequest toFindMessagesRequest(String counselId);
    default CounselDto.FindMessagesResponse toFindMessagesResponse(List<CounselMessage> counselMessages) {
        return CounselDto.FindMessagesResponse.builder()
                .counselMessages(counselMessages.stream()
                        .map(this::of)
                        .toList())
                .build();
    }

    ReactMessageRequest toReactMessageRequest(String messageId, CounselDto.ReactMessageRequest request);
    CounselDto.ReactMessageResponse toReactMessageResponse(CounselMessage counselMessage);

    FindCounselorUserRelationshipsRequest toFindCounselorUserRelationshipsRequest(String counselorId, String userId);
    default CounselDto.FindCounselorUserRelationshipsResponse toFindCounselorUserRelationshipsResponse(List<CounselorUserRelationship> relationships) {
        return CounselDto.FindCounselorUserRelationshipsResponse.builder()
                .counselorUserRelationships(relationships.stream()
                        .map(this::of)
                        .toList())
                .build();
    }
} 