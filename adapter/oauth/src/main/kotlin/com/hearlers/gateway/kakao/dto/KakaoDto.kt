package com.hearlers.gateway.kakao.dto

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.hearlers.api.proto.v1.model.Gender
import com.hearlers.gateway.auth.exception.OauthProcessingErrorException
import com.hearlers.gateway.auth.model.AuthInfo
import java.time.LocalDateTime

/**
 * KAKAO HTTP API에서 오는 응답 타입만 정의합니다.
 */
object KakaoDto {

    data class KakaoTokenResponse(
        @get:JsonProperty("token_type") val tokenType: String?, // 토큰 타입, bearer로 고정
        @get:JsonProperty("access_token") val accessToken: String?, // 사용자 액세스 토큰 값
        @get:JsonProperty("id_token") val idToken: String?, // ID 토큰 값
        //  OpenID Connect 확장 기능으로 발급하는 ID 토큰, Base64 인코딩 된 사용자 인증 정보 포함
        // 제공 조건: OpenID Connect가 활성화 된 앱의 토큰 발급 요청인 경우
        // 또는 scope에 openid를 포함한 추가 항목 동의 받기 요청을 거친 토큰 발급 요청인 경우
        @get:JsonProperty("expires_in") val expiresIn: Int?, // 액세스 토큰과 ID 토큰의 만료 시간(초)
        // 참고: 액세스 토큰과 ID 토큰의 만료 시간은 동일
        @get:JsonProperty("refresh_token") val refreshToken: String?, // 사용자 리프레시 토큰 값
        @get:JsonProperty("refresh_token_expires_in") val refreshTokenExpiresIn: Int?, // 리프레시 토큰 만료 시간(초)
        val scope: String? // 인증된 사용자의 정보 조회 권한 범위
        // 범위가 여러 개일 경우, 공백으로 구분
        // 참고: OpenID Connect가 활성화된 앱의 토큰 발급 요청인
    ) {
        fun toTokenInfo(): AuthInfo.TokenInfo {
            return AuthInfo.TokenInfo(
                accessToken,
                refreshToken,
                LocalDateTime.now().plusSeconds(expiresIn?.toLong() ?: 0),
                LocalDateTime.now().plusSeconds(refreshTokenExpiresIn?.toLong() ?: 0)
            )
        }
    }

    data class KakaoAccountInformation(
        val id: String?, // 회원번호
        @get:JsonProperty("has_signed_up") val hasSignedUp: Boolean?, // 자동 연결 설정을 비활성화한 경우만 존재
        @get:JsonProperty("connected_at") val connectedAt: String?, // 서비스에 연결 완료된 시각, UTC
        @get:JsonProperty("synched_at") val synchedAt: String?, // 카카오싱크 간편가입을 통해 로그인한 시각, UTC
        val properties: Any?, // 사용자 프로퍼티(Property)
        @get:JsonProperty("kakao_account") val kakaoAccount: KakaoAccount?, // 카카오계정 정보
        @get:JsonProperty("for_partner") val forPartner: KakaoPartner? // 파트너 정보
    ) {
        fun toOAuthUserInfo(): AuthInfo.OAuthUserInfo {
            if (id == null) {
                throw OauthProcessingErrorException("카카오에서 회원번호가 오지 않았습니다.")
            }
            return AuthInfo.OAuthUserInfo(
                id,
                kakaoAccount?.name,
                kakaoAccount?.gender?.toProtoGender() ?: Gender.GENDER_UNSPECIFIED,
                kakaoAccount?.birthyear,
                kakaoAccount?.phoneNumber
            )
        }
    }

    enum class KakaoAgeRange(@get:JsonValue val value: String) {
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

        companion object {
            @JvmStatic
            @JsonCreator
            fun from(value: String): KakaoAgeRange =
                values().firstOrNull { it.value == value }
                    ?: throw IllegalArgumentException("Invalid age range: $value")
        }
    }

    enum class KakaoGender(@get:JsonValue val value: String) {
        FEMALE("female"),
        MALE("male");

