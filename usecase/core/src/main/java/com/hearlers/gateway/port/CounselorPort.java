package com.hearlers.gateway.port;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;

import java.util.List;

public interface CounselorPort {
    // Counselor
    Counselor findCounselorById(FindCounselorByIdRequest request);
    List<Counselor> findCounselors(FindCounselorsRequest request);

    Counselor createCounselor(CreateCounselorRequest request);
    Counselor updateCounselor(UpdateCounselorRequest request);

    // Episode
    Episode findEpisodeById(FindEpisodeByIdRequest request);
    List<Episode> findEpisodes(FindEpisodesRequest request);
    Episode createEpisode(CreateEpisodeRequest request);
    Episode updateEpisode(UpdateEpisodeRequest request);

    // Bubble
    Bubble findBubbleById(FindBubbleByIdRequest request);
    List<Bubble> findBubbles(FindBubblesRequest request);
    Bubble findRandomBubble(FindRandomBubbleRequest request);
    Bubble createBubble(CreateBubbleRequest request);
    Bubble updateBubble(UpdateBubbleRequest request);

    // Tone
    Tone findToneById(FindToneByIdRequest request);
    List<Tone> findTones(FindTonesRequest request);
    Tone createTone(CreateToneRequest request);
    Tone updateTone(UpdateToneRequest request);

    // ImageUrl
    PresignedUrl generateCounselorImageUrl(GenerateCounselorImageUrlRequest request);
    PresignedUrl generateCutSceneImageUrl(GenerateCutSceneImageUrlRequest request);
}
