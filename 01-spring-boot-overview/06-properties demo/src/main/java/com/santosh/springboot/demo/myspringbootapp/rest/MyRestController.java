package com.santosh.springboot.demo.myspringbootapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    //inject properties for: developer.name and title.name
    @Value("${developer.name}")
    private String developerName;

    @Value("${title.name}")
    private String titleName;

    //Expose new end points for developer info
    @GetMapping("/developerinfo")
    public String getDeveloperInfo(){
        return "Developer: "+developerName + "Title name: " + titleName;
    }


    // "/" forward slash will return "Hello RestController"
    @GetMapping("/")
    public String sayHello(){
        return "Hello RestController";
    }

    // Expose a new endpoint for "/autoload"
    @GetMapping("/autoload")
    public String getAutoLoad(){
        return "Just checkin Live Reloading or not when devtools added";
    }

    // Expose a new endpoint for "/fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is Your Lucky Day!!!";
    }
}
