package com.hearlers.gateway.application.counseling;

import java.util.List;

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

public interface CounselingService {
    // Context
    Context createContext(CreateContextRequest request);
    Context updateContext(UpdateContextRequest request);
    Context findContextById(FindContextByIdRequest request);
    List<Context> findContexts(FindContextsRequest request);

    // Tone
    Tone createTone(CreateToneRequest request);
    Tone updateTone(UpdateToneRequest request);
    Tone findToneById(FindToneByIdRequest request);
    List<Tone> findTones(FindTonesRequest request);

    // InstructionItem
    InstructionItem createInstructionItem(CreateInstructionItemRequest request);
    InstructionItem updateInstructionItem(UpdateInstructionItemRequest request);
    InstructionItem findInstructionItemById(FindInstructionItemByIdRequest request);
    List<InstructionItem> findInstructionItems(FindInstructionItemsRequest request);
}
