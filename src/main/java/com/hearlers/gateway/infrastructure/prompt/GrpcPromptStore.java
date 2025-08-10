package com.hearlers.gateway.infrastructure.prompt;

import java.util.List;

import com.hearlers.api.proto.v1.service.*;
import lombok.val;
import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.PersonaPrompt;
import com.hearlers.api.proto.v1.model.PromptVersion;
import com.hearlers.api.proto.v1.model.TonePrompt;
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc.CounselPromptServiceBlockingStub;
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
    public List<CounselTechnique> updateCounselTechnique(UpdateCounselTechniqueRequest request) {
        return counselPromptServiceBlockingStub.updateCounselTechnique(request).getCounselTechniquesList();
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

    @Override
    public PromptVersion updatePromptVersion(UpdatePromptVersionRequest request) {
        return counselPromptServiceBlockingStub.updatePromptVersion(request).getPromptVersion();
    }

    @Override
    public Boolean deletePromptVersion(DeletePromptVersionsRequest request) {
        var result = counselPromptServiceBlockingStub.deletePromptVersions(request);
        return result != null;
    }
}
