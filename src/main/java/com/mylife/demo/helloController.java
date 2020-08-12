package com.mylife.demo;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping("/")
    public String sayhi(){
        return"Hello, I am SAKIF Nabil from morocco. I am a software engineer";
    }
}

