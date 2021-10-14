package com.yaho.ho_backend_v1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "AlreadyUserExist")
public class AlreadyUserExistException extends RuntimeException{

}
