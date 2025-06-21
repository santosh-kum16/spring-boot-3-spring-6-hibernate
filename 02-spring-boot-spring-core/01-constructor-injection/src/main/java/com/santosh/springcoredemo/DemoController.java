package com.santosh.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    // define a private field for the dependency injection

    @Autowired  //@Autowire annotation tells Spring to Inject a dependency
    public DemoController(Coach theCoach){
        // If you only have one constructor then @Autowired on constructor is optional
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDilyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
