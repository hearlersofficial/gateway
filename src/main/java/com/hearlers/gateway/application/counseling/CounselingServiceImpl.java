package com.hearlers.gateway.application.counseling;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CounselingServiceImpl implements CounselingService {
    private final PromptPersistor persistor;
    private final PromptReader reader;
    private final CounselorReader counselorReader;

    @Override
    public List<Counselor> findCounselors(FindCounselorsRequest request) {
        return counselorReader.findCounselors(request);
    }
    

    @Override
    public Tone createTone(CreateToneRequest request) {
        return persistor.createTone(request);
    }

    @Override
    public Tone updateTone(UpdateToneRequest request) {
        return persistor.updateTone(request);
    }

    @Override
    public Tone findToneById(FindToneByIdRequest request) {
        return reader.findToneById(request);
    }

    @Override
    public List<Tone> findTones(FindTonesRequest request) {
        return reader.findTones(request);
    }

    @Override
    public CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request) {
        return persistor.createCounselTechnique(request);
    }

    @Override
    public CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request) {
        return persistor.updateCounselTechnique(request);
    }

    @Override
    public List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request) {
        return persistor.saveCounselTechniqueSequence(request);
    }

    @Override
    public CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request) {
        return reader.findCounselTechniqueById(request);
    }

    @Override
    public List<CounselTechnique> findCounselTechniques(FindCounselTechniquesRequest request) {
        return reader.findCounselTechniques(request);
    }


    
    
}
