package com.hearlers.gateway.infrastructure.auth.kakao;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hearlers.api.proto.v1.model.Gender;
import com.hearlers.gateway.application.auth.AuthInfo;
import com.hearlers.gateway.presentation.rest.exception.HttpException;
import com.hearlers.gateway.presentation.rest.response.HttpResultCode;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public class KakaoDto {

    @Getter
    @Builder
    @ToString
    public static class KakaoTokenResponse {
      String token_type; // 토큰 타입, bearer로 고정
      String access_token; // 사용자 액세스 토큰 값
      String id_token; // ID 토큰 값
      //  OpenID Connect 확장 기능으로 발급하는 ID 토큰, Base64 인코딩 된 사용자 인증 정보 포함
      // 제공 조건: OpenID Connect가 활성화 된 앱의 토큰 발급 요청인 경우
      // 또는 scope에 openid를 포함한 추가 항목 동의 받기 요청을 거친 토큰 발급 요청인 경우
      Integer expires_in; // 액세스 토큰과 ID 토큰의 만료 시간(초)
      // 참고: 액세스 토큰과 ID 토큰의 만료 시간은 동일
      String refresh_token; // 사용자 리프레시 토큰 값
      Integer refresh_token_expires_in; // 리프레시 토큰 만료 시간(초)
      String scope; // 인증된 사용자의 정보 조회 권한 범위
      // 범위가 여러 개일 경우, 공백으로 구분
      // 참고: OpenID Connect가 활성화된 앱의 토큰 발급 요청인

      public AuthInfo.TokenInfo toTokenInfo() {
        return AuthInfo.TokenInfo.builder()
            .accessToken(access_token)
            .accessTokenExpiresAt(LocalDateTime.now().plusSeconds(expires_in))
            .refreshToken(refresh_token)
            .refreshTokenExpiresAt(LocalDateTime.now().plusSeconds(refresh_token_expires_in))
            .build();
      }
    }

    @Getter
    @Builder
    @ToString
    public static class KakaoAccountInformation {
        String id; // 회원번호
        boolean has_signed_up; // 자동 연결 설정을 비활성화한 경우만 존재
        String connected_at; // 서비스에 연결 완료된 시각, UTC  
        String synched_at; // 카카오싱크 간편가입을 통해 로그인한 시각, UTC
        Object properties; // 사용자 프로퍼티(Property)
        KakaoAccount kakao_account; // 카카오계정 정보
        KakaoPartner for_partner; // 파트너 정보
        

        public AuthInfo.OAuthUserInfo toOAuthUserInfo() {
          if(id == null) {
            throw new HttpException(HttpResultCode.KAKAO_PROCESSING_ERROR);
          }
          return AuthInfo.OAuthUserInfo.builder()
              .id(id)
              .name(kakao_account != null ? kakao_account.getName() : null)
              .gender(Optional.ofNullable(kakao_account)
                .map(KakaoAccount::getGender)
                .map(KakaoGender::toProtoGender)
                .orElse(Gender.GENDER_UNSPECIFIED))          
              .birthyear(kakao_account != null ? kakao_account.getBirthyear() : null)
              .phone_number(kakao_account != null ? kakao_account.getPhone_number() : null)
              .build();
            }      
      }
      
      public enum KakaoAgeRange {
          AGE_1_9("1~9"),
          AGE_10_14("10~14"),
          AGE_15_19("15~19"),
          AGE_20_29("20~29"),
          AGE_30_39("30~39"),
          AGE_40_49("40~49"),
          AGE_50_59("50~59"),
          AGE_60_69("60~69"),
          AGE_70_79("70~79"),
          AGE_80_89("80~89"),
          AGE_90("90~");

          private final String value;

          KakaoAgeRange(String value) {
            this.value = value;
          }

          @JsonValue
          public String getValue() {
              return value;
          }

          @JsonCreator
          public static KakaoAgeRange from(String value) {
              return Arrays.stream(values())
                  .filter(a -> a.value.equals(value)) 
                  .findFirst()
                  .orElseThrow(() -> new IllegalArgumentException("Invalid age range: " + value));
          }
      }      

      public enum KakaoGender {
          FEMALE("female"),
          MALE("male");

          private final String value;

          KakaoGender(String value) {
            this.value = value;
          }

          @JsonValue
          public String getValue() {
              return value;
          }
      
          @JsonCreator
          public static KakaoGender from(String value) {
              return Arrays.stream(values())
                  .filter(g -> g.value.equalsIgnoreCase(value))
                  .findFirst()
                  .orElseThrow(() -> new IllegalArgumentException("Invalid gender: " + value));
          }

          public Gender toProtoGender() {
            return switch (this) {
                case MALE -> Gender.GENDER_MALE;
                case FEMALE -> Gender.GENDER_FEMALE;
            };
        }
      }
      
      
      @Getter
      @Builder
      @ToString
      public static class KakaoAccount {
        boolean profile_needs_agreement; // 사용자 동의 시 프로필 정보(닉네임/프로필 사진) 제공 가능
        boolean profile_nickname_needs_agreement; // 사용자 동의 시 닉네임 제공 가능
        boolean profile_image_needs_agreement; // 사용자 동의 시 프로필 사진 제공 가능
        KakaoProfile profile; // 프로필 정보
        boolean name_needs_agreement; // 사용자 동의 시 카카오계정 이름 제공 가능
        String name; // 카카오계정 이름
        boolean email_needs_agreement; // 사용자 동의 시 카카오계정 대표 이메일 제공 가능
        boolean is_email_valid; // 이메일 유효 여부
        boolean is_email_verified; // 이메일 인증 여부
        String email; // 카카오계정 대표 이메일
        boolean age_range_needs_agreement; // 사용자 동의 시 연령대 제공 가능
        KakaoAgeRange age_range; // 연령대
        boolean birthyear_needs_agreement; // 사용자 동의 시 출생 연도 제공 가능
        String birthyear; // 출생 연도(YYYY 형식)
        boolean birthday_needs_agreement; // 사용자 동의 시 생일 제공 가능
        String birthday; // 생일(MMDD 형식)
        String birthday_type; // 생일 타입
        boolean is_leap_month; // 생일의 윤달 여부
        boolean gender_needs_agreement; // 사용자 동의 시 성별 제공 가능
        KakaoGender gender; // 성별
        boolean phone_number_needs_agreement; // 사용자 동의 시 전화번호 제공 가능
        String phone_number; // 카카오계정의 전화번호
        // 해외 번호인 경우 자릿수, 붙임표(-) 유무나 위치가 다를 수 있음
        boolean ci_needs_agreement; // 사용자 동의 시 CI 참고 가능
        String ci; // 연계정보
        String ci_authenticated_at; // CI 발급 시각, UTC
      }
      
      @Getter
      @Builder
      @ToString
      public static class KakaoProfile {
        String nickname; // 닉네임
        String thumbnail_image_url; // 프로필 미리보기 이미지 URL
        String profile_image_url; // 프로필 사진 URL
        boolean is_default_image; // 프로필 사진 URL이 기본 프로필 사진 URL인지 여부
        boolean is_default_nickname; // 닉네임이 기본 닉네임인지 여부
      }
      
      @Getter
      @Builder
      @ToString
      public static class KakaoPartner {
        String uuid; // 파트너 고유 식별자
      }
}
