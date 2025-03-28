package com.hearlers.gateway.infrastructure.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.hearlers.gateway.application.auth.AuthCommand;
import com.hearlers.gateway.application.auth.AuthInfo;
import com.hearlers.gateway.application.auth.OAuthProviderClient;
import com.hearlers.gateway.config.KakaoProperties;
import com.hearlers.gateway.presentation.rest.exception.HttpException;
import com.hearlers.gateway.presentation.rest.response.HttpResultCode;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Component
@RequiredArgsConstructor
public class KakaoOAuthProviderClient implements OAuthProviderClient {
    private final String KAUTH_USER_URL_HOST = "https://kapi.kakao.com";
    private final String KAKAO_TOKEN_URL_HOST = "https://kauth.kakao.com";
    private final KakaoProperties kakaoProperties;


    @Override
    public AuthInfo.TokenInfo getToken(
            AuthCommand.GetOAuthAccessTokenRequest request) {
        KakaoDto.KakaoTokenResponse response = WebClient.create(KAKAO_TOKEN_URL_HOST).post()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .path("/oauth/token")
                        .queryParam("grant_type", "authorization_code")
                        .queryParam("client_id", kakaoProperties.getClientId())
                        .queryParam("code", request.getCode())
                        .build(true))
                .header(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, clientResponse -> 
                clientResponse.bodyToMono(String.class)
                        .flatMap(body -> Mono.error(new HttpException(HttpResultCode.KAKAO_PROCESSING_ERROR, body)))
                )
                .onStatus(HttpStatusCode::is5xxServerError, clientResponse -> 
                clientResponse.bodyToMono(String.class)
                        .flatMap(body -> Mono.error(new HttpException(HttpResultCode.KAKAO_PROCESSING_ERROR, body)))
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
                        .flatMap(body -> Mono.error(new HttpException(HttpResultCode.KAKAO_PROCESSING_ERROR, body)))
                )
                .onStatus(HttpStatusCode::is5xxServerError, clientResponse ->
                clientResponse.bodyToMono(String.class)
                        .flatMap(body -> Mono.error(new HttpException(HttpResultCode.KAKAO_PROCESSING_ERROR, body)))
                )
                .bodyToMono(KakaoDto.KakaoAccountInformation.class)
                .block();
        if(response == null) {
            throw new HttpException(HttpResultCode.KAKAO_PROCESSING_ERROR);
        }
        AuthInfo.OAuthUserInfo result = response.toOAuthUserInfo();
        return result;
    }
}
