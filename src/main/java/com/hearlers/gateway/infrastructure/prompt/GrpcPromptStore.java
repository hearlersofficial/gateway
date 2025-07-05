package com.hearlers.gateway.infrastructure.prompt;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;
import com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest;
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc.CounselPromptServiceBlockingStub;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest;
import com.hearlers.api.proto.v1.service.UpdateTonePromptRequest;
import com.hearlers.gateway.application.prompt.PromptStore;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class GrpcPromptStore implements PromptStore {
    private final CounselPromptServiceBlockingStub counselPromptServiceBlockingStub;
    
    @Override
    public TonePrompt updateTonePrompt(UpdateTonePromptRequest request) {
        return counselPromptServiceBlockingStub.updateTonePrompt(request).getTonePrompt();
    }

    @Override
    public PersonaPrompt updatePersonaPrompt(UpdatePersonaPromptRequest request) {
        return counselPromptServiceBlockingStub.updatePersonaPrompt(request).getPersonaPrompt();
    }

    @Override
    public CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request) {
        return counselPromptServiceBlockingStub.createCounselTechnique(request).getCounselTechnique();
    }

    @Override
    public CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request) {
        return counselPromptServiceBlockingStub.updateCounselTechnique(request).getCounselTechniques(0);
    }

    @Override
    public List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request) {
        return counselPromptServiceBlockingStub.saveCounselTechniqueSequence(request).getCounselTechniquesList();
    }
    
    @Override
    public PromptVersion saveTemporaryVersion(SaveTemporaryVersionRequest request) {
        return counselPromptServiceBlockingStub.saveTemporaryVersion(request).getPromptVersion();
    }
    
    @Override
    public PromptVersion activatePromptVersion(ActivatePromptVersionRequest request) {
        return counselPromptServiceBlockingStub.activatePromptVersion(request).getPromptVersion();
    }
}
