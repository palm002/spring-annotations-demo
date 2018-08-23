package com.mirko.s1;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {"Beware", "Diligence", "Reward"};

    // create RNG
    private Random myRNG = new Random();

    public String getDailyFortune() {

        int index = myRNG.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}
