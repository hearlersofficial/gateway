package com.hearlers.gateway.presentations.rest.auth;

import com.hearlers.gateway.applications.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @Value("${kakao.client_id}")
    String clientId;
    @Value("${kakao.redirect_uri}")
    String redirectUri;


    @GetMapping("/login/kakao")
    public String kakao() {
        StringBuffer url = new StringBuffer();
        url.append("https://kauth.kakao.com/oauth/authorize?");
        url.append("client_id=").append(clientId);
        url.append("&redirect_uri=").append(redirectUri);
        url.append("&response_type=code");
        return "redirect:" + url;
    }

    @GetMapping("/callback/kakao")
    public void callback(@RequestParam("code") String code) {
        userService.kakaoLogin(code);
    }

}
