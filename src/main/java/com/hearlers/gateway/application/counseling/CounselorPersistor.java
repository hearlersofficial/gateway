package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;

public interface CounselorPersistor {
    // Counselor
    Counselor createCounselor(CreateCounselorRequest request);
    Counselor updateCounselor(UpdateCounselorRequest request);

    // Episode
    Episode createEpisode(CreateEpisodeRequest request);
    Episode updateEpisode(UpdateEpisodeRequest request);

    // Bubble
    Bubble createBubble(CreateBubbleRequest request);
    Bubble updateBubble(UpdateBubbleRequest request);

    // Tone
    Tone createTone(CreateToneRequest request);
    Tone updateTone(UpdateToneRequest request);
}
