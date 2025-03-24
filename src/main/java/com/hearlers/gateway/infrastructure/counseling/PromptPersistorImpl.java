package com.hearlers.gateway.infrastructure.counseling;    

import java.util.List;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Instruction;
import com.hearlers.api.proto.v1.model.InstructionItem;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc.CounselPromptServiceBlockingStub;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;
import com.hearlers.gateway.application.counseling.PromptPersistor;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PromptPersistorImpl implements PromptPersistor {
    private final CounselPromptServiceBlockingStub counselPromptServiceBlockingStub;
    
    @Override
    public Context createContext(CreateContextRequest request) {
        return counselPromptServiceBlockingStub.createContext(request).getContext();
    }

    @Override
    public Context updateContext(UpdateContextRequest request) {
        return counselPromptServiceBlockingStub.updateContext(request).getContext();
    }

    @Override
    public Tone createTone(CreateToneRequest request) {
        return counselPromptServiceBlockingStub.createTone(request).getTone();
    }

    @Override
    public Tone updateTone(UpdateToneRequest request) {
        return counselPromptServiceBlockingStub.updateTone(request).getTone();
    }

    @Override
    public InstructionItem createInstructionItem(CreateInstructionItemRequest request) {
        return counselPromptServiceBlockingStub.createInstructionItem(request).getInstructionItem();
    }

    @Override
    public InstructionItem updateInstructionItem(UpdateInstructionItemRequest request) {
        return counselPromptServiceBlockingStub.updateInstructionItem(request).getInstructionItem();
    }

    @Override
    public Instruction createInstruction(CreateInstructionRequest request) {
        return counselPromptServiceBlockingStub.createInstruction(request).getInstruction();
    }

    @Override
    public Instruction updateInstruction(UpdateInstructionRequest request) {
        return counselPromptServiceBlockingStub.updateInstruction(request).getInstruction();
    }


    @Override
    public CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request) {
        return counselPromptServiceBlockingStub.createCounselTechnique(request).getCounselTechnique();
    }

    @Override
    public CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request) {
        return counselPromptServiceBlockingStub.updateCounselTechnique(request).getCounselTechnique();
    }

    @Override
    public List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request) {
        return counselPromptServiceBlockingStub.saveCounselTechniqueSequence(request).getCounselTechniquesList();
    }
    

    
    
}
