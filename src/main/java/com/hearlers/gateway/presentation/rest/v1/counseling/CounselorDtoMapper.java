package com.hearlers.gateway.presentation.rest.v1.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;
import com.hearlers.api.proto.v1.common.Extension;
import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.gateway.shared.presentation.PresignedUrlResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

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

    // Counselor
    // FindOne
    default FindCounselorByIdRequest toFindCounselorRequest (String counselorId) {
        return FindCounselorByIdRequest.newBuilder()
                .setCounselorId(counselorId)
                .build();
    }

    default CounselorDto.FindCounselorByIdResponse toFindCounselorResponse (Counselor counselor) {
        CounselorDto.Counselor counselorDto = of(counselor);
        return CounselorDto.FindCounselorByIdResponse.builder()
                .counselor(counselorDto)
                .build();
    }

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
    default CreateCounselorRequest toCreateCounselorRequest(CounselorDto.CreateCounselorRequest request) {
        return CreateCounselorRequest.newBuilder()
                .setToneId(request.getToneId())
                .setName(request.getName())
                .setDescription(request.getDescription())
                .setProfileImage(request.getProfileImage())
                .setCounselorGender(request.getGender())
                .build();
    }
    
    default CounselorDto.CreateCounselorResponse toCreateCounselorResponse(Counselor counselor) {
        CounselorDto.Counselor counselorDto = of(counselor);
        return CounselorDto.CreateCounselorResponse.builder()
                .counselor(counselorDto)
                .build();
    }
    
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
    
    default CounselorDto.UpdateCounselorResponse toUpdateCounselorResponse(Counselor counselor) {
        CounselorDto.Counselor counselorDto = of(counselor);
        return CounselorDto.UpdateCounselorResponse.builder()
                .counselor(counselorDto)
                .build();
    }

    // Generate Image URL
    default GenerateCounselorImageUrlRequest toGenerateCounselorImageUrlRequest(CounselorDto.GenerateCounselorImageUrlRequest request, String counselorId) {
        return GenerateCounselorImageUrlRequest.newBuilder()
                .setCounselorId(counselorId)
                .setExtension(request.getExtension())
                .build();
    }

    default CounselorDto.GenerateCounselorImageUrlResponse toGenerateCounselorImageUrlResponse(PresignedUrl presignedUrl) {
        return CounselorDto.GenerateCounselorImageUrlResponse.builder()
                .presignedUrl(PresignedUrlResponse.of(presignedUrl))
                .build();
    }

    // Tone
    // FindOne
    default FindToneByIdRequest toFindToneRequest (String toneId) {
        return FindToneByIdRequest.newBuilder()
                .setToneId(toneId)
                .build();
    }

    default CounselorDto.FindToneByIdResponse toFindToneResponse (Tone tone) {
        CounselorDto.Tone toneDto = of(tone);
        return CounselorDto.FindToneByIdResponse.builder()
                .tone(toneDto)
                .build();
    }

    // FindMany
    FindTonesRequest toFindTonesRequest (CounselorDto.FindTonesRequest request);
    default CounselorDto.FindTonesResponse toFindTonesResponse (List<Tone> tones) {
        return CounselorDto.FindTonesResponse.builder()
                .tones(tones.stream()
                        .map(this::of)
                        .toList())
                .build();
    }
    
    // Create
    default CreateToneRequest toCreateToneRequest(CounselorDto.CreateToneRequest request) {
        return CreateToneRequest.newBuilder()
                .setName(request.getName())
                .setDescription(request.getDescription())
                .build();
    }
    
    default CounselorDto.CreateToneResponse toCreateToneResponse(Tone tone) {
        CounselorDto.Tone toneDto = of(tone);
        return CounselorDto.CreateToneResponse.builder()
                .tone(toneDto)
                .build();
    }
    
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
    
    default CounselorDto.UpdateToneResponse toUpdateToneResponse(Tone tone) {
        CounselorDto.Tone toneDto = of(tone);
        return CounselorDto.UpdateToneResponse.builder()
                .tone(toneDto)
                .build();
    }

    // Generate Cut Scene Image URL
    default GenerateCutSceneImageUrlRequest toGenerateCutSceneImageUrlRequest(CounselorDto.GenerateCutSceneImageUrlRequest request, String episodeId) {
        return GenerateCutSceneImageUrlRequest.newBuilder()
                .setEpisodeId(episodeId)
                .setExtension(request.getExtension())
                .build();
    }

    default CounselorDto.GenerateCutSceneImageUrlResponse toGenerateCutSceneImageUrlResponse(PresignedUrl presignedUrl) {
        return CounselorDto.GenerateCutSceneImageUrlResponse.builder()
                .presignedUrl(PresignedUrlResponse.of(presignedUrl))
                .build();
    }

    // Episode → EpisodeDto
    CounselorDto.Episode of(com.hearlers.api.proto.v1.model.Episode episode);

    // Episode
    // FindOne
    default FindEpisodeByIdRequest toFindEpisodeByIdRequest(String episodeId) {
        return FindEpisodeByIdRequest.newBuilder()
                .setEpisodeId(episodeId)
                .build();
    }

    default CounselorDto.FindEpisodeByIdResponse toFindEpisodeByIdResponse(com.hearlers.api.proto.v1.model.Episode episode) {
        CounselorDto.Episode episodeDto = of(episode);
        return CounselorDto.FindEpisodeByIdResponse.builder()
                .episode(episodeDto)
                .build();
    }

    // FindMany
    FindEpisodesRequest toFindEpisodesRequest(String counselorId);
    default CounselorDto.FindEpisodesResponse toFindEpisodesResponse(List<com.hearlers.api.proto.v1.model.Episode> episodes) {
        return CounselorDto.FindEpisodesResponse.builder()
                .episodes(episodes.stream()
                        .map(this::of)
                        .toList())
                .build();
    }

    // Create
    default CreateEpisodeRequest toCreateEpisodeRequest(CounselorDto.CreateEpisodeRequest request, String counselorId) {
        return CreateEpisodeRequest.newBuilder()
                .setCounselorId(counselorId)
                .setTitle(request.getTitle())
                .setRequiredRapportThreshold(request.getRequiredRapportThreshold())
                .setIsTemporary(request.getIsTemporary())
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
    default UpdateEpisodeRequest toUpdateEpisodeRequest(String episodeId, CounselorDto.UpdateEpisodeRequest request) {
        UpdateEpisodeRequest.Builder builder = UpdateEpisodeRequest.newBuilder()
                .setEpisodeId(episodeId);

        if (request.getTitle() != null) {
            builder.setTitle(request.getTitle());
        }

        if (request.getRequiredRapportThreshold() != null) {
            builder.setRequiredRapportThreshold(request.getRequiredRapportThreshold());
        }

        if (request.getIsTemporary() != null) {
            builder.setIsTemporary(request.getIsTemporary());
        }

        if (request.getCutScenes() != null) {
            builder.addAllCutScenes(request.getCutScenes().stream()
                    .map(this::toSaveEpisodeCutSceneRequest)
                    .toList());
        }

        return builder.build();
    }

    default CounselorDto.UpdateEpisodeResponse toUpdateEpisodeResponse(com.hearlers.api.proto.v1.model.Episode episode) {
        CounselorDto.Episode episodeDto = of(episode);
        return CounselorDto.UpdateEpisodeResponse.builder()
                .episode(episodeDto)
                .build();
    }

    // Helper methods
    default SaveEpisodeCutSceneRequest toSaveEpisodeCutSceneRequest(CounselorDto.SaveEpisodeCutSceneRequest request) {
        SaveEpisodeCutSceneRequest.Builder builder = SaveEpisodeCutSceneRequest.newBuilder()
                .setSpeaker(request.getSpeaker())
                .setContent(request.getContent())
                .setOrderIndex(request.getOrderIndex())
                .setImage(request.getImage());

        if (request.getId() != null) {
            builder.setId(request.getId());
        }

        return builder.build();
    }
}
