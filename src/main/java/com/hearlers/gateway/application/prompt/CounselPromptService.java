package com.hearlers.gateway.application.prompt;

import java.util.List;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptActivateHistory;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;
import com.hearlers.api.proto.v1.service.*;

public interface CounselPromptService {

    // PromptVersion
    PromptVersion findPromptVersionById(FindPromptVersionByIdRequest request);
    List<PromptVersion> findPromptVersions(FindPromptVersionsRequest request);
    PromptVersion findActiveVersion(FindActiveVersionRequest request);
    PromptVersion findTemporaryVersion(FindTemporaryVersionRequest request);
    PromptVersion loadExistingPromptVersion(LoadExistingPromptVersionRequest request);
    PromptVersion saveTemporaryVersion(SaveTemporaryVersionRequest request);
    PromptVersion activatePromptVersion(ActivatePromptVersionRequest request);
    PromptVersion updatePromptVersion(UpdatePromptVersionRequest request);
    Boolean deletePromptVersion(DeletePromptVersionsRequest request);


    // PromptActivateHistory
    List<PromptActivateHistory> findPromptActivateHistories(FindPromptActivateHistoriesRequest request);

    // TonePrompt
    TonePrompt updateTonePrompt(UpdateTonePromptRequest request);
    TonePrompt findTonePromptById(FindTonePromptByIdRequest request);
    List<TonePrompt> findTonePrompts(FindTonePromptsRequest request);

    // PersonaPrompt
    PersonaPrompt updatePersonaPrompt(UpdatePersonaPromptRequest request);
    PersonaPrompt findPersonaPromptById(FindPersonaPromptByIdRequest request);
    List<PersonaPrompt> findPersonaPrompts(FindPersonaPromptsRequest request);

    // CounselTechnique
    CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request);
    CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request);
    CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request);
    List<CounselTechnique> findCounselTechniques(FindCounselTechniquesRequest request);
}
