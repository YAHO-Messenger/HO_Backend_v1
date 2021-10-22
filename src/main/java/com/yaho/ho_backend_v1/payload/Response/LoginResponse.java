package com.yaho.ho_backend_v1.payload.Response;

import com.yaho.ho_backend_v1.entity.User.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LoginResponse {
    private boolean isSuccess;
    private User user;
}
