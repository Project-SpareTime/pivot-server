package com.projectsparetime.pivotserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcome() {
        return "welcome to pivot server";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello endpoint is working";
    }
}
