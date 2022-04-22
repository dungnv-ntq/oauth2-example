package com.dung.Oauth2ClientExample.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/api/secured")
    @PreAuthorize("hasRole('user')")
    public String secured() {
        return "this is secured api";
    }
}
