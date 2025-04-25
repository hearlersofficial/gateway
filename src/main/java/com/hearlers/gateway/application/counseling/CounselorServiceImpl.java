package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.service.FindCounselorByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;

@Service
@RequiredArgsConstructor
public class CounselorServiceImpl implements CounselorService {
    private final CounselorReader counselorReader;


    @Override
    public Counselor findCounselorById(FindCounselorByIdRequest request) {
        return counselorReader.findCounselorById(request);
    }

    @Override
    public List<Counselor> findCounselors(FindCounselorsRequest request) {
        return counselorReader.findCounselors(request);
    }

    @Override
    public Tone findToneById(FindToneByIdRequest request) {
        return counselorReader.findToneById(request);
    }

    @Override
    public List<Tone> findTones(FindTonesRequest request) {
        return counselorReader.findTones(request);
    }
    
}
