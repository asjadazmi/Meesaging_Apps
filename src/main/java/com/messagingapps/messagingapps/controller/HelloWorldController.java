package com.messagingapps.messagingapps.controller;


import com.messagingapps.messagingapps.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
@PostMapping("/web")
public String creatingRequestBody(@RequestBody Student student){
    return "my name is "+student.getFirstName()+" "+student.getLastName();
}

}
