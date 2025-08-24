package com.hearlers.gateway.presentation.http.v1.prompt.admin;

import java.util.List;
import java.util.stream.Collectors;

import com.hearlers.api.proto.v1.service.*;
import org.mapstruct.*;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptActivateHistory;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CounselPromptDtoMapper {
    
    // PromptVersion 관련 매핑
    CounselPromptDto.PromptVersionResponseDto of(PromptVersion promptVersion);

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
    
    FindPromptVersionByIdRequest toFindPromptVersionByIdRequest(String promptVersionId);
    
    ActivatePromptVersionRequest toActivatePromptVersionRequest(String promptVersionId);
    
    FindPersonaPromptByIdRequest toFindPersonaPromptByIdRequest(String personaPromptId);
    
    FindTonePromptByIdRequest toFindTonePromptByIdRequest(String tonePromptId);
    
    FindCounselTechniqueByIdRequest toFindCounselTechniqueByIdRequest(String counselTechniqueId);

    FindPromptActivateHistoriesRequest toFindPromptActivateHistoriesRequest(String promptVersionId);
    
    FindPersonaPromptsRequest toFindPersonaPromptsRequest(CounselPromptDto.FindPersonaPromptsRequestDto dto);
    
    FindTonePromptsRequest toFindTonePromptsRequest(CounselPromptDto.FindTonePromptsRequestDto dto);
    
    FindCounselTechniquesRequest toFindCounselTechniquesRequest(CounselPromptDto.FindCounselTechniquesRequestDto dto);
    
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
    
    default CounselPromptDto.FindPersonaPromptsResponseDto toFindPersonaPromptsResponseDto(List<PersonaPrompt> personaPrompts) {
        return CounselPromptDto.FindPersonaPromptsResponseDto.builder()
                .personaPrompts(personaPrompts.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
    
    CounselPromptDto.UpdatePersonaPromptResponseDto toUpdatePersonaPromptResponseDto(PersonaPrompt personaPrompt);
    
    CounselPromptDto.FindTonePromptByIdResponseDto toFindTonePromptByIdResponseDto(TonePrompt tonePrompt);

    default CounselPromptDto.FindTonePromptsResponseDto toFindTonePromptsResponseDto(List<TonePrompt> tonePrompts) {
        return CounselPromptDto.FindTonePromptsResponseDto.builder()
                .tonePrompts(tonePrompts.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
    
    CounselPromptDto.UpdateTonePromptResponseDto toUpdateTonePromptResponseDto(TonePrompt tonePrompt);
    
    CounselPromptDto.CreateCounselTechniqueResponseDto toCreateCounselTechniqueResponseDto(CounselTechnique counselTechnique);

    
    CounselPromptDto.FindCounselTechniqueByIdResponseDto toFindCounselTechniqueByIdResponseDto(CounselTechnique counselTechnique);

    default CounselPromptDto.FindCounselTechniquesResponseDto toFindCounselTechniquesResponseDto(List<CounselTechnique> counselTechniques) {
        return CounselPromptDto.FindCounselTechniquesResponseDto.builder()
                .counselTechniques(counselTechniques.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
    
    default CounselPromptDto.UpdateCounselTechniqueResponseDto toUpdateCounselTechniqueResponseDto(CounselTechnique counselTechnique) {
        return CounselPromptDto.UpdateCounselTechniqueResponseDto.builder()
                .counselTechnique(this.of(counselTechnique))
                .build();
    }

    
     default CounselPromptDto.FindPromptActivateHistoriesResponseDto toFindPromptActivateHistoriesResponseDto(List<PromptActivateHistory> promptActivateHistories) {
        return CounselPromptDto.FindPromptActivateHistoriesResponseDto.builder()
                .promptActivateHistories(promptActivateHistories.stream().map(this::of).collect(Collectors.toList()))
                .build();
    }
}