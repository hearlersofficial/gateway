package com.hearlers.gateway.application.prompt;

import java.util.List;

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

public interface CounselPromptService {

    // PromptVersion
    PromptVersion findPromptVersionById(FindPromptVersionByIdRequest request);
    List<PromptVersion> findPromptVersions(FindPromptVersionsRequest request);
    PromptVersion findTemporaryVersion(FindTemporaryVersionRequest request);
    PromptVersion loadExistingPromptVersion(LoadExistingPromptVersionRequest request);
    PromptVersion saveTemporaryVersion(SaveTemporaryVersionRequest request);
    PromptVersion activatePromptVersion(ActivatePromptVersionRequest request);
    
    // PromptActivateHistory
    List<PromptActivateHistory> findPromptActivateHistories(FindPromptActivateHistoriesRequest request);

    // TonePrompt
    TonePrompt updateTonePrompt(UpdateTonePromptRequest request);
    TonePrompt findTonePromptById(FindTonePromptByIdRequest request);

    // PersonaPrompt
    PersonaPrompt updatePersonaPrompt(UpdatePersonaPromptRequest request);
    PersonaPrompt findPersonaPromptById(FindPersonaPromptByIdRequest request);

    // CounselTechnique
    CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request);
    CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request);
    CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request);
    List<CounselTechnique> findOrderedCounselTechniques(FindOrderedCounselTechniquesRequest request);
    List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request);
}
