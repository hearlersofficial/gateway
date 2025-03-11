package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
public interface PromptsPersistor {
    Context createContext(CreateContextRequest request);
    Context updateContext(UpdateContextRequest request);
}
