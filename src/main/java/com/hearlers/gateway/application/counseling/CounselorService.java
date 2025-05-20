package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;
import com.hearlers.gateway.presentation.rest.v1.counseling.CounselorDto;
import com.hearlers.gateway.shared.presentation.PresignedUrlResponse;

public interface CounselorService {
    // Counselor
    Counselor findCounselorById(FindCounselorByIdRequest request);
    List<Counselor> findCounselors(FindCounselorsRequest request);
    Counselor createCounselor(CreateCounselorRequest request);
    Counselor updateCounselor(UpdateCounselorRequest request);
    PresignedUrl generateCounselorImageUrl(GenerateCounselorImageUrlRequest request);

    // Episode
    Episode findEpisodeById(FindEpisodeByIdRequest request);
    List<Episode> findEpisodes(FindEpisodesRequest request);
    Episode createEpisode(CreateEpisodeRequest request);
    Episode updateEpisode(UpdateEpisodeRequest request);
    PresignedUrl generateCutSceneImageUrl(GenerateCutSceneImageUrlRequest request);



    // Tone
    Tone findToneById(FindToneByIdRequest request);
    List<Tone> findTones(FindTonesRequest request);
    Tone createTone(CreateToneRequest request);
    Tone updateTone(UpdateToneRequest request);
}
