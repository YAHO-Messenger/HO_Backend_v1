package com.yaho.ho_backend_v1.controller;

import com.yaho.ho_backend_v1.entity.User.User;
import com.yaho.ho_backend_v1.entity.User.UserRepository;
import com.yaho.ho_backend_v1.jwt.JwtTokenProvider;
import com.yaho.ho_backend_v1.payload.RegisterRequest;
import com.yaho.ho_backend_v1.service.register.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final JwtTokenProvider jwtTokenProvider;
    private final UserRepository userRepository;


    private final RegisterService registerService;

    @PostMapping("/Register")
    public String register(@RequestBody @Valid RegisterRequest request) {
        return registerService.register(request);
    }


    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> user) {
        User member = userRepository.findByEmail(user.get("email"))
                .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 email 입니다."));
        return jwtTokenProvider.createToken(member.getUsername(), member.getRoles());
    }

}
