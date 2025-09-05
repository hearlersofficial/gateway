package com.hearlers.gateway.application.prompt;

import java.util.List;

import com.hearlers.api.proto.v1.model.*;
import com.hearlers.api.proto.v1.service.*;
import org.springframework.stereotype.Service;

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

    @Override
    public List<TonePrompt> findTonePrompts(FindTonePromptsRequest request) {
        return promptReader.findTonePrompts(request);
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

    @Override
    public List<PersonaPrompt> findPersonaPrompts(FindPersonaPromptsRequest request) {
        return promptReader.findPersonaPrompts(request);
    }

    // CounselTechnique 관련 메서드
    @Override
    public CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request) {
        return promptStore.createCounselTechnique(request);
    }

    @Override
    public CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request) {
        return promptStore.updateCounselTechnique(request);
    }

    @Override
    public CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request) {
        return promptReader.findCounselTechniqueById(request);
    }

    @Override
    public List<CounselTechnique> findCounselTechniques(FindCounselTechniquesRequest request) {
        return promptReader.findCounselTechniques(request);
    }

    // CounselTechniqueTransitionRule 관련 메서드
    @Override
    public CounselTechniqueTransitionRule createCounselTechniqueTransitionRule(CreateCounselTechniqueTransitionRuleRequest request) {
        return promptStore.createCounselTechniqueTransitionRule(request);
    }

    @Override
    public CounselTechniqueTransitionRule updateCounselTechniqueTransitionRule(UpdateCounselTechniqueTransitionRuleRequest request) {
        return promptStore.updateCounselTechniqueTransitionRule(request);
    }

    @Override
    public Boolean deleteCounselTechniqueTransitionRule(DeleteCounselTechniqueTransitionRuleRequest request) {
        return promptStore.deleteCounselTechniqueTransitionRule(request);
    }

    @Override
    public CounselTechniqueTransitionRule findCounselTechniqueTransitionRuleById(FindCounselTechniqueTransitionRuleByIdRequest request) {
        return promptReader.findCounselTechniqueTransitionRuleById(request);
    }

    @Override
    public List<CounselTechniqueTransitionRule> findCounselTechniqueTransitionRules(FindCounselTechniqueTransitionRulesRequest request) {
        return promptReader.findCounselTechniqueTransitionRules(request);
    }
}
