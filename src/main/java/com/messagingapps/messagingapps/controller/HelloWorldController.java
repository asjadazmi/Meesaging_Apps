package com.messagingapps.messagingapps.controller;


import com.messagingapps.messagingapps.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "hello from "+name;
}




}
