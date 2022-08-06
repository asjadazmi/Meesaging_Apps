package com.messagingapps.messagingapps.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = {"","/","/web"})
    public String sayHello(){
        return "Hello from bridgelabz";
    }

}
