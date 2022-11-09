package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1Controller {
    
    @GetMapping("/name")
    public String name(){
        return "junxian428";
    }
}
