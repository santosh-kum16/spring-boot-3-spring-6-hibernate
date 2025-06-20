package com.santosh.springboot.demo.myspringbootapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    // "/" forward slash will return "Hello RestController"

    @GetMapping("/")
    public String sayHello(){
        return "Hello RestController";
    }
}
