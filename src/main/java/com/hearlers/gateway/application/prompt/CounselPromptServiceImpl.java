package com.hearlers.gateway.application.prompt;

import java.util.List;

import com.hearlers.api.proto.v1.service.*;
import org.springframework.stereotype.Service;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptActivateHistory;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CounselPromptServiceImpl implements CounselPromptService {
    private final PromptStore promptStore;
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
    public PromptVersion findActiveVersion(FindActiveVersionRequest request) {
        return promptReader.findActiveVersion(request);
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
        return promptStore.saveTemporaryVersion(request);
    }

    @Override
    public PromptVersion activatePromptVersion(ActivatePromptVersionRequest request) {
        return promptStore.activatePromptVersion(request);
    }

    @Override
    public PromptVersion updatePromptVersion(UpdatePromptVersionRequest request) {
        return promptStore.updatePromptVersion(request);
    }

    @Override
    public Boolean deletePromptVersion(DeletePromptVersionsRequest request) {
        return promptStore.deletePromptVersion(request);
    }


    // PromptActivateHistory 관련 메서드
    @Override
    public List<PromptActivateHistory> findPromptActivateHistories(FindPromptActivateHistoriesRequest request) {
        return promptReader.findPromptActivateHistories(request);
    }

    // TonePrompt 관련 메서드
    @Override
    public TonePrompt updateTonePrompt(UpdateTonePromptRequest request) {
        return promptStore.updateTonePrompt(request);
    }

    @Override
    public TonePrompt findTonePromptById(FindTonePromptByIdRequest request) {
        return promptReader.findTonePromptById(request);
    }

    // PersonaPrompt 관련 메서드
    @Override
    public PersonaPrompt updatePersonaPrompt(UpdatePersonaPromptRequest request) {
        return promptStore.updatePersonaPrompt(request);
    }

    @Override
    public PersonaPrompt findPersonaPromptById(FindPersonaPromptByIdRequest request) {
        return promptReader.findPersonaPromptById(request);
    }

    // CounselTechnique 관련 메서드
    @Override
    public CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request) {
        return promptStore.createCounselTechnique(request);
    }

    @Override
    public List<CounselTechnique> updateCounselTechnique(UpdateCounselTechniqueRequest request) {
        return promptStore.updateCounselTechnique(request);
    }

    @Override
    public List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request) {
        return promptStore.saveCounselTechniqueSequence(request);
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
