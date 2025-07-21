package com.hearlers.gateway.presentation.http.v1.users.app;

import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.gateway.application.user.UserService;
import com.hearlers.gateway.shared.response.ResponseDto;
import com.hearlers.gateway.shared.response.ResponseDtoUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import com.hearlers.api.proto.v1.service.FindUserByUserIdRequest;


@RestController("v1UserAppController")
@RequestMapping("/v1/users")
@RequiredArgsConstructor
@Tag(name = "앱/유저", description = "유저 관련 API")
public class UserController {

    private final UserService userService;
    private final UserDtoMapper userDtoMapper = Mappers.getMapper(UserDtoMapper.class);

    @Operation(summary = "내 정보 조회", description = "현재 로그인한 사용자의 정보를 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "내 정보 조회 성공"),
            @ApiResponse(responseCode = "404", description = "사용자를 찾을 수 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/me")
    public ResponseEntity<ResponseDto.Success<UserDto.FindMyUserResponse>> getMyUser(
            @RequestAttribute(value = "userId", required = false) String userId )
    {
        var findUserRequest = FindUserByUserIdRequest.newBuilder().setUserId(userId).build();
        var user = userService.findUserByUserId(findUserRequest);
        var response = userDtoMapper.toFindMyUserResponse(user);
        return ResponseDtoUtil.okResponse(response, "내 정보 조회 성공");
    }

    @Operation(summary = "내 프로필 업데이트", description = "현재 로그인한 사용자의 프로필 정보를 업데이트합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "프로필 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "잘못된 요청", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "사용자를 찾을 수 없음", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/me")
    public ResponseEntity<ResponseDto.Success<UserDto.UpdateMyUserResponse>> updateMyUser(
            @RequestAttribute(value = "userId", required = false) String userId,
            @Valid @RequestBody UserDto.UpdateMyUserRequest request)
    {
        var updateUserRequest = userDtoMapper.toUpdateUserRequest(userId, request);
        var user = userService.updateUser(updateUserRequest);
        var response = userDtoMapper.toUpdateMyUserResponse(user);
        return ResponseDtoUtil.okResponse(response, "프로필 업데이트 성공");
    }
}
