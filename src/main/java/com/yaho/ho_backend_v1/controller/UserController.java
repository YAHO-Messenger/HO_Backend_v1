package com.yaho.ho_backend_v1.controller;

import com.yaho.ho_backend_v1.entity.User.User;
import com.yaho.ho_backend_v1.entity.User.UserRepository;
import com.yaho.ho_backend_v1.payload.RegisterRequest;
import com.yaho.ho_backend_v1.service.register.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;


    private final RegisterService registerService;

    @RequestMapping("/")
    public String main(){
        return "아직 만드는중";
    }

    @PostMapping("/Register")
    public String register(@RequestBody @Valid RegisterRequest request) {
        return registerService.register(request);
    }


    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> user) {
        User member = userRepository.findByEmail(user.get("email"))
                .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 email 입니다."));
                     userRepository.findByPassword(user.get("password"))
                .orElseThrow(() -> new IllegalArgumentException("비밀번호가 옳바르지않습니다."));
        return "success";
    }

}
