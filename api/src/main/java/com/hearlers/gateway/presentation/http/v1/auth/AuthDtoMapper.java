package com.hearlers.gateway.presentation.http.v1.auth;

import com.hearlers.gateway.auth.model.AuthInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

import com.hearlers.api.proto.v1.message.User;
import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.model.UserProfile;
import com.hearlers.api.proto.v1.service.InitializeUserResponse;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface AuthDtoMapper {

    // User -> UserResponseDto
    AuthDto.UserResponseDto of(User user);

    // UserProfile -> UserProfileResponseDto
    AuthDto.UserProfileResponseDto of(UserProfile userProfile);

    // AuthUser -> SaveRefreshTokenRequest
    default SaveRefreshTokenRequest ofAuthUserAndToken(AuthUser authUser, AuthInfo.TokenInfo token) {
        return SaveRefreshTokenRequest.newBuilder()
                .setUserId(authUser.getUserId())
                .setToken(token.getRefreshToken())
                .setExpiresAt(token.getRefreshTokenExpiresAt().toString())
                .build();
    }

    // TokenInfo -> TokenResponseDto
    AuthDto.TokenResponseDto of(AuthInfo.TokenInfo token);
}