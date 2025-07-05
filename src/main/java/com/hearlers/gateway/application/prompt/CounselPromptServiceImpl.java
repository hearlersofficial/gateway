package com.hearlers.gateway.application.prompt;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptActivateHistory;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;
import com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest;
import com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest;
import com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest;
import com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest;
import com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest;
import com.hearlers.api.proto.v1.service.FindPromptVersionsRequest;
import com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest;
import com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest;
import com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest;
import com.hearlers.api.proto.v1.service.UpdateTonePromptRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CounselPromptServiceImpl implements CounselPromptService {
    private final PromptPersistor promptPersistor;
    private final PromptReader promptReader;


    // PromptVersion 관련 메서드
    @Override
    public PromptVersion findPromptVersionById(FindPromptVersionByIdRequest request) {
        return promptReader.findPromptVersionById(request);
    }

    @Override
    public List<PromptVersion> findPromptVersions(FindPromptVersionsRequest request) {
        return promptReader.findPromptVersions(request);
    }

    @Override
    public PromptVersion findTemporaryVersion(FindTemporaryVersionRequest request) {
        return promptReader.findTemporaryVersion(request);
    }

    @Override
    public PromptVersion loadExistingPromptVersion(LoadExistingPromptVersionRequest request) {
        return promptReader.loadExistingPromptVersion(request);
    }

    @Override
    public PromptVersion saveTemporaryVersion(SaveTemporaryVersionRequest request) {
        return promptPersistor.saveTemporaryVersion(request);
    }

    @Override
    public PromptVersion activatePromptVersion(ActivatePromptVersionRequest request) {
        return promptPersistor.activatePromptVersion(request);
    }
    
    // PromptActivateHistory 관련 메서드
    @Override
    public List<PromptActivateHistory> findPromptActivateHistories(FindPromptActivateHistoriesRequest request) {
        return promptReader.findPromptActivateHistories(request);
    }

    // TonePrompt 관련 메서드
    @Override
    public TonePrompt updateTonePrompt(UpdateTonePromptRequest request) {
        return promptPersistor.updateTonePrompt(request);
    }

    @Override
    public TonePrompt findTonePromptById(FindTonePromptByIdRequest request) {
        return promptReader.findTonePromptById(request);
    }

    // PersonaPrompt 관련 메서드
    @Override
    public PersonaPrompt updatePersonaPrompt(UpdatePersonaPromptRequest request) {
        return promptPersistor.updatePersonaPrompt(request);
    }

    @Override
    public PersonaPrompt findPersonaPromptById(FindPersonaPromptByIdRequest request) {
        return promptReader.findPersonaPromptById(request);
    }

    // CounselTechnique 관련 메서드
    @Override
    public CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request) {
        return promptPersistor.createCounselTechnique(request);
    }

    @Override
    public CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request) {
        return promptPersistor.updateCounselTechnique(request);
    }

    @Override
    public List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request) {
        return promptPersistor.saveCounselTechniqueSequence(request);
    }

    @Override
    public CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request) {
        return promptReader.findCounselTechniqueById(request);
    }

    @Override
    public List<CounselTechnique> findOrderedCounselTechniques(FindOrderedCounselTechniquesRequest request) {
        return promptReader.findOrderedCounselTechniques(request);
    }
}
