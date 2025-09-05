package com.hearlers.gateway.application.prompt;

import java.util.List;

import com.hearlers.api.proto.v1.model.*;
import com.hearlers.api.proto.v1.service.*;

public interface PromptStore {
    TonePrompt updateTonePrompt(UpdateTonePromptRequest request);

    PersonaPrompt updatePersonaPrompt(UpdatePersonaPromptRequest request);

    CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request);
    CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request);

    PromptVersion saveTemporaryVersion(SaveTemporaryVersionRequest request);
    PromptVersion activatePromptVersion(ActivatePromptVersionRequest request);
    PromptVersion updatePromptVersion(UpdatePromptVersionRequest request);
    Boolean deletePromptVersion(DeletePromptVersionsRequest request);

    CounselTechniqueTransitionRule createCounselTechniqueTransitionRule(CreateCounselTechniqueTransitionRuleRequest request);
    CounselTechniqueTransitionRule updateCounselTechniqueTransitionRule(UpdateCounselTechniqueTransitionRuleRequest request);
    Boolean deleteCounselTechniqueTransitionRule(DeleteCounselTechniqueTransitionRuleRequest request);
}
