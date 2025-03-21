package com.hearlers.gateway.application.counseling;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Instruction;
import com.hearlers.api.proto.v1.model.InstructionItem;
import com.hearlers.api.proto.v1.model.Persona;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.CreateInstructionRequest;
import com.hearlers.api.proto.v1.service.CreatePersonaRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest;
import com.hearlers.api.proto.v1.service.FindInstructionItemsRequest;
import com.hearlers.api.proto.v1.service.FindInstructionsRequest;
import com.hearlers.api.proto.v1.service.FindPersonaByIdRequest;
import com.hearlers.api.proto.v1.service.FindPersonasRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest;
import com.hearlers.api.proto.v1.service.UpdateInstructionRequest;
import com.hearlers.api.proto.v1.service.UpdatePersonaRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CounselingServiceImpl implements CounselingService {
    private final PromptPersistor persistor;
    private final PromptReader reader;
    private final CounselorReader counselorReader;

    @Override
    public List<Counselor> findCounselors(FindCounselorsRequest request) {
        return counselorReader.findCounselors(request);
    }
    

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

    @Override
    public Instruction createInstruction(CreateInstructionRequest request) {
        return persistor.createInstruction(request);
    }

    @Override
    public Instruction updateInstruction(UpdateInstructionRequest request) {
        return persistor.updateInstruction(request);
    }

    @Override
    public Instruction findInstructionById(FindInstructionByIdRequest request) {
        return reader.findInstructionById(request);
    }

    @Override
    public List<Instruction> findInstructions(FindInstructionsRequest request) {
        return reader.findInstructions(request);
    }

    @Override
    public Persona createPersona(CreatePersonaRequest request) {
        return persistor.createPersona(request);
    }

    @Override
    public Persona updatePersona(UpdatePersonaRequest request) {
        return persistor.updatePersona(request);
    }

    @Override
    public Persona findPersonaById(FindPersonaByIdRequest request) {
        return reader.findPersonaById(request);
    }

    @Override
    public List<Persona> findPersonas(FindPersonasRequest request) {
        return reader.findPersonas(request);
    }

    @Override
    public CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request) {
        return persistor.createCounselTechnique(request);
    }

    @Override
    public CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request) {
        return persistor.updateCounselTechnique(request);
    }

    @Override
    public List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request) {
        return persistor.saveCounselTechniqueSequence(request);
    }

    @Override
    public CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request) {
        return reader.findCounselTechniqueById(request);
    }

    @Override
    public List<CounselTechnique> findCounselTechniques(FindCounselTechniquesRequest request) {
        return reader.findCounselTechniques(request);
    }


    
    
}
