package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Instruction;
import com.hearlers.api.proto.v1.model.InstructionItem;
import com.hearlers.api.proto.v1.model.Persona;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest;
import com.hearlers.api.proto.v1.service.FindInstructionByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionsRequest;
import com.hearlers.api.proto.v1.service.FindPersonaByIdRequest;
import com.hearlers.api.proto.v1.service.FindPersonasRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;

public interface PromptReader {
    Context findContextById(FindContextByIdRequest request);
    List<Context> findContexts(FindContextsRequest request);
    Tone findToneById(FindToneByIdRequest request);
    List<Tone> findTones(FindTonesRequest request);
    InstructionItem findInstructionItemById(FindInstructionItemByIdRequest request);
    List<InstructionItem> findInstructionItems(FindInstructionItemsRequest request);
    Instruction findInstructionById(FindInstructionByIdRequest request);
    List<Instruction> findInstructions(FindInstructionsRequest request);
    Persona findPersonaById(FindPersonaByIdRequest request);
    List<Persona> findPersonas(FindPersonasRequest request);
    CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request);
    List<CounselTechnique> findCounselTechniques(FindCounselTechniquesRequest request);
}
