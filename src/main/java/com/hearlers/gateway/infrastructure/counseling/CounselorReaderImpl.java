package com.hearlers.gateway.infrastructure.counseling;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.service.CounselServiceGrpc.CounselServiceBlockingStub;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;
import com.hearlers.gateway.application.counseling.CounselorReader;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CounselorReaderImpl implements CounselorReader {
    private final CounselServiceBlockingStub counselServiceBlockingStub;

        @Override
        public List<Counselor> findCounselors(FindCounselorsRequest request) {
        return counselServiceBlockingStub.findCounselors(request).getCounselorsList();
    }
    
}
