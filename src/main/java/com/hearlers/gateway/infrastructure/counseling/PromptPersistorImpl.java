package com.hearlers.gateway.infrastructure.counseling;    

import java.util.List;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Instruction;
import com.hearlers.api.proto.v1.model.InstructionItem;
import com.hearlers.api.proto.v1.model.Persona;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CounselServiceGrpc.CounselServiceBlockingStub;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionRequest;
import com.hearlers.api.proto.v1.service.CreatePersonaRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionRequest;
import com.hearlers.api.proto.v1.service.UpdatePersonaRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;
import com.hearlers.gateway.application.counseling.PromptPersistor;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PromptPersistorImpl implements PromptPersistor {
    private final CounselServiceBlockingStub counselServiceBlockingStub;
    
    @Override
    public Context createContext(CreateContextRequest request) {
        return counselServiceBlockingStub.createContext(request).getContext();
    }

    @Override
    public Context updateContext(UpdateContextRequest request) {
        return counselServiceBlockingStub.updateContext(request).getContext();
    }

    @Override
    public Tone createTone(CreateToneRequest request) {
        return counselServiceBlockingStub.createTone(request).getTone();
    }

    @Override
    public Tone updateTone(UpdateToneRequest request) {
        return counselServiceBlockingStub.updateTone(request).getTone();
    }

    @Override
    public InstructionItem createInstructionItem(CreateInstructionItemRequest request) {
        return counselServiceBlockingStub.createInstructionItem(request).getInstructionItem();
    }

    @Override
    public InstructionItem updateInstructionItem(UpdateInstructionItemRequest request) {
        return counselServiceBlockingStub.updateInstructionItem(request).getInstructionItem();
    }

    @Override
    public Instruction createInstruction(CreateInstructionRequest request) {
        return counselServiceBlockingStub.createInstruction(request).getInstruction();
    }

    @Override
    public Instruction updateInstruction(UpdateInstructionRequest request) {
        return counselServiceBlockingStub.updateInstruction(request).getInstruction();
    }

    @Override
    public Persona createPersona(CreatePersonaRequest request) {
        return counselServiceBlockingStub.createPersona(request).getPersona();
    }

    @Override
    public Persona updatePersona(UpdatePersonaRequest request) {
        return counselServiceBlockingStub.updatePersona(request).getPersona();
    }

    @Override
    public CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request) {
        return counselServiceBlockingStub.createCounselTechnique(request).getCounselTechnique();
    }

    @Override
    public CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request) {
        return counselServiceBlockingStub.updateCounselTechnique(request).getCounselTechnique();
    }

    @Override
    public List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request) {
        return counselServiceBlockingStub.saveCounselTechniqueSequence(request).getCounselTechniquesList();
    }
    

    
    
}
