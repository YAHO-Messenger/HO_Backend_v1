package com.yaho.ho_backend_v1.payload.Request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class RegisterRequest {

    @Size(min = 6,max = 10)
    private String id;

    @Size(min = 8,max = 12)
    private String pw;

    @Size(min = 1,max = 12)
    private String name;

    private String phoneNumber;
}
