package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;

public interface CounselorReader {
    // Counselor
    Counselor findCounselorById(FindCounselorByIdRequest request);
    List<Counselor> findCounselors(FindCounselorsRequest request);

    // Episode
    Episode findEpisodeById(FindEpisodeByIdRequest request);
    List<Episode> findEpisodes(FindEpisodesRequest request);


    // Tone
    Tone findToneById(FindToneByIdRequest request);
    List<Tone> findTones(FindTonesRequest request);
}
