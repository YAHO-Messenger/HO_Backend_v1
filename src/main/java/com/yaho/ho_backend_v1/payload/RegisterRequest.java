package com.yaho.ho_backend_v1.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class RegisterRequest {

    @Email
    private String email;

    @Size(min = 8,max = 12)
    private String password;

    @Size(min = 1,max = 10)
    private String name;

}
