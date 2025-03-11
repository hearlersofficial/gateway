package com.hearlers.gateway.infrastructure.counseling;    

import java.util.List;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Context;
import com.hearlers.api.proto.v1.service.CounselServiceGrpc.CounselServiceBlockingStub;
import com.hearlers.api.proto.v1.service.FindContextByIdRequest;
import com.hearlers.api.proto.v1.service.FindContextsRequest;
import com.hearlers.gateway.application.counseling.PromptsReader;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PromptsReaderImpl implements PromptsReader {
    private final CounselServiceBlockingStub counselServiceBlockingStub;
    
    @Override
    public Context findContextById(FindContextByIdRequest request) {
        return counselServiceBlockingStub.findContextById(request).getContext();
    }

    @Override
    public List<Context> findContexts(FindContextsRequest request) {
        return counselServiceBlockingStub.findContexts(request).getContextsList();
    }
    
    
}
