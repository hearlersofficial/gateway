package com.hearlers.gateway.application.prompt;

import java.util.List;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptActivateHistory;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;
import com.hearlers.api.proto.v1.service.*;

public interface PromptReader {
    TonePrompt findTonePromptById(FindTonePromptByIdRequest request);
    PersonaPrompt findPersonaPromptById(FindPersonaPromptByIdRequest request);
    
    CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request);
    List<CounselTechnique> findOrderedCounselTechniques(FindOrderedCounselTechniquesRequest request);
    
    PromptVersion findPromptVersionById(FindPromptVersionByIdRequest request);
    List<PromptVersion> findPromptVersions(FindPromptVersionsRequest request);
    PromptVersion findActiveVersion(FindActiveVersionRequest request);
    PromptVersion findTemporaryVersion(FindTemporaryVersionRequest request);
    PromptVersion loadExistingPromptVersion(LoadExistingPromptVersionRequest request);
    
    List<PromptActivateHistory> findPromptActivateHistories(FindPromptActivateHistoriesRequest request);
}
