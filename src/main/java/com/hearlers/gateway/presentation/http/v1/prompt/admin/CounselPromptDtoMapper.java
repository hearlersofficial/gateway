package com.hearlers.gateway.presentation.http.v1.prompt.admin;

import java.util.List;
import java.util.stream.Collectors;

import com.hearlers.api.proto.v1.service.*;
import org.mapstruct.*;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.CounselorScopedPrompt;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptActivateHistory;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;
import com.hearlers.api.proto.v1.model.ToneScopedPrompt;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CounselPromptDtoMapper {
    
    // PromptVersion 관련 매핑

    @Mappings({
            @Mapping(source = "counselorScopedPromptsList", target = "counselorScopedPrompts"),
            @Mapping(source = "toneScopedPromptsList", target = "toneScopedPrompts")
    })
    CounselPromptDto.PromptVersionResponseDto of(PromptVersion promptVersion);
    CounselPromptDto.CounselorScopedPromptResponseDto of(CounselorScopedPrompt counselorScopedPrompt);
    CounselPromptDto.ToneScopedPromptResponseDto of(ToneScopedPrompt toneScopedPrompt);


    // PersonaPrompt 관련 매핑
    CounselPromptDto.PersonaPromptResponseDto of(PersonaPrompt personaPrompt);
    
    // TonePrompt 관련 매핑
    CounselPromptDto.TonePromptResponseDto of(TonePrompt tonePrompt);
    
    // CounselTechnique 관련 매핑
    CounselPromptDto.CounselTechniqueResponseDto of(CounselTechnique counselTechnique);
    
    // PromptActivateHistory 관련 매핑
    CounselPromptDto.PromptActivateHistoryResponseDto of(PromptActivateHistory promptActivateHistory);
    
    // 요청 DTO 변환 메소드
    default FindPromptVersionsRequest toFindPromptVersionsRequest(CounselPromptDto.FindPromptVersionsRequestDto dto) {
        FindPromptVersionsRequest.Builder builder = FindPromptVersionsRequest.newBuilder();
        if (dto.getName() != null) {
            builder.setName(dto.getName());
        }
        return builder.build();
    }
    
    UpdatePromptVersionRequest toUpdatePromptVersionRequest(CounselPromptDto.UpdatePromptVersionRequestDto dto, String promptVersionId);

    default DeletePromptVersionsRequest toDeletePromptVersionRequest(String promptVersionId) {
        return DeletePromptVersionsRequest.newBuilder()
                .addPromptVersionIds(promptVersionId)
                .build();
    }

    SaveTemporaryVersionRequest toSaveTemporaryVersionRequest(CounselPromptDto.SaveTemporaryVersionRequestDto dto);

    UpdateTonePromptRequest toUpdateTonePromptRequest(CounselPromptDto.UpdateTonePromptRequestDto dto);
    
    UpdatePersonaPromptRequest toUpdatePersonaPromptRequest(CounselPromptDto.UpdatePersonaPromptRequestDto dto);
    
    CreateCounselTechniqueRequest toCreateCounselTechniqueRequest(CounselPromptDto.CreateCounselTechniqueRequestDto dto);
    
    UpdateCounselTechniqueRequest toUpdateCounselTechniqueRequest(CounselPromptDto.UpdateCounselTechniqueRequestDto dto, String counselTechniqueId);

    @Mapping(source = "counselTechniqueIds", target = "counselTechniqueIdsList")
    default SaveCounselTechniqueSequenceRequest toSaveCounselTechniqueSequenceRequest(CounselPromptDto.SaveCounselTechniqueSequenceRequestDto dto) {
        return SaveCounselTechniqueSequenceRequest.newBuilder()
                .addAllCounselTechniqueIds(dto.getCounselTechniqueIds())
                .setToneId(dto.getToneId())
                .build();
    }
    
    FindPromptVersionByIdRequest toFindPromptVersionByIdRequest(String promptVersionId);
    
    ActivatePromptVersionRequest toActivatePromptVersionRequest(String promptVersionId);
    
    FindPersonaPromptByIdRequest toFindPersonaPromptByIdRequest(String personaPromptId);
    
    FindTonePromptByIdRequest toFindTonePromptByIdRequest(String tonePromptId);
    
    FindCounselTechniqueByIdRequest toFindCounselTechniqueByIdRequest(String counselTechniqueId);

    FindOrderedCounselTechniquesRequest toFindOrderedCounselTechniquesRequest(String firstCounselTechniqueId);
    
    FindPromptActivateHistoriesRequest toFindPromptActivateHistoriesRequest(String promptVersionId);
    
    // 응답 DTO 변환 메소드
    default CounselPromptDto.FindPromptVersionsResponseDto toFindPromptVersionsResponseDto(List<PromptVersion> promptVersions) {
        return CounselPromptDto.FindPromptVersionsResponseDto.builder()
                .promptVersions(promptVersions.stream().map(this::of).collect(Collectors.toList())).build();
    }
    
    CounselPromptDto.FindPromptVersionByIdResponseDto toFindPromptVersionByIdResponseDto(PromptVersion promptVersion);

    CounselPromptDto.UpdatePromptVersionResponseDto toUpdatePromptVersionResponseDto(PromptVersion promptVersion);

    CounselPromptDto.DeletePromptVersionResponseDto toDeletePromptVersionResponseDto(Boolean isSuccess);

    CounselPromptDto.FindActiveVersionResponseDto toFindActiveVersionResponseDto(PromptVersion promptVersion);

    CounselPromptDto.FindTemporaryVersionResponseDto toFindTemporaryVersionResponseDto(PromptVersion promptVersion);
    
    CounselPromptDto.LoadExistingPromptVersionResponseDto toLoadExistingPromptVersionResponseDto(PromptVersion promptVersion);
    
    CounselPromptDto.SaveTemporaryVersionResponseDto toSaveTemporaryVersionResponseDto(PromptVersion promptVersion);
    
    CounselPromptDto.ActivatePromptVersionResponseDto toActivatePromptVersionResponseDto(PromptVersion promptVersion);
    
    CounselPromptDto.FindPersonaPromptByIdResponseDto toFindPersonaPromptByIdResponseDto(PersonaPrompt personaPrompt);
    
    CounselPromptDto.UpdatePersonaPromptResponseDto toUpdatePersonaPromptResponseDto(PersonaPrompt personaPrompt);
    
    CounselPromptDto.FindTonePromptByIdResponseDto toFindTonePromptByIdResponseDto(TonePrompt tonePrompt);
    
    CounselPromptDto.UpdateTonePromptResponseDto toUpdateTonePromptResponseDto(TonePrompt tonePrompt);
    
    CounselPromptDto.CreateCounselTechniqueResponseDto toCreateCounselTechniqueResponseDto(CounselTechnique counselTechnique);

    default CounselPromptDto.FindOrderedCounselTechniquesResponseDto toFindOrderedCounselTechniquesResponseDto(List<CounselTechnique> counselTechniques) {
        return CounselPromptDto.FindOrderedCounselTechniquesResponseDto.builder()
                .counselTechniques(counselTechniques.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
    
    CounselPromptDto.FindCounselTechniqueByIdResponseDto toFindCounselTechniqueByIdResponseDto(CounselTechnique counselTechnique);
    
    default CounselPromptDto.UpdateCounselTechniqueResponseDto toUpdateCounselTechniqueResponseDto(List<CounselTechnique> counselTechniques) {
        return CounselPromptDto.UpdateCounselTechniqueResponseDto.builder()
                .counselTechnique(counselTechniques.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
    
    default CounselPromptDto.SaveCounselTechniqueSequenceResponseDto toSaveCounselTechniqueSequenceResponseDto(List<CounselTechnique> counselTechniques) {
        return CounselPromptDto.SaveCounselTechniqueSequenceResponseDto.builder()
                .counselTechniques(counselTechniques.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
    
    default CounselPromptDto.FindPromptActivateHistoriesResponseDto toFindPromptActivateHistoriesResponseDto(List<PromptActivateHistory> promptActivateHistories) {
        return CounselPromptDto.FindPromptActivateHistoriesResponseDto.builder()
                .promptActivateHistories(promptActivateHistories.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
}