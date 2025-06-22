package com.santosh.springcoredemo.rest;

import com.santosh.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    // define a private field for the dependency injection

    @Autowired
    public void setCoach(Coach theCoach){   //Stter injection
        myCoach = theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDilyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
