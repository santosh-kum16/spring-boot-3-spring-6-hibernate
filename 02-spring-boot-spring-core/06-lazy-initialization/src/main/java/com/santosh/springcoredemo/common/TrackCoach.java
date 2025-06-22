package com.santosh.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
/*
* mark this class as @Lazy- So it is not injecting TrackCoach and not initialized automatically it would be
* available when it needs.
* */
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5000!!!";
    }
}
