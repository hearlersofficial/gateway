package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.service.CreateCounselorRequest;
import com.hearlers.api.proto.v1.service.FindCounselorByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselorRequest;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;

@Service
@RequiredArgsConstructor
public class CounselorServiceImpl implements CounselorService {
    private final CounselorReader counselorReader;
    private final CounselorPersistor counselorPersistor;

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
