package com.mirko.s1;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${myEmail}")
    private String myEmail;

    @Value("${myTeam}")
    private String myTeam;

    public String getEmail() {
        return myEmail;
    }

    public String getTeam() {
        return myTeam;
    }

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Swim 1000 metres as a warm up";
    }

    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
