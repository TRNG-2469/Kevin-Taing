package com.rev.sp;

public class SwimCoach implements Coach {

    OkFortune of = new OkFortune();

    public String getDailyWorkout() {
        return "Swim 5 Laps...";
    }

    @Override
    public String getFortune() {
        return of.getFortune();
    }
}
