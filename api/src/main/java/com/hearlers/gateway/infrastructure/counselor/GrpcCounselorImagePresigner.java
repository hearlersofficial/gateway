package com.hearlers.gateway.infrastructure.counselor;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc;
import com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest;
import com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest;
import com.hearlers.gateway.application.counselor.CounselorImagePresigner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class GrpcCounselorImagePresigner implements CounselorImagePresigner {
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
