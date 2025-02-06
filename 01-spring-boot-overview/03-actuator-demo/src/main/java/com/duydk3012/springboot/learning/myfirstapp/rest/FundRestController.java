package com.duydk3012.springboot.learning.myfirstapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundRestController {

    //    expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {

        return "Hello abc";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    //expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
}
