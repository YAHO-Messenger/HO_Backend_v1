package com.yaho.ho_backend_v1.payload.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TokenResponse {
    private String acessToken;
    private String refreshToken;
    private String tokenexpired;
}
