package com.hearlers.gateway.application.counselor;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest;
import com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest;

public interface CounselorImagePresigner {
    PresignedUrl generateCounselorImageUrl(GenerateCounselorImageUrlRequest request);
    PresignedUrl generateCutSceneImageUrl(GenerateCutSceneImageUrlRequest request);
}