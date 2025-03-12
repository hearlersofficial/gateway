package com.hearlers.gateway.infrastructure.counseling;    

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.Instruction;
import com.hearlers.api.proto.v1.model.InstructionItem;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CounselServiceGrpc.CounselServiceBlockingStub;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;
import com.hearlers.gateway.application.counseling.PromptsPersistor;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PromptsPersistorImpl implements PromptsPersistor {
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
    
}
