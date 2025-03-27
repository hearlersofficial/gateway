package com.hearlers.gateway.application.counseling;

import java.util.List;

import com.hearlers.api.proto.v1.model.CounselTechnique;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest;
import com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;

public interface PromptPersistor {
    Tone createTone(CreateToneRequest request);
    Tone updateTone(UpdateToneRequest request);

    CounselTechnique createCounselTechnique(CreateCounselTechniqueRequest request);
    CounselTechnique updateCounselTechnique(UpdateCounselTechniqueRequest request);
    List<CounselTechnique> saveCounselTechniqueSequence(SaveCounselTechniqueSequenceRequest request);
}
