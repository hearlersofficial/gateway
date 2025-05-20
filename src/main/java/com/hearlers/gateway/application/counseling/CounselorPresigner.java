package com.hearlers.gateway.application.counseling;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest;
import com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest;

public interface CounselorPresigner {
    PresignedUrl generateCounselorImageUrl(GenerateCounselorImageUrlRequest request);
    PresignedUrl generateCutSceneImageUrl(GenerateCutSceneImageUrlRequest request);
}