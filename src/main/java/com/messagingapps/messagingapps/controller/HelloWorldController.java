package com.messagingapps.messagingapps.controller;


import com.messagingapps.messagingapps.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
@PutMapping("/put/{firstName}")
public String creatingRequestBody(@PathVariable String firstName,@RequestParam String lastName){
    return "my name is "+firstName+" "+lastName;

}

}
