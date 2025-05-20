package com.hearlers.gateway.infrastructure.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.Episode;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.*;
import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc.CounselorServiceBlockingStub;
import com.hearlers.gateway.application.counseling.CounselorReader;

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
    public Tone findToneById(FindToneByIdRequest request) {
        return counselorServiceBlockingStub.findToneById(request).getTone();
    }

    @Override
    public List<Tone> findTones(FindTonesRequest request) {
        return counselorServiceBlockingStub.findTones(request).getTonesList();
    }
    
}
