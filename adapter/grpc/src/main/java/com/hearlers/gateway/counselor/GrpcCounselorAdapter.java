package com.hearlers.gateway.counselor;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;
import com.hearlers.gateway.port.CounselorPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GrpcCounselorAdapter implements CounselorPort {
    private final CounselorServiceGrpc.CounselorServiceBlockingStub counselorServiceBlockingStub;

    @Override
    public Counselor findCounselorById(FindCounselorByIdRequest request) {
        return counselorServiceBlockingStub.findCounselorById(request).getCounselor();
    }

    @Override
    public List<Counselor> findCounselors(FindCounselorsRequest request) {
        return counselorServiceBlockingStub.findCounselors(request).getCounselorsList();
    }

    @Override
    public Episode findEpisodeById(FindEpisodeByIdRequest request) {
        return counselorServiceBlockingStub.findEpisodeById(request).getEpisode();
    }

    @Override
    public List<Episode> findEpisodes(FindEpisodesRequest request) {
        return counselorServiceBlockingStub.findEpisodes(request).getEpisodesList();
    }

    @Override
    public Bubble findBubbleById(FindBubbleByIdRequest request) {
        return counselorServiceBlockingStub.findBubbleById(request).getBubble();
    }

    @Override
    public List<Bubble> findBubbles(FindBubblesRequest request) {
        return counselorServiceBlockingStub.findBubbles(request).getBubblesList();
    }

    @Override
    public Bubble findRandomBubble(FindRandomBubbleRequest request) {
        return counselorServiceBlockingStub.findRandomBubble(request).getBubble();
    }

    @Override
    public Tone findToneById(FindToneByIdRequest request) {
        return counselorServiceBlockingStub.findToneById(request).getTone();
    }

    @Override
    public List<Tone> findTones(FindTonesRequest request) {
        return counselorServiceBlockingStub.findTones(request).getTonesList();
    }

    @Override
    public Counselor createCounselor(CreateCounselorRequest request) {
        return counselorServiceBlockingStub.createCounselor(request).getCounselor();
    }

    @Override
    public Counselor updateCounselor(UpdateCounselorRequest request) {
        return counselorServiceBlockingStub.updateCounselor(request).getCounselor();
    }

    @Override
    public Episode createEpisode(CreateEpisodeRequest request) {
        return counselorServiceBlockingStub.createEpisode(request).getEpisode();
    }

    @Override
    public Episode updateEpisode(UpdateEpisodeRequest request) {
        return counselorServiceBlockingStub.updateEpisode(request).getEpisode();
    }

    @Override
    public Bubble createBubble(CreateBubbleRequest request) {
        return counselorServiceBlockingStub.createBubble(request).getBubble();
    }

    @Override
    public Bubble updateBubble(UpdateBubbleRequest request) {
        return counselorServiceBlockingStub.updateBubble(request).getBubble();
    }

    @Override
    public Tone createTone(CreateToneRequest request) {
        return counselorServiceBlockingStub.createTone(request).getTone();
    }

    @Override
    public Tone updateTone(UpdateToneRequest request) {
        return counselorServiceBlockingStub.updateTone(request).getTone();
    }

    @Override
    public PresignedUrl generateCounselorImageUrl(GenerateCounselorImageUrlRequest request) {
        return counselorServiceBlockingStub.generateCounselorImageUrl(request).getPresignedUrl();
    }

    @Override
    public PresignedUrl generateCutSceneImageUrl(GenerateCutSceneImageUrlRequest request) {
        return counselorServiceBlockingStub.generateCutSceneImageUrl(request).getPresignedUrl();
    }
}
