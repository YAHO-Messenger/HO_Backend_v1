package com.yaho.ho_backend_v1.service;

import com.yaho.ho_backend_v1.payload.RegisterRequest;

public interface RegisterService {
    String register(RegisterRequest request);
}