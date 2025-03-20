package com.hearlers.gateway.infrastructure.auth;

import com.hearlers.gateway.application.auth.OAuthProviderClient;
import com.hearlers.gateway.application.auth.dto.GetOAuthAccessTokenRequest;
import com.hearlers.gateway.application.auth.dto.GetOAuthAccessTokenResponse;
import com.hearlers.gateway.application.auth.dto.GetOAuthUserInfoRequest;
import com.hearlers.gateway.application.auth.dto.GetOAuthUserInfoResponse;
import com.hearlers.gateway.config.KakaoProperties;
import com.hearlers.gateway.infrastructure.auth.dto.GetKakaoUserInfoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class KakaoOAuthProviderClient implements OAuthProviderClient {
    private final String KAUTH_USER_URL_HOST = "https://kapi.kakao.com";
    private final String KAKAO_TOKEN_URL_HOST = "https://kauth.kakao.com";
    private final KakaoProperties kakaoProperties;


    @Override
    public GetOAuthAccessTokenResponse execute(
            GetOAuthAccessTokenRequest request) {
        GetOAuthAccessTokenResponse response = WebClient.create(KAKAO_TOKEN_URL_HOST).post()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .path("/oauth/token")
                        .queryParam("grant_type", "authorization_code")
                        .queryParam("client_id", kakaoProperties.getClientId())
                        .queryParam("code", request.getCode())
                        .build(true))
                .header(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                .retrieve()
                //TODO: 커스텀 예외 처리
                .onStatus(HttpStatusCode::is4xxClientError,
                        clientResponse -> Mono.error(new RuntimeException("Invalid Parameter")))
                .onStatus(HttpStatusCode::is5xxServerError,
                        clientResponse -> Mono.error(new RuntimeException("Internal Server Error")))
                .bodyToMono(GetOAuthAccessTokenResponse.class)
                .block();
        return response;
    }

    @Override
    public GetOAuthUserInfoResponse getUserInfo(GetOAuthUserInfoRequest request) {
        GetKakaoUserInfoResponseDto response = WebClient.create(KAUTH_USER_URL_HOST)
                .get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .path("/v1/user/me")
                        .build(true))
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + request.getAccessToken())
                .header(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                .retrieve()
                // TODO: 커스텀 예외 처리
                .onStatus(HttpStatusCode::is4xxClientError,
                        clientResponse -> Mono.error(new RuntimeException("Invalid Parameter")))
                .onStatus(HttpStatusCode::is5xxServerError,
                        clientResponse -> Mono.error(new RuntimeException("Internal Server Error")))
                .bodyToMono(GetKakaoUserInfoResponseDto.class)
                .block();
        GetOAuthUserInfoResponse result = new GetOAuthUserInfoResponse();
        result.setId(response.getId().toString());
        result.setNickname(response.getKakaoAccount().getProfile().getNickname());
        return result;
    }
}
