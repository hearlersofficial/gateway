package com.hearlers.gateway.applications.auth.useCases.GetKakaoUserInfoUseCase;

import com.hearlers.gateway.applications.auth.useCases.GetKakaoUserInfoUseCase.dto.GetKakaoUserInfoRequestDto;
import com.hearlers.gateway.applications.auth.useCases.GetKakaoUserInfoUseCase.dto.GetKakaoUserInfoResponseDto;
import com.hearlers.gateway.shared.application.UseCase;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class GetKakaoUserInfoUseCase implements UseCase<GetKakaoUserInfoRequestDto, GetKakaoUserInfoResponseDto> {

    private final String KAUTH_USER_URL_HOST = "https://kapi.kakao.com";

    @Override
    public GetKakaoUserInfoResponseDto execute(GetKakaoUserInfoRequestDto getKakaoUserInfoRequestDto) {

        return WebClient.create(KAUTH_USER_URL_HOST)
                .get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .path("/v2/user/me")
                        .build(true))
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + getKakaoUserInfoRequestDto.getAccessToken())
                .header(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                .retrieve()
                // TODO: 커스텀 예외 처리
                .onStatus(HttpStatusCode::is4xxClientError,
                        clientResponse -> Mono.error(new RuntimeException("Invalid Parameter")))
                .onStatus(HttpStatusCode::is5xxServerError,
                        clientResponse -> Mono.error(new RuntimeException("Internal Server Error")))
                .bodyToMono(GetKakaoUserInfoResponseDto.class)
                .block();
    }
}
