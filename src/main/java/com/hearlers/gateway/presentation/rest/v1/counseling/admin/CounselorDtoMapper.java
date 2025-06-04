package com.hearlers.gateway.presentation.rest.v1.counseling.admin;

import java.util.List;

import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;
import com.hearlers.api.proto.v1.common.PresignedUrl;
import org.mapstruct.*;

import com.hearlers.api.proto.v1.model.Counselor;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CounselorDtoMapper {

    // Counselor → CounselorDto
    CounselorDto.Counselor of (Counselor counselor);

    // Tone → ToneDto
    CounselorDto.Tone of (Tone tone);

    // Bubble → BubbleDto
    CounselorDto.Bubble of (Bubble bubble);

    // Counselor
    // FindOne
    FindCounselorByIdRequest toFindCounselorRequest (String counselorId);
    CounselorDto.FindCounselorByIdResponse toFindCounselorResponse (Counselor counselor);

    // FindMany
    FindCounselorsRequest toFindCounselorsRequest (CounselorDto.FindCounselorsRequest request);
    default CounselorDto.FindCounselorsResponse toFindCounselorsResponse (List<Counselor> counselors) {
        return CounselorDto.FindCounselorsResponse.builder()
                .counselors(counselors.stream()
                        .map(this::of)
                        .toList())
                .build();
    }

    // Create
    CreateCounselorRequest toCreateCounselorRequest(CounselorDto.CreateCounselorRequest request);
    CounselorDto.CreateCounselorResponse toCreateCounselorResponse(Counselor counselor);

    // Update
    default UpdateCounselorRequest toUpdateCounselorRequest(String counselorId, CounselorDto.UpdateCounselorRequest request) {
        UpdateCounselorRequest.Builder builder = UpdateCounselorRequest.newBuilder()
                .setCounselorId(counselorId);
        
        if (request.getToneId() != null) {
            builder.setToneId(request.getToneId());
        }
        
        if (request.getName() != null) {
            builder.setName(request.getName());
        }
        
        if (request.getDescription() != null) {
            builder.setDescription(request.getDescription());
        }
        
        if (request.getProfileImage() != null) {
            builder.setProfileImage(request.getProfileImage());
        }
        
        if (request.getGender() != null) {
            builder.setCounselorGender(request.getGender());
        }
        
        return builder.build();
    }
    
    CounselorDto.UpdateCounselorResponse toUpdateCounselorResponse(Counselor counselor);
    GenerateCounselorImageUrlRequest toGenerateCounselorImageUrlRequest(CounselorDto.GenerateCounselorImageUrlRequest request, String counselorId);
    CounselorDto.GenerateCounselorImageUrlResponse toGenerateCounselorImageUrlResponse(PresignedUrl presignedUrl);

    // Tone
    // FindOne
    FindToneByIdRequest toFindToneRequest (String toneId);
    CounselorDto.FindToneByIdResponse toFindToneResponse (Tone tone);

    // FindMany
    FindTonesRequest toFindTonesRequest (CounselorDto.FindTonesRequest request);
    default CounselorDto.FindTonesResponse toFindTonesResponse (List<Tone> tones) {
        return CounselorDto.FindTonesResponse.builder()
                .tones(tones.stream()
                        .map(this::of)
                        .toList())
                .build();
    }
    
    CreateToneRequest toCreateToneRequest(CounselorDto.CreateToneRequest request);
    CounselorDto.CreateToneResponse toCreateToneResponse(Tone tone);

    // Update
    default UpdateToneRequest toUpdateToneRequest(String toneId, CounselorDto.UpdateToneRequest request) {
        UpdateToneRequest.Builder builder = UpdateToneRequest.newBuilder()
                .setToneId(toneId);
                
        if (request.getName() != null) {
            builder.setName(request.getName());
        }
        
        if (request.getDescription() != null) {
            builder.setDescription(request.getDescription());
        }
        
        return builder.build();
    }
    
    CounselorDto.UpdateToneResponse toUpdateToneResponse(Tone tone);

    // Generate Cut Scene Image URL
    GenerateCutSceneImageUrlRequest toGenerateCutSceneImageUrlRequest(CounselorDto.GenerateCutSceneImageUrlRequest request, String episodeId);
    CounselorDto.GenerateCutSceneImageUrlResponse toGenerateCutSceneImageUrlResponse(PresignedUrl presignedUrl);

    // Episode → EpisodeDto
    @Mappings({
            @Mapping(source = "cutScenesList", target = "cutScenes"),
    })
    CounselorDto.Episode of(com.hearlers.api.proto.v1.model.Episode episode);
    // EpisodeCutScene → EpisodeCutSceneDto
    CounselorDto.EpisodeCutScene of(com.hearlers.api.proto.v1.model.EpisodeCutScene episodeCutScene);

    // Episode
    // FindOne
    FindEpisodeByIdRequest toFindEpisodeByIdRequest(String episodeId, Boolean withTemporary);
    CounselorDto.FindEpisodeByIdResponse toFindEpisodeByIdResponse(Episode episode);

    // FindMany
    FindEpisodesRequest toFindEpisodesRequest(String counselorId, Boolean withTemporary);
    default CounselorDto.FindEpisodesResponse toFindEpisodesResponse(List<Episode> episodes) {
        return CounselorDto.FindEpisodesResponse.builder()
                .episodes(episodes.stream()
                        .map(this::of)
                        .toList())
                .build();
    }

    // Create
    @Mapping(target = "cutScenesList", ignore = true)
    CreateEpisodeRequest toPartialCreateEpisodeRequest(String counselorId, CounselorDto.CreateEpisodeRequest request);
    default CreateEpisodeRequest toCreateEpisodeRequest(String counselorId, CounselorDto.CreateEpisodeRequest request) {
        return  toPartialCreateEpisodeRequest(counselorId, request).toBuilder()
                .addAllCutScenes(request.getCutScenes().stream()
                        .map(this::toSaveEpisodeCutSceneRequest)
                        .toList())
                .build();
    }

    default CounselorDto.CreateEpisodeResponse toCreateEpisodeResponse(com.hearlers.api.proto.v1.model.Episode episode) {
        CounselorDto.Episode episodeDto = of(episode);
        return CounselorDto.CreateEpisodeResponse.builder()
                .episode(episodeDto)
                .build();
    }

    // Update
    @Mapping(target = "cutScenesList", ignore = true)
    UpdateEpisodeRequest toPartialUpdateEpisodeRequest(String episodeId, CounselorDto.UpdateEpisodeRequest request);
    default UpdateEpisodeRequest toUpdateEpisodeRequest(String episodeId, CounselorDto.UpdateEpisodeRequest request) {
        return  toPartialUpdateEpisodeRequest(episodeId, request).toBuilder()
                .addAllCutScenes(request.getCutScenes().stream()
                        .map(this::toSaveEpisodeCutSceneRequest)
                        .toList())
                .build();
    }
    CounselorDto.UpdateEpisodeResponse toUpdateEpisodeResponse(Episode episode);

    // Helper methods
    SaveEpisodeCutSceneRequest toSaveEpisodeCutSceneRequest(CounselorDto.SaveEpisodeCutSceneRequest request);
    SaveEpisodeCutSceneRequest toSaveEpisodeCutSceneRequest(CounselorDto.SaveNewEpisodeCutSceneRequest request);


    // Bubbles
    // Create
    CreateBubbleRequest toCreateBubbleRequest(String counselorId, CounselorDto.CreateBubbleRequest request);
    CounselorDto.CreateBubbleResponse toCreateBubbleResponse(Bubble bubble);

    // Update
    UpdateBubbleRequest toUpdateBubbleRequest(String counselorId, String bubbleId, CounselorDto.UpdateBubbleRequest request);
    CounselorDto.UpdateBubbleResponse toUpdateBubbleResponse (Bubble bubble);

    // FindOne
    FindBubbleByIdRequest toFindBubbleByIdRequest (String counselorId, String bubbleId);
    CounselorDto.FindBubbleByIdResponse toFindBubbleByIdResponse (Bubble bubble);

    // FindMany
    FindBubblesRequest toFindBubblesRequest (String counselorId);
    default CounselorDto.FindBubblesResponse toFindBubblesResponse (List<Bubble> bubbles) {
        return CounselorDto.FindBubblesResponse.builder()
                .bubbles(bubbles.stream()
                        .map(this::of)
                        .toList())
                .build();
    };

    // FindRandomBubble
    FindRandomBubbleRequest toFindRandomBubbleRequest(String counselorId);
    CounselorDto.FindRandomBubbleResponse toFindRandomBubbleResponse(Bubble bubble);
}
