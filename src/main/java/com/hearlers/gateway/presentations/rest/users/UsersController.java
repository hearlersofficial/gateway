package com.hearlers.gateway.presentations.rest.users;

import com.hearlers.gateway.presentations.rest.users.dto.CreateUserActivityRequestDto;
import com.hearlers.gateway.presentations.rest.users.dto.UpdateUserInfoRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @PostMapping("/me/activities")
    public void createUserActivities(@RequestBody CreateUserActivityRequestDto request) {
        // TODO : request를 바탕으로 내부 서버와 통신하여 User Activities 정보 업데이트
        System.out.println(request);
    }

    @GetMapping("/me/counselors/all/counsels")
    public void getMyAllCounsels() {
        // TODO : 내부 서버와 통신하여 내 모든 상담 채팅 목록 조회
        // TODO : return 타입 변경 -> ResponseEntity<GetMyAllCounselsResponseDto>
    }

    @PutMapping("/me")
    public void updateUserInfo(@RequestBody UpdateUserInfoRequestDto request) {
        // TODO : request를 바탕으로 내부 서버와 통신하여 User 정보 업데이트
        System.out.println(request);
    }

}
