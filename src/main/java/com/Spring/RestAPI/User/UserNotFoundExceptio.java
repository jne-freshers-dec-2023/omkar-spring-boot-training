package com.Spring.RestAPI.User;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) //it will thorw not found in status...
public class UserNotFoundExceptio extends RuntimeException {
    public UserNotFoundExceptio(String s) {
        super(s);
    }
}
