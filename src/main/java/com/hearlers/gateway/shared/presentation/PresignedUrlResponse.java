package com.hearlers.gateway.shared.presentation;

import com.hearlers.api.proto.v1.common.PresignedUrl;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.val;

@Getter
@Builder
@Schema(description = "Presigned URL 응답")
public class PresignedUrlResponse {
    @Schema(description = "Presigned URL", example = "https://example.com/presigned-url")
    private String uploadUrl;
    @Schema(description = "Presigned URL로 업로드한 파일의 공개 URL", example = "https://example.com/public-url")
    private String publicUrl;
    @Schema(description = "Presigned URL 만료 시간", example = "2023-10-01T12:00:00Z")
    private String expiresAt;

    public static PresignedUrlResponse of(PresignedUrl proto) {
        return PresignedUrlResponse.builder()
                .uploadUrl(proto.getUploadUrl())
                .publicUrl(proto.getPublicUrl())
                .expiresAt(proto.getExpiresAt())
                .build();
    }
}
