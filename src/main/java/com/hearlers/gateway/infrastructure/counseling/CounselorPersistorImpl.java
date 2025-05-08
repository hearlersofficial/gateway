package com.hearlers.gateway.infrastructure.counseling;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc.CounselorServiceBlockingStub;
import com.hearlers.api.proto.v1.service.CreateCounselorRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselorRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;
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
    public Tone createTone(CreateToneRequest request) {
        return counselorServiceBlockingStub.createTone(request).getTone();
    }
    
    @Override
    public Tone updateTone(UpdateToneRequest request) {
        return counselorServiceBlockingStub.updateTone(request).getTone();
    }
} 