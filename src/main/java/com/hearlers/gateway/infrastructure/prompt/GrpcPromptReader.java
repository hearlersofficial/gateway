package com.hearlers.gateway.infrastructure.prompt;

import java.util.List;

import com.hearlers.api.proto.v1.model.*;
import com.hearlers.api.proto.v1.service.*;
import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc.CounselPromptServiceBlockingStub;
import com.hearlers.gateway.application.prompt.PromptReader;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class GrpcPromptReader implements PromptReader {
    private final CounselPromptServiceBlockingStub counselPromptServiceBlockingStub;
    
    @Override
    public TonePrompt findTonePromptById(FindTonePromptByIdRequest request) {
        return counselPromptServiceBlockingStub.findTonePromptById(request).getTonePrompt();
    }

    @Override
    public List<TonePrompt> findTonePrompts(FindTonePromptsRequest request) {
        return counselPromptServiceBlockingStub.findTonePrompts(request).getTonePromptsList();
    }


    @Override
    public PersonaPrompt findPersonaPromptById(FindPersonaPromptByIdRequest request) {
        return counselPromptServiceBlockingStub.findPersonaPromptById(request).getPersonaPrompt();
    }

    @Override
    public List<PersonaPrompt> findPersonaPrompts(FindPersonaPromptsRequest request) {
        return counselPromptServiceBlockingStub.findPersonaPrompts(request).getPersonaPromptsList();
    }

    @Override
    public CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request) {
        return counselPromptServiceBlockingStub.findCounselTechniqueById(request).getCounselTechnique();
    }

    @Override
    public List<CounselTechnique> findCounselTechniques(FindCounselTechniquesRequest request) {
        return counselPromptServiceBlockingStub.findCounselTechniques(request).getCounselTechniquesList();
    }


    @Override
    public PromptVersion findPromptVersionById(FindPromptVersionByIdRequest request) {
        return counselPromptServiceBlockingStub.findPromptVersionById(request).getPromptVersion();
    }
    
    @Override
    public List<PromptVersion> findPromptVersions(FindPromptVersionsRequest request) {
        return counselPromptServiceBlockingStub.findPromptVersions(request).getPromptVersionsList();
    }

    @Override
    public PromptVersion findActiveVersion(FindActiveVersionRequest request) {
        return counselPromptServiceBlockingStub.findActiveVersion(request).getPromptVersion();
    }
    
    @Override
    public PromptVersion findTemporaryVersion(FindTemporaryVersionRequest request) {
        return counselPromptServiceBlockingStub.findTemporaryVersion(request).getPromptVersion();
    }
    
    @Override
    public PromptVersion loadExistingPromptVersion(LoadExistingPromptVersionRequest request) {
        return counselPromptServiceBlockingStub.loadExistingPromptVersion(request).getPromptVersion();
    }
    
    @Override
    public List<PromptActivateHistory> findPromptActivateHistories(FindPromptActivateHistoriesRequest request) {
        return counselPromptServiceBlockingStub.findPromptActivateHistories(request).getPromptActivateHistoriesList();
    }

    @Override
    public CounselTechniqueTransitionRule findCounselTechniqueTransitionRuleById(FindCounselTechniqueTransitionRuleByIdRequest request) {
        return counselPromptServiceBlockingStub.findCounselTechniqueTransitionRuleById(request).getCounselTechniqueTransitionRule();
    }

    @Override
    public List<CounselTechniqueTransitionRule> findCounselTechniqueTransitionRules(FindCounselTechniqueTransitionRulesRequest request) {
        return counselPromptServiceBlockingStub.findCounselTechniqueTransitionRules(request).getCounselTechniqueTransitionRulesList();
    }
}
