package com.hearlers.gateway.presentation.http.v1.users.app;

import com.hearlers.api.proto.v1.model.User;
import com.hearlers.api.proto.v1.model.UserProfile;
import com.hearlers.api.proto.v1.service.UpdateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface UserDtoMapper {

    UserDto.User of(User user);
    UserDto.UserProfile of (UserProfile userProfile);

    @Mapping(target = "userId", source = "userId")
    UpdateUserRequest toUpdateUserRequest(String userId, UserDto.UpdateMyUserRequest request);

    UserDto.UpdateMyUserResponse toUpdateMyUserResponse(User user);

    UserDto.FindMyUserResponse toFindMyUserResponse(User user);
}
