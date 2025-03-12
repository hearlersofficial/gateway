package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.Instruction;
import com.hearlers.api.proto.v1.model.InstructionItem;
import com.hearlers.api.proto.v1.model.Persona;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionRequest;
import com.hearlers.api.proto.v1.service.CreatePersonaRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionsRequest;
import com.hearlers.api.proto.v1.service.FindPersonaByIdRequest;
import com.hearlers.api.proto.v1.service.FindPersonasRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionRequest;
import com.hearlers.api.proto.v1.service.UpdatePersonaRequest;
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

    // Instruction
    Instruction createInstruction(CreateInstructionRequest request);
    Instruction updateInstruction(UpdateInstructionRequest request);
    Instruction findInstructionById(FindInstructionByIdRequest request);
    List<Instruction> findInstructions(FindInstructionsRequest request);

    // Persona
    Persona createPersona(CreatePersonaRequest request);
    Persona updatePersona(UpdatePersonaRequest request);
    Persona findPersonaById(FindPersonaByIdRequest request);
    List<Persona> findPersonas(FindPersonasRequest request);
}
