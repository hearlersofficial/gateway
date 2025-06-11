package com.hearlers.gateway.infrastructure.counseling;

import com.hearlers.api.proto.v1.model.CounselMessage;
import com.hearlers.api.proto.v1.service.*;
import com.hearlers.gateway.application.counseling.CounselStore;
import com.hearlers.api.proto.v1.service.CounselServiceGrpc.CounselServiceBlockingStub;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CounselStoreImpl implements CounselStore {
    private final CounselServiceGrpc.CounselServiceBlockingStub counselorServiceBlockingStub;


    @Override
    public CreateCounselResponse createCounsel(CreateCounselRequest request) {
        return counselorServiceBlockingStub.createCounsel(request);
    }

    @Override
    public CreateMessageResponse createMessage(CreateMessageRequest request) {
        return counselorServiceBlockingStub.createMessage(request);
    }

    @Override
    public CounselMessage reactMessage(ReactMessageRequest request) {
        return counselorServiceBlockingStub.reactMessage(request).getCounselMessage();
    }
}
