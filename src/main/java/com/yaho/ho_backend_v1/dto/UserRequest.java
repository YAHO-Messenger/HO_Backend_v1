package com.yaho.ho_backend_v1.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UserRequest {

    private String Id;

    private String Pw;
}
