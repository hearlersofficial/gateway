package com.hearlers.gateway.infrastructure.counsel;

import com.hearlers.api.proto.v1.model.Counsel;
import com.hearlers.api.proto.v1.model.CounselMessage;
import com.hearlers.api.proto.v1.model.CounselorUserRelationship;
import com.hearlers.api.proto.v1.service.*;
import com.hearlers.gateway.application.counsel.CounselReader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@RequiredArgsConstructor
public class GrpcCounselReader implements CounselReader {
    private final CounselServiceGrpc.CounselServiceBlockingStub counselorServiceBlockingStub;

    @Override
    public Counsel findCounselById(FindCounselByIdRequest request) {
        return counselorServiceBlockingStub.findCounselById(request).getCounsel();
    }

    @Override
    public List<Counsel> findCounsels(FindCounselsRequest request) {
        return counselorServiceBlockingStub.findCounsels(request).getCounselsList();
    }

    @Override
    public List<CounselMessage> findMessages(FindMessagesRequest request) {
        return counselorServiceBlockingStub.findMessages(request).getCounselMessagesList();
    }

    @Override
    public List<CounselorUserRelationship> findCounselorUserRelationships(FindCounselorUserRelationshipsRequest request) {
        return counselorServiceBlockingStub.findCounselorUserRelationships(request).getCounselorUserRelationshipsList();
    }
}
