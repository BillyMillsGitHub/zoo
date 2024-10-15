package com.example.application.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zooController {

    @GetMapping("/welcome")
    public String sayHello() {
        return "Hello from the zoo!";
    }
}
