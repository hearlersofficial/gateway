package com.hearlers.gateway.presentations.rest.auth;

import com.hearlers.gateway.applications.users.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @Value("${kakao.client_id}")
    String clientId;
    @Value("${kakao.redirect_uri}")
    String redirectUri;


    @GetMapping("/login/kakao")
    public void kakao(HttpServletResponse response) throws IOException {
        StringBuffer url = new StringBuffer();
        url.append("https://kauth.kakao.com/oauth/authorize?");
        url.append("client_id=").append(clientId);
        url.append("&redirect_uri=").append(redirectUri);
        url.append("&response_type=code");
        response.sendRedirect(url.toString());
    }

    @GetMapping("/callback/kakao")
    public void kakaoCallback(@RequestParam("code") String code) {
        userService.kakaoLogin(code);
    }

//    @PostMapping("/create-user")
//    public CreateUserRequestDto createUser(@RequestBody CreateUserRequestDto request) {
//        return userService.createUser(request);
//    }

}
