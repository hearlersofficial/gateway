package com.hearlers.gateway.kakao;

import com.hearlers.gateway.OAuthProviderClient;
import com.hearlers.gateway.auth.exception.OauthProcessingErrorException;
import com.hearlers.gateway.auth.model.AuthInfo;
import com.hearlers.gateway.command.AuthCommand;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Component
@RequiredArgsConstructor
class KakaoOAuthProviderClient implements OAuthProviderClient {
    private final String KAUTH_USER_URL_HOST = "https://kapi.kakao.com";
    private final String KAKAO_TOKEN_URL_HOST = "https://kauth.kakao.com";


    @Override
    public AuthInfo.TokenInfo getToken(
            AuthCommand.GetOAuthAccessTokenRequest request, String clientId) {
        KakaoDto.KakaoTokenResponse response = WebClient.create(KAKAO_TOKEN_URL_HOST).post()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .path("/oauth/token")
                        .queryParam("grant_type", "authorization_code")
                        .queryParam("client_id", clientId)
                        .queryParam("code", request.getCode())
                        .build(true))
                .header(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, clientResponse -> 
                clientResponse.bodyToMono(String.class)
                        .flatMap(body -> Mono.error(new OauthProcessingErrorException(body)))
                )
                .onStatus(HttpStatusCode::is5xxServerError, clientResponse -> 
                clientResponse.bodyToMono(String.class)
                        .flatMap(body -> Mono.error(new OauthProcessingErrorException(body)))
                )
                .bodyToMono(KakaoDto.KakaoTokenResponse.class)
                .block();

        log.info("tokenResponse: {}", response);
        return response.toTokenInfo();
    }

    @Override
    public AuthInfo.OAuthUserInfo getOAuthUser(AuthCommand.GetOAuthUserInfoRequest request) {

        KakaoDto.KakaoAccountInformation response = WebClient.create(KAUTH_USER_URL_HOST)
                .get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .path("/v2/user/me")
                        .build(true))
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + request.getAccessToken())
                .header(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, clientResponse ->
                clientResponse.bodyToMono(String.class)
                        .flatMap(body -> Mono.error(new OauthProcessingErrorException(body)))
                )
                .onStatus(HttpStatusCode::is5xxServerError, clientResponse ->
                clientResponse.bodyToMono(String.class)
                        .flatMap(body -> Mono.error(new OauthProcessingErrorException(body)))
                )
                .bodyToMono(KakaoDto.KakaoAccountInformation.class)
                .block();
        if(response == null) {
            throw new OauthProcessingErrorException("카카오에서 응답이 오지 않았습니다.");
        }
        AuthInfo.OAuthUserInfo result = response.toOAuthUserInfo();
        return result;
    }
}
