package com.hearlers.gateway.kakao;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.model.Authority;
import com.hearlers.gateway.auth.model.AuthInfo;
import com.hearlers.gateway.command.AuthCommand;
import com.hearlers.gateway.port.OAuthProviderPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class KakaoService implements OAuthProviderPort {

    private final String clientId;
    private final String redirectUri;
    private final List<String> adminUniqueIds;
    private final KakaoOAuthProviderClient kakaoOAuthProviderClient;

    public KakaoService(
            @Value("${kakao.client_id}") String clientId,
            @Value("${kakao.redirect_uri}") String redirectUri,
            @Value("${kakao.admin_unique_ids}") List<String> adminUniqueIds,
            KakaoOAuthProviderClient kakaoOAuthProviderClient
    ) {
        this.clientId = clientId;
        this.redirectUri = redirectUri;
        this.adminUniqueIds = adminUniqueIds;
        this.kakaoOAuthProviderClient = kakaoOAuthProviderClient;
    }

    @Override
    public AuthChannel getSupportedChannel() {
        return AuthChannel.AUTH_CHANNEL_KAKAO;
    }
    
    @Override
    public String generateAuthorizationUrl(String state) {
        return "https://kauth.kakao.com/oauth/authorize?" +
                "client_id=" + this.clientId +
                "&redirect_uri=" + this.redirectUri +
                "&response_type=code" +
                "&state=" + state;
    }
    
    @Override
    public AuthInfo.OAuthUserInfo getUserInfo(String code, String state) {

        AuthInfo.TokenInfo tokenInfo = kakaoOAuthProviderClient.getToken(code, state, clientId);
        return kakaoOAuthProviderClient.getOAuthUser(tokenInfo.getAccessToken());
    }
    
    @Override
    public Authority evaluateAuthority(AuthUser authUser, String uniqueId) {
        // 카카오에서는 관리자 고유 ID 목록에 포함되어 있으면 관리자 권한 부여
        List<String> adminUniqueIds = this.adminUniqueIds;
        
        if (adminUniqueIds != null && adminUniqueIds.contains(uniqueId)) {
            log.info("Admin user detected. uniqueId: {}", uniqueId);
            return Authority.AUTHORITY_ADMIN;
        }
        
        // 기본적으로 일반 사용자 권한 부여
        return Authority.AUTHORITY_USER;
    }
}
