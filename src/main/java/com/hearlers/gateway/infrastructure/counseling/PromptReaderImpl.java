package com.hearlers.gateway.infrastructure.counseling;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc.CounselPromptServiceBlockingStub;
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.gateway.application.counseling.PromptReader;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class PromptReaderImpl implements PromptReader {
    private final CounselPromptServiceBlockingStub counselPromptServiceBlockingStub;
    

    @Override
    public Tone findToneById(FindToneByIdRequest request) {
        return counselPromptServiceBlockingStub.findToneById(request).getTone();
    }
    
    @Override
    public List<Tone> findTones(FindTonesRequest request) {
        return counselPromptServiceBlockingStub.findTones(request).getTonesList();
    }
    
    @Override
    public CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request) {
        return counselPromptServiceBlockingStub.findCounselTechniqueById(request).getCounselTechnique();
    }

    @Override
    public List<CounselTechnique> findCounselTechniques(FindCounselTechniquesRequest request) {
        return counselPromptServiceBlockingStub.findCounselTechniques(request).getCounselTechniquesList();
    }
    
}
