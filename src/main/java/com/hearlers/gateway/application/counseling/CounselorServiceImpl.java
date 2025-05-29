package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.model.Bubble;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.service.*;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

import com.hearlers.api.proto.v1.model.Tone;

@Service
@RequiredArgsConstructor
public class CounselorServiceImpl implements CounselorService {
    private final CounselorReader counselorReader;
    private final CounselorPersistor counselorPersistor;
    private final CounselorPresigner counselorPresigner;

    // Counselor 조회
    @Override
    public Counselor findCounselorById(FindCounselorByIdRequest request) {
        return counselorReader.findCounselorById(request);
    }

    @Override
    public List<Counselor> findCounselors(FindCounselorsRequest request) {
        return counselorReader.findCounselors(request);
    }
    
    // Counselor 생성/업데이트
    @Override
    public Counselor createCounselor(CreateCounselorRequest request) {
        return counselorPersistor.createCounselor(request);
    }
    
    @Override
    public Counselor updateCounselor(UpdateCounselorRequest request) {
        return counselorPersistor.updateCounselor(request);
    }

    @Override
    public PresignedUrl generateCounselorImageUrl(GenerateCounselorImageUrlRequest request) {
        return counselorPresigner.generateCounselorImageUrl(request);
    }

    @Override
    public Episode findEpisodeById(FindEpisodeByIdRequest request) {
        return counselorReader.findEpisodeById(request);
    }

    @Override
    public List<Episode> findEpisodes(FindEpisodesRequest request) {
        return counselorReader.findEpisodes(request);
    }

    @Override
    public Episode createEpisode(CreateEpisodeRequest request) {
        return counselorPersistor.createEpisode(request);
    }

    @Override
    public Episode updateEpisode(UpdateEpisodeRequest request) {
        return counselorPersistor.updateEpisode(request);
    }

    @Override
    public PresignedUrl generateCutSceneImageUrl(GenerateCutSceneImageUrlRequest request) {
        return counselorPresigner.generateCutSceneImageUrl(request);
    }

    // Bubble 생성/업데이트
    @Override
    public Bubble createBubble(CreateBubbleRequest request) {
        return counselorPersistor.createBubble(request);
    }

    @Override
    public Bubble updateBubble(UpdateBubbleRequest request) {
        return counselorPersistor.updateBubble(request);
    }

    // Bubble 조회
    @Override
    public Bubble findBubbleById(FindBubbleByIdRequest request) {
        return counselorReader.findBubbleById(request);
    }

    @Override
    public List<Bubble> findBubbles(FindBubblesRequest request) {
        return counselorReader.findBubbles(request);
    }

    @Override
    public Bubble findRandomBubble(FindRandomBubbleRequest request) {
        return counselorReader.findRandomBubble(request);
    }

    // Tone 조회
    @Override
    public Tone findToneById(FindToneByIdRequest request) {
        return counselorReader.findToneById(request);
    }

    @Override
    public List<Tone> findTones(FindTonesRequest request) {
        return counselorReader.findTones(request);
    }
    
    // Tone 생성/업데이트
    @Override
    public Tone createTone(CreateToneRequest request) {
        return counselorPersistor.createTone(request);
    }
    
    @Override
    public Tone updateTone(UpdateToneRequest request) {
        return counselorPersistor.updateTone(request);
    }
}
