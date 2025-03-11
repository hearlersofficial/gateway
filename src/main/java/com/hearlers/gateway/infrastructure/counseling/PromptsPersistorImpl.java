package com.hearlers.gateway.infrastructure.counseling;    

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.service.CounselServiceGrpc.CounselServiceBlockingStub;
import com.hearlers.api.proto.v1.service.CreateContextRequest;
import com.hearlers.api.proto.v1.service.UpdateContextRequest;
import com.hearlers.gateway.application.counseling.PromptsPersistor;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PromptsPersistorImpl implements PromptsPersistor {
    private final CounselServiceBlockingStub counselServiceBlockingStub;
    
    @Override
    public Context createContext(CreateContextRequest request) {
        return counselServiceBlockingStub.createContext(request).getContext();
    }

    @Override
    public Context updateContext(UpdateContextRequest request) {
        return counselServiceBlockingStub.updateContext(request).getContext();
    }
    
    
}
