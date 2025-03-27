package com.hearlers.gateway.presentation.rest.v1.auth;

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
import com.hearlers.gateway.application.auth.AuthCommand;
import com.hearlers.gateway.application.auth.AuthInfo;

@Mapper(
        componentModel = "spring",
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
                .setUserId(authUser.getId())
                .setToken(token.getRefreshToken())
                .setExpiresAt(token.getRefreshTokenExpiresAt().toString())
                .build();
    }

    // TokenInfo -> TokenResponseDto
    AuthDto.TokenResponseDto of(AuthInfo.TokenInfo token);

    // InitializeUserResponse -> GenerateTokenCommand
    @Mapping(target = "id", source = "user.id")
    @Mapping(target = "authChannel", source = "authUser.authChannel")
    AuthCommand.GenerateTokenCommand of(InitializeUserResponse initializeUserResponse);

    // String id, AuthChannel authChannel -> GenerateTokenCommand
    AuthCommand.GenerateTokenCommand of(String id, AuthChannel authChannel);

}