        companion object {
            @JvmStatic
            @JsonCreator
            fun from(value: String): KakaoGender =
                values().firstOrNull { it.value.equals(value, ignoreCase = true) }
                    ?: throw IllegalArgumentException("Invalid gender: $value")
        }

        fun toProtoGender(): Gender {
            return when (this) {
                MALE -> Gender.GENDER_MALE
                FEMALE -> Gender.GENDER_FEMALE
            }
        }
    }

    data class KakaoAccount(
        @get:JsonProperty("profile_needs_agreement") val profileNeedsAgreement: Boolean?, // 사용자 동의 시 프로필 정보(닉네임/프로필 사진) 제공 가능
        @get:JsonProperty("profile_nickname_needs_agreement") val profileNicknameNeedsAgreement: Boolean?, // 사용자 동의 시 닉네임 제공 가능
        @get:JsonProperty("profile_image_needs_agreement") val profileImageNeedsAgreement: Boolean?, // 사용자 동의 시 프로필 사진 제공 가능
        val profile: KakaoProfile?, // 프로필 정보
        @get:JsonProperty("name_needs_agreement") val nameNeedsAgreement: Boolean?, // 사용자 동의 시 카카오계정 이름 제공 가능
        val name: String?, // 카카오계정 이름
        @get:JsonProperty("email_needs_agreement") val emailNeedsAgreement: Boolean?, // 사용자 동의 시 카카오계정 대표 이메일 제공 가능
        @get:JsonProperty("is_email_valid") val isEmailValid: Boolean?, // 이메일 유효 여부
        @get:JsonProperty("is_email_verified") val isEmailVerified: Boolean?, // 이메일 인증 여부
        val email: String?, // 카카오계정 대표 이메일
        @get:JsonProperty("age_range_needs_agreement") val ageRangeNeedsAgreement: Boolean?, // 사용자 동의 시 연령대 제공 가능
        @get:JsonProperty("age_range") val ageRange: KakaoAgeRange?, // 연령대
        @get:JsonProperty("birthyear_needs_agreement") val birthyearNeedsAgreement: Boolean?, // 사용자 동의 시 출생 연도 제공 가능
        val birthyear: String?, // 출생 연도(YYYY 형식)
        @get:JsonProperty("birthday_needs_agreement") val birthdayNeedsAgreement: Boolean?, // 사용자 동의 시 생일 제공 가능
        val birthday: String?, // 생일(MMDD 형식)
        @get:JsonProperty("birthday_type") val birthdayType: String?, // 생일 타입
        @get:JsonProperty("is_leap_month") val isLeapMonth: Boolean?, // 생일의 윤달 여부
        @get:JsonProperty("gender_needs_agreement") val genderNeedsAgreement: Boolean?, // 사용자 동의 시 성별 제공 가능
        val gender: KakaoGender?, // 성별
        @get:JsonProperty("phone_number_needs_agreement") val phoneNumberNeedsAgreement: Boolean?, // 사용자 동의 시 전화번호 제공 가능
        @get:JsonProperty("phone_number") val phoneNumber: String?, // 카카오계정의 전화번호
        // 해외 번호인 경우 자릿수, 붙임표(-) 유무나 위치가 다를 수 있음
        @get:JsonProperty("ci_needs_agreement") val ciNeedsAgreement: Boolean?, // 사용자 동의 시 CI 참고 가능
        val ci: String?, // 연계정보
        @get:JsonProperty("ci_authenticated_at") val ciAuthenticatedAt: String? // CI 발급 시각, UTC
    )

    data class KakaoProfile(
        val nickname: String?, // 닉네임
        @get:JsonProperty("thumbnail_image_url") val thumbnailImageUrl: String?, // 프로필 미리보기 이미지 URL
        @get:JsonProperty("profile_image_url") val profileImageUrl: String?, // 프로필 사진 URL
        @get:JsonProperty("is_default_image") val isDefaultImage: Boolean?, // 프로필 사진 URL이 기본 프로필 사진 URL인지 여부
        @get:JsonProperty("is_default_nickname") val isDefaultNickname: Boolean? // 닉네임이 기본 닉네임인지 여부
    )

    data class KakaoPartner(
        val uuid: String? // 파트너 고유 식별자
    )
}