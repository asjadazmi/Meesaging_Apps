package com.messagingapps.messagingapps.controller;


import com.messagingapps.messagingapps.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {


    @GetMapping("/web/{firstName}/{lastName}")
    public String sayHello(@PathVariable String firstName,@PathVariable String lastName){
        return "my  name is"+firstName+lastName;
    }


}
