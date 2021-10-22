package com.yaho.ho_backend_v1.service.Auth;

import com.yaho.ho_backend_v1.payload.Request.LoginRequest;
import com.yaho.ho_backend_v1.payload.Response.TokenResponse;

public interface AuthService {
    TokenResponse Login(LoginRequest request);
    TokenResponse refreshToken(String receivedToken);
}
