package com.lpastine.springcoredemo.rest;

import com.lpastine.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    // 1) Create setter method(s) in your class for injections
    // 2) Configure the dependency injection with Autowired Annotation
    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
