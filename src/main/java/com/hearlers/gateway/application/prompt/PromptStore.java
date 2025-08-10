package com.hearlers.gateway.application.prompt;

import java.util.List;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;
import com.hearlers.api.proto.v1.service.*;

public interface PromptStore {
    TonePrompt updateTonePrompt(UpdateTonePromptRequest request);
    PersonaPrompt updatePersonaPrompt(UpdatePersonaPromptRequest request);
    CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request);
    List<CounselTechnique> updateCounselTechnique(UpdateCounselTechniqueRequest request);
    List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request);
    PromptVersion saveTemporaryVersion(SaveTemporaryVersionRequest request);
    PromptVersion activatePromptVersion(ActivatePromptVersionRequest request);
    PromptVersion updatePromptVersion(UpdatePromptVersionRequest request);
    Boolean deletePromptVersion(DeletePromptVersionsRequest request);
}
