package com.hearlers.gateway.infrastructure.auth.kakao;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.gateway.application.auth.AuthInfo;
import com.hearlers.gateway.application.auth.OAuthProviderService;
import com.hearlers.gateway.config.KakaoProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class KakaoService implements OAuthProviderService {
    private final KakaoProperties kakaoProperties;
    private final KakaoOAuthProviderClient kakaoOAuthProviderClient;
    
    @Override
    public AuthChannel getSupportedChannel() {
        return AuthChannel.AUTH_CHANNEL_KAKAO;
    }
    
    @Override
    public String generateAuthorizationUrl(String state) {
        return "https://kauth.kakao.com/oauth/authorize?" +
                "client_id=" + kakaoProperties.getClientId() +
                "&redirect_uri=" + kakaoProperties.getRedirectUri() +
                "&response_type=code" +
                "&state=" + state;
    }
    
    @Override
    public AuthInfo.OAuthUserInfo getUserInfo(String code, String state) {
        return kakaoOAuthProviderClient.getOAuthUserInfo(code);
    }
    
    @Override
    public Authority evaluateAuthority(AuthUser authUser, String uniqueId) {
        // 카카오에서는 관리자 고유 ID 목록에 포함되어 있으면 관리자 권한 부여
        List<String> adminUniqueIds = kakaoProperties.getAdminUniqueIds();
        
        if (adminUniqueIds != null && adminUniqueIds.contains(uniqueId)) {
            log.info("Admin user detected. uniqueId: {}", uniqueId);
            return Authority.AUTHORITY_ADMIN;
        }
        
        // 기본적으로 일반 사용자 권한 부여
        return Authority.AUTHORITY_USER;
    }
}
