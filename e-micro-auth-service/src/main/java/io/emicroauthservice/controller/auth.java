package io.emicroauthservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/auth")
public class auth {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String Auth() {
        return "Rendering from auth client";
    }

}