package com.hearlers.gateway.infrastructure.counseling;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Instruction;
import com.hearlers.api.proto.v1.model.InstructionItem;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CounselPromptServiceGrpc.CounselPromptServiceBlockingStub;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest;
import com.hearlers.api.proto.v1.service.FindInstructionByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionsRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.gateway.application.counseling.PromptReader;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class PromptReaderImpl implements PromptReader {
    private final CounselPromptServiceBlockingStub counselPromptServiceBlockingStub;
    
    @Override
    public Context findContextById(FindContextByIdRequest request) {
        return counselPromptServiceBlockingStub.findContextById(request).getContext();
    }

    @Override
    public List<Context> findContexts(FindContextsRequest request) {
        return counselPromptServiceBlockingStub.findContexts(request).getContextsList();
    }

    @Override
    public Tone findToneById(FindToneByIdRequest request) {
        return counselPromptServiceBlockingStub.findToneById(request).getTone();
    }
    
    @Override
    public List<Tone> findTones(FindTonesRequest request) {
        return counselPromptServiceBlockingStub.findTones(request).getTonesList();
    }
    
    @Override
    public InstructionItem findInstructionItemById(FindInstructionItemByIdRequest request) {
        return counselPromptServiceBlockingStub.findInstructionItemById(request).getInstructionItem();
    }

    @Override
    public List<InstructionItem> findInstructionItems(FindInstructionItemsRequest request) {
        return counselPromptServiceBlockingStub.findInstructionItems(request).getInstructionItemsList();
    }

    @Override
    public Instruction findInstructionById(FindInstructionByIdRequest request) {
        return counselPromptServiceBlockingStub.findInstructionById(request).getInstruction();
    }

    @Override
    public List<Instruction> findInstructions(FindInstructionsRequest request) {
        return counselPromptServiceBlockingStub.findInstructions(request).getInstructionsList();
    }


    @Override
    public CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request) {
        return counselPromptServiceBlockingStub.findCounselTechniqueById(request).getCounselTechnique();
    }

    @Override
    public List<CounselTechnique> findCounselTechniques(FindCounselTechniquesRequest request) {
        return counselPromptServiceBlockingStub.findCounselTechniques(request).getCounselTechniquesList();
    }
    
}
