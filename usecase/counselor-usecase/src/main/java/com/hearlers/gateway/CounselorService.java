package com.hearlers.gateway;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;
import com.hearlers.gateway.port.CounselorPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CounselorService implements CounselorUseCase {
    private final CounselorPort counselorPort;

    @Override
    public Counselor findCounselorById(FindCounselorByIdRequest request) {
        return counselorPort.findCounselorById(request);
    }

    @Override
    public List<Counselor> findCounselors(FindCounselorsRequest request) {
        return counselorPort.findCounselors(request);
    }

    @Override
    public Counselor createCounselor(CreateCounselorRequest request) {
        return counselorPort.createCounselor(request);
    }

    @Override
    public Counselor updateCounselor(UpdateCounselorRequest request) {
        return counselorPort.updateCounselor(request);
    }

    @Override
    public Episode findEpisodeById(FindEpisodeByIdRequest request) {
        return counselorPort.findEpisodeById(request);
    }

    @Override
    public List<Episode> findEpisodes(FindEpisodesRequest request) {
        return counselorPort.findEpisodes(request);
    }

    @Override
    public Episode createEpisode(CreateEpisodeRequest request) {
        return counselorPort.createEpisode(request);
    }

    @Override
    public Episode updateEpisode(UpdateEpisodeRequest request) {
        return counselorPort.updateEpisode(request);
    }

    @Override
    public Bubble createBubble(CreateBubbleRequest request) {
        return counselorPort.createBubble(request);
    }

    @Override
    public Bubble updateBubble(UpdateBubbleRequest request) {
        return counselorPort.updateBubble(request);
    }

    @Override
    public Bubble findBubbleById(FindBubbleByIdRequest request) {
        return counselorPort.findBubbleById(request);
    }

    @Override
    public List<Bubble> findBubbles(FindBubblesRequest request) {
        return counselorPort.findBubbles(request);
    }

    @Override
    public Bubble findRandomBubble(FindRandomBubbleRequest request) {
        return counselorPort.findRandomBubble(request);
    }

    @Override
    public Tone findToneById(FindToneByIdRequest request) {
        return counselorPort.findToneById(request);
    }

    @Override
    public List<Tone> findTones(FindTonesRequest request) {
        return counselorPort.findTones(request);
    }

    @Override
    public Tone createTone(CreateToneRequest request) {
        return counselorPort.createTone(request);
    }

    @Override
    public Tone updateTone(UpdateToneRequest request) {
        return counselorPort.updateTone(request);
    }

    @Override
    public PresignedUrl generateCutSceneImageUrl(GenerateCutSceneImageUrlRequest request) {
        return counselorPort.generateCutSceneImageUrl(request);
    }

    @Override
    public PresignedUrl generateCounselorImageUrl(GenerateCounselorImageUrlRequest request) {
        return counselorPort.generateCounselorImageUrl(request);
    }
}
