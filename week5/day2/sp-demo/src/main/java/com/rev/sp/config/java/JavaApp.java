package com.rev.sp.config.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        context.close();
    }
}
