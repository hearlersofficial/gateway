package com.hearlers.gateway.presentations.rest.users;

import com.hearlers.gateway.presentations.rest.users.dto.SetUserActivityRequestDto;
import com.hearlers.gateway.presentations.rest.users.dto.SetUserInfoRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @PostMapping("/me/activities")
    public void setUserActivities(@RequestBody SetUserActivityRequestDto request) {
        // TODO : request를 바탕으로 내부 서버와 통신하여 User Activities 정보 업데이트
        System.out.println(request);
    }

    @PutMapping("/me")
    public void setUserInfo(@RequestBody SetUserInfoRequestDto request) {
        // TODO : request를 바탕으로 내부 서버와 통신하여 User 정보 업데이트
        System.out.println(request);
    }

}
