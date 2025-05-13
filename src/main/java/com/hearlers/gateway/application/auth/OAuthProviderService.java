package com.hearlers.gateway.application.auth;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.model.Authority;

public interface OAuthProviderService {
    /**
     * OAuth 제공자가 지원하는 인증 채널을 반환합니다.
     */
    AuthChannel getSupportedChannel();
    
    /**
     * OAuth 인증 URL을 생성합니다.
     */
    String generateAuthorizationUrl(String state);
    
    /**
     * OAuth 코드를 이용하여 사용자 정보를 조회합니다.
     */
    AuthInfo.OAuthUserInfo getUserInfo(String code, String state);
    
    /**
     * 사용자 권한을 평가합니다.
     * @param authUser 현재 사용자
     * @param uniqueId OAuth 제공자의 고유 ID
     * @return 평가된 권한 (업데이트는 하지 않음)
     */
    Authority evaluateAuthority(AuthUser authUser, String uniqueId);
}
