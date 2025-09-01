package com.hearlers.gateway.presentation.http.v1.users.admin;

import com.hearlers.api.proto.v1.model.User;
import com.hearlers.api.proto.v1.model.UserProfile;
import com.hearlers.api.proto.v1.service.FindUserByUserIdRequest;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface UserDtoMapper {

    UserDto.User of(User user);
    UserDto.UserProfile of (UserProfile userProfile);

    FindUserByUserIdRequest toFindUserByUserIdRequest(String userId);

    UserDto.FindUserByIdResponse toFindUserByIdResponse(User user);
}
