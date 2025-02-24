package com.duydk.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    //define init method
    @PostConstruct
    public void doStartupStuff() {
        System.out.println("In doStartupStuff(): " + this.getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("In doCleanupStuff(): " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
