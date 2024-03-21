package com.spring.SpringSecurity.Resource;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class CsrfTockenResource {

    @GetMapping("/csrf")
    public CsrfToken getCsrf(HttpServletRequest httpRequest){
        return (CsrfToken) httpRequest.getAttribute("_csrf");
    }
}
