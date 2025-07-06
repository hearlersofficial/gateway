package com.hearlers.gateway.presentation.http.v1.counselor.app;

import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;
import org.mapstruct.*;

import java.util.List;

@Mapper(
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
    
    // Episode → EpisodeDto
    @Mappings({
            @Mapping(source = "cutScenesList", target = "cutScenes"),
    })
    CounselorDto.Episode of(Episode episode);
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
