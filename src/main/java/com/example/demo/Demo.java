package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/Hello")
    public String hello(){
        return "Hello EveryOne";
    }
    @PostMapping("post")
    public String helloUser(@RequestBody User user){
        return "Hello " +user.getFirstName() + " "+user.getLastName();
    }

}
