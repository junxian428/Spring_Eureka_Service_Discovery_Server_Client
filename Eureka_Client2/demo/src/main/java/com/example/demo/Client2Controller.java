package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client2Controller {
    @GetMapping("/name")
    public String name(){
        return "user2";
    }
}
