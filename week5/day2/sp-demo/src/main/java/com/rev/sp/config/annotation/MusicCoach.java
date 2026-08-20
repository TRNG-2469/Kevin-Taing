package com.rev.sp.config.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicCoach {
    @Autowired
    SymphonyFortune symphonyFortune;

//    public MusicCoach(SymphonyFortune symphonyFortune) {
//        this.symphonyFortune = symphonyFortune;
//    }

    public String getDailyWorkout() {
        return "Practice your scales for 30 minutes.";
    }

    public String getDailyFortune() {
        return symphonyFortune.getDailyFortune();
    }
}
