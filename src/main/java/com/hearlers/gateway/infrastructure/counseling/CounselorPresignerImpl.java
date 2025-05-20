package com.hearlers.gateway.infrastructure.counseling;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc;
import com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest;
import com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest;
import com.hearlers.gateway.application.counseling.CounselorPresigner;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc.CounselorServiceBlockingStub;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class CounselorPresignerImpl implements CounselorPresigner {
    private final CounselorServiceGrpc.CounselorServiceBlockingStub counselorServiceBlockingStub;

    @Override
    public PresignedUrl generateCounselorImageUrl(GenerateCounselorImageUrlRequest request) {
        return counselorServiceBlockingStub.generateCounselorImageUrl(request).getPresignedUrl();
    }

    @Override
    public PresignedUrl generateCutSceneImageUrl(GenerateCutSceneImageUrlRequest request) {
        return counselorServiceBlockingStub.generateCutSceneImageUrl(request).getPresignedUrl();
    }
}
