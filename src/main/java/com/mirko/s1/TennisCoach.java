package com.mirko.s1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // define a constructor
    public TennisCoach() {
        System.out.println(">> Tennis Coach: inside default constructor");
    }

    // define init method
    @PostConstruct
    public void init() {
        System.out.println(">>TennisCoach inside of init method");
    }

    // define destroy method
    @PreDestroy
    public void destroy() {
        System.out.println(">>TennisCoach inside of destroy method");
    }

    /*
    // define a setter
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService) {
        System.out.println(">> inside doSomeCrazytuff method");
        fortuneService = theFortuneService;
    }
    */
    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    */

    public String getDailyWorkout() {
        return "practice your backhand";
    }

    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

}
