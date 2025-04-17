package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptActivateHistory;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest;
import com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest;
import com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest;
import com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest;
import com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest;
import com.hearlers.api.proto.v1.service.FindPromptVersionsRequest;
import com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest;
import com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest;
import com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest;

public interface PromptReader {
    TonePrompt findTonePromptById(FindTonePromptByIdRequest request);
    PersonaPrompt findPersonaPromptById(FindPersonaPromptByIdRequest request);
    
    CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request);
    List<CounselTechnique> findOrderedCounselTechniques(FindOrderedCounselTechniquesRequest request);
    
    PromptVersion findPromptVersionById(FindPromptVersionByIdRequest request);
    List<PromptVersion> findPromptVersions(FindPromptVersionsRequest request);
    PromptVersion findTemporaryVersion(FindTemporaryVersionRequest request);
    PromptVersion loadExistingPromptVersion(LoadExistingPromptVersionRequest request);
    
    List<PromptActivateHistory> findPromptActivateHistories(FindPromptActivateHistoriesRequest request);
}
