package com.example.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class mainController {
    @GetMapping("")
    public String SayHello(){
        return "Hello World!!!. This is to test a build from a commit";
    }
}
