package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.model.Tone;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.CreateToneRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
import com.hearlers.api.proto.v1.service.UpdateToneRequest;

public interface PromptsPersistor {
    Context createContext(CreateContextRequest request);
    Context updateContext(UpdateContextRequest request);
    Tone createTone(CreateToneRequest request);
    Tone updateTone(UpdateToneRequest request);
}
