package com.yaho.ho_backend_v1.controller;

import com.yaho.ho_backend_v1.payload.Request.RegisterRequest;
import com.yaho.ho_backend_v1.service.Register.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final RegisterService registerService;

    @PostMapping("/Register")
    public String register(@RequestBody @Valid RegisterRequest request) {
        return registerService.register(request);
    }

}
