package com.rev.sp;

public class BaseBallCoach implements Coach {

    HappyFortune hf = new HappyFortune();

    public BaseBallCoach(HappyFortune hf) {
        this.hf = hf;
    }

    public String getDailyWorkout() {
        return "Run 5K";
    }

    @Override
    public String getFortune() {
        return hf.getFortune();
    }

    public void myInit() {
        System.out.println("Initializing.");
    }

    public void myCleanUp() {
        System.out.println("Cleaning up.");
    }
}
