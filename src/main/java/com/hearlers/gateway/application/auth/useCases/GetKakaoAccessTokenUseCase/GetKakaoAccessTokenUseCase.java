package com.hearlers.gateway.application.auth.useCases.GetKakaoAccessTokenUseCase;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.hearlers.gateway.application.auth.useCases.GetKakaoAccessTokenUseCase.dto.GetKakaoAccessTokenRequestDto;
import com.hearlers.gateway.application.auth.useCases.GetKakaoAccessTokenUseCase.dto.GetKakaoAccessTokenResponseDto;
import com.hearlers.gateway.config.KakaoProperties;
import com.hearlers.gateway.shared.application.UseCase;

import io.netty.handler.codec.http.HttpHeaderValues;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class GetKakaoAccessTokenUseCase implements
        UseCase<GetKakaoAccessTokenRequestDto, GetKakaoAccessTokenResponseDto> {
    private final KakaoProperties kakaoProperties;
    private static final String KAKAO_TOKEN_URL_HOST = "https://kauth.kakao.com";

    @Override
    public GetKakaoAccessTokenResponseDto execute(
            GetKakaoAccessTokenRequestDto request) {
        GetKakaoAccessTokenResponseDto response = WebClient.create(KAKAO_TOKEN_URL_HOST).post()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .path("/oauth/token")
                        .queryParam("grant_type", "authorization_code")
                        .queryParam("client_id", kakaoProperties.getClientId())
                        .queryParam("code", request.getCode())
                        .build(true))
                .header(HttpHeaders.CONTENT_TYPE, HttpHeaderValues.APPLICATION_X_WWW_FORM_URLENCODED.toString())
                .retrieve()
                //TODO: 커스텀 예외 처리
                .onStatus(HttpStatusCode::is4xxClientError,
                        clientResponse -> Mono.error(new RuntimeException("Invalid Parameter")))
                .onStatus(HttpStatusCode::is5xxServerError,
                        clientResponse -> Mono.error(new RuntimeException("Internal Server Error")))
                .bodyToMono(GetKakaoAccessTokenResponseDto.class)
                .block();
        return response;
    }
}


