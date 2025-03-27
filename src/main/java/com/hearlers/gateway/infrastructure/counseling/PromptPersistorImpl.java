package com.hearlers.gateway.infrastructure.counseling;    

import java.util.List;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc.CounselPromptServiceBlockingStub;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;
import com.hearlers.gateway.application.counseling.PromptPersistor;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PromptPersistorImpl implements PromptPersistor {
    private final CounselPromptServiceBlockingStub counselPromptServiceBlockingStub;
    

    @Override
    public Tone createTone(CreateToneRequest request) {
        return counselPromptServiceBlockingStub.createTone(request).getTone();
    }

    @Override
    public Tone updateTone(UpdateToneRequest request) {
        return counselPromptServiceBlockingStub.updateTone(request).getTone();
    }

    @Override
    public CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request) {
        return counselPromptServiceBlockingStub.createCounselTechnique(request).getCounselTechnique();
    }

    @Override
    public CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request) {
        return counselPromptServiceBlockingStub.updateCounselTechnique(request).getCounselTechnique();
    }

    @Override
    public List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request) {
        return counselPromptServiceBlockingStub.saveCounselTechniqueSequence(request).getCounselTechniquesList();
    }
    

    
    
}
