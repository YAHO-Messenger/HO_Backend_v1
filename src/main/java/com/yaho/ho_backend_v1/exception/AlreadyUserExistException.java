package com.yaho.ho_backend_v1.service;

public class AlreadyUserExistException extends RuntimeException {
    public AlreadyUserExistException() {
        super("AlreadyUserExist");
    }
}
