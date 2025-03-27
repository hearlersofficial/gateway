package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest;
import com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;
import com.hearlers.api.proto.v1.service.FindToneByIdRequest;
import com.hearlers.api.proto.v1.service.FindTonesRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;

public interface CounselingService {

    // Counselorw
    List<Counselor> findCounselors(FindCounselorsRequest request);



    // Tone
    Tone createTone(CreateToneRequest request);
    Tone updateTone(UpdateToneRequest request);
    Tone findToneById(FindToneByIdRequest request);
    List<Tone> findTones(FindTonesRequest request);



    // // Persona
    // Persona createPersona(CreatePersonaRequest request);
    // Persona updatePersona(UpdatePersonaRequest request);
    // Persona findPersonaById(FindPersonaByIdRequest request);
    // List<Persona> findPersonas(FindPersonasRequest request);

    // CounselTechnique
    CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request);
    CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request);
    CounselTechnique findCounselTechniqueById(FindCounselTechniqueByIdRequest request);
    List<CounselTechnique> findCounselTechniques(FindCounselTechniquesRequest request);
    List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request);
}
