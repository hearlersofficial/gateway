package com.hearlers.gateway.infrastructure.counseling;

import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.service.*;
import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc.CounselorServiceBlockingStub;
import com.hearlers.gateway.application.counseling.CounselorPersistor;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CounselorPersistorImpl implements CounselorPersistor {
    private final CounselorServiceBlockingStub counselorServiceBlockingStub;
    
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
} 