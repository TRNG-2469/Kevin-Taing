package com.rev.sp.config.java;

public class CricketCoach {

    CricketFortune cricketFortune;

    public CricketCoach(CricketFortune cricketFortune) {
        this.cricketFortune = cricketFortune;
    }

    public String getDailyWorkout() {
        return "Practice Fielding....";
    }

    public String getDailyFortune() {
        return cricketFortune.getDailyFortune();
    }
}
