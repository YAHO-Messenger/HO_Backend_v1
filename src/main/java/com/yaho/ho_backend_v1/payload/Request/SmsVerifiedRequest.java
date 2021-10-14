package com.yaho.ho_backend_v1.payload.Request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SmsVerifiedRequest {

    private String phoneNumber;

    private String code;
}
