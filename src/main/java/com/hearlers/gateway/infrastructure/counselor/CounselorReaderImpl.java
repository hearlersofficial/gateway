package com.hearlers.gateway.infrastructure.counselor;

import java.util.List;

import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;
import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc.CounselorServiceBlockingStub;
import com.hearlers.gateway.application.counselor.CounselorReader;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CounselorReaderImpl implements CounselorReader {
    private final CounselorServiceBlockingStub counselorServiceBlockingStub;

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
    
}
