package com.hearlers.gateway.infrastructure.counseling;    

import java.util.List;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.Instruction;
import com.hearlers.api.proto.v1.model.InstructionItem;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CounselServiceGrpc.CounselServiceBlockingStub;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionsRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.gateway.application.counseling.PromptsReader;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class PromptsReaderImpl implements PromptsReader {
    private final CounselServiceBlockingStub counselServiceBlockingStub;
    
    @Override
    public Context findContextById(FindContextByIdRequest request) {
        return counselServiceBlockingStub.findContextById(request).getContext();
    }

    @Override
    public List<Context> findContexts(FindContextsRequest request) {
        return counselServiceBlockingStub.findContexts(request).getContextsList();
    }

    @Override
    public Tone findToneById(FindToneByIdRequest request) {
        return counselServiceBlockingStub.findToneById(request).getTone();
    }
    
    @Override
    public List<Tone> findTones(FindTonesRequest request) {
        return counselServiceBlockingStub.findTones(request).getTonesList();
    }
    
    @Override
    public InstructionItem findInstructionItemById(FindInstructionItemByIdRequest request) {
        return counselServiceBlockingStub.findInstructionItemById(request).getInstructionItem();
    }

    @Override
    public List<InstructionItem> findInstructionItems(FindInstructionItemsRequest request) {
        return counselServiceBlockingStub.findInstructionItems(request).getInstructionItemsList();
    }

    @Override
    public Instruction findInstructionById(FindInstructionByIdRequest request) {
        return counselServiceBlockingStub.findInstructionById(request).getInstruction();
    }

    @Override
    public List<Instruction> findInstructions(FindInstructionsRequest request) {
        return counselServiceBlockingStub.findInstructions(request).getInstructionsList();
    }
    
}
