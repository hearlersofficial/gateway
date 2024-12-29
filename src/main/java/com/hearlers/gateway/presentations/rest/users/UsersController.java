package com.hearlers.gateway.presentations.rest.users;

import com.hearlers.api.proto.v1.service.UpdateUserRequest;
import com.hearlers.api.proto.v1.service.UpdateUserResponse;
import com.hearlers.api.proto.v1.service.UserServiceGrpc;
import com.hearlers.gateway.applications.counsel.model.Counsel;
import com.hearlers.gateway.presentations.common.dto.ResponseDto;
import com.hearlers.gateway.presentations.rest.users.dto.CreateUserActivityRequestDto;
import com.hearlers.gateway.presentations.rest.users.dto.GetMyAllCounselsResponseDto;
import com.hearlers.gateway.presentations.rest.users.dto.UpdateUserInfoRequestDto;
import com.hearlers.gateway.presentations.rest.users.dto.UpdateUserInfoResponseDto;
import com.hearlers.gateway.shared.guard.security.AuthGuard;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Tag(name = "UsersController", description = "유저 관련 API, 추후 gRPC 서버에서 데이터 받아온 것 return 값으로 변경")
public class UsersController {

    private final UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    @Operation(summary = "User Activities 정보 업데이트")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User Activities 정보 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "User Activities 정보 업데이트 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/me/activities")
    public void createUserActivities(@Valid @RequestBody CreateUserActivityRequestDto request) {
        // TODO : request를 바탕으로 내부 서버와 통신하여 User Activities 정보 업데이트
        System.out.println(request);
    }

    @Operation(summary = "내 모든 상담 채팅 목록 조회")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "내 모든 상담 채팅 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "내 모든 상담 채팅 목록 조회 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/me/counselors/all/counsels")
    public ResponseEntity<ResponseDto.Success<GetMyAllCounselsResponseDto>> getMyAllCounsels() {
        // TODO : 내부 서버와 통신하여 내 모든 상담 채팅 목록 조회
        Counsel counsel1 = new Counsel(1, 1, "안녕", LocalDate.of(2024, 12, 1), LocalDate.of(2024, 1, 1),
                LocalDate.now().minusDays(5), null);
        Counsel counsel2 = new Counsel(2, 2, "잘가", LocalDate.of(2024, 12, 1), LocalDate.of(2024, 1, 1),
                LocalDate.now().minusDays(10), null);

        // Counsel 리스트 생성
        List<Counsel> counsels = Arrays.asList(counsel1, counsel2);

        // GetMyAllCounselsResponseDto 인스턴스 생성
        GetMyAllCounselsResponseDto responseDto = new GetMyAllCounselsResponseDto(counsels);
        return ResponseEntity.status(HttpStatus.OK)
                .body(
                        ResponseDto.Success.<GetMyAllCounselsResponseDto>builder()
                                .message("비로그인 유저 생성 성공")
                                .data(responseDto)
                                .build()
                );

    }

    @Operation(summary = "유저 정보 업데이트")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User 정보 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "User 정보 업데이트 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/me")
    @AuthGuard
    public ResponseEntity<ResponseDto.Success<UpdateUserInfoResponseDto>> updateUserInfo(
            @RequestAttribute("userId") int userId, @RequestBody UpdateUserInfoRequestDto request) {

        UpdateUserRequest.Builder updateUserRequestBuilder = UpdateUserRequest.newBuilder()
                .setUserId(userId);

        if (request.getNickname() != null) {
            updateUserRequestBuilder.setNickname(request.getNickname());
        }
        if (request.getProfileImage() != null) {
            updateUserRequestBuilder.setProfileImage(request.getProfileImage());
        }
        if (request.getPhoneNumber() != null) {
            updateUserRequestBuilder.setPhoneNumber(request.getPhoneNumber());
        }
        if (request.getGender() != null) {
            updateUserRequestBuilder.setGender(request.getGender());
        }
        if (request.getBirthday() != null) {
            updateUserRequestBuilder.setBirthday(request.getBirthday());
        }
        if (request.getIntroduction() != null) {
            updateUserRequestBuilder.setIntroduction(request.getIntroduction());
        }
        if (request.getMbti() != null) {
            updateUserRequestBuilder.setMbti(request.getMbti());
        }

        UpdateUserRequest updateUserRequest = updateUserRequestBuilder.build();

        UpdateUserResponse updateUserResponse = userServiceBlockingStub.updateUser(updateUserRequest);
        ;
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(
                        ResponseDto.Success.<UpdateUserInfoResponseDto>builder()
                                .message("User 정보 업데이트 성공")
                                .data(new UpdateUserInfoResponseDto(userId, true))
                                .build()
                );
    }

}
