package com.hearlers.gateway.application.prompt;

import java.util.List;

import com.hearlers.api.proto.v1.model.*;
import com.hearlers.api.proto.v1.service.*;

public interface PromptReader {
    TonePrompt findTonePromptById(FindTonePromptByIdRequest request);
    List<TonePrompt> findTonePrompts(FindTonePromptsRequest request);

    PersonaPrompt findPersonaPromptById(FindPersonaPromptByIdRequest request);
    List<PersonaPrompt> findPersonaPrompts(FindPersonaPromptsRequest request);

    CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request);
    List<CounselTechnique> findCounselTechniques(FindCounselTechniquesRequest request);

    PromptVersion findPromptVersionById(FindPromptVersionByIdRequest request);
    List<PromptVersion> findPromptVersions(FindPromptVersionsRequest request);
    PromptVersion findActiveVersion(FindActiveVersionRequest request);
    PromptVersion findTemporaryVersion(FindTemporaryVersionRequest request);
    PromptVersion loadExistingPromptVersion(LoadExistingPromptVersionRequest request);
    
    List<PromptActivateHistory> findPromptActivateHistories(FindPromptActivateHistoriesRequest request);

    CounselTechniqueTransitionRule findCounselTechniqueTransitionRuleById(FindCounselTechniqueTransitionRuleByIdRequest request);
    List<CounselTechniqueTransitionRule> findCounselTechniqueTransitionRules(FindCounselTechniqueTransitionRulesRequest request);
}
