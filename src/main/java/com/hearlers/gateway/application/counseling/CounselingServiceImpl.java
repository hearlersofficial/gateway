package com.hearlers.gateway.application.counseling;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.InstructionItem;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemsRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CounselingServiceImpl implements CounselingService {
    private final PromptsPersistor persistor;
    private final PromptsReader reader;

    

    @Override
    public Tone createTone(CreateToneRequest request) {
        return persistor.createTone(request);
    }

    @Override
    public Tone updateTone(UpdateToneRequest request) {
        return persistor.updateTone(request);
    }

    @Override
    public Tone findToneById(FindToneByIdRequest request) {
        return reader.findToneById(request);
    }

    @Override
    public List<Tone> findTones(FindTonesRequest request) {
        return reader.findTones(request);
    }

    @Override
    public Context createContext(CreateContextRequest request) {
        return persistor.createContext(request);
    }

    @Override
    public Context updateContext(UpdateContextRequest request) {
        return persistor.updateContext(request);
    }

    @Override
    public Context findContextById(FindContextByIdRequest request) {
        return reader.findContextById(request);
    }

    @Override
    public List<Context> findContexts(FindContextsRequest request) {
        return reader.findContexts(request);
    }

    @Override
    public InstructionItem createInstructionItem(CreateInstructionItemRequest request) {
        return persistor.createInstructionItem(request);
    }

    @Override
    public InstructionItem updateInstructionItem(UpdateInstructionItemRequest request) {
        return persistor.updateInstructionItem(request);
    }

    @Override
    public InstructionItem findInstructionItemById(FindInstructionItemByIdRequest request) {
        return reader.findInstructionItemById(request);
    }

    @Override
    public List<InstructionItem> findInstructionItems(FindInstructionItemsRequest request) {
        return reader.findInstructionItems(request);
    }
}
