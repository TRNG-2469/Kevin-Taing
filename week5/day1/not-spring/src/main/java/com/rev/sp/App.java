package com.rev.sp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
    static void main(String[] args) {
//        BaseBallCoach baseBallCoach = new BaseBallCoach();
//        System.out.println(baseBallCoach.getDailyWorkout());
//
//        SwimCoach swimCoach = new SwimCoach();
//        System.out.println(swimCoach.getDailyWorkout());
//        // Create a Spring container by using Beanfactory or ApplicationContext
//
//        // 1. Create the BeanFactory container
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//
//        // 2. Create a reader to parse the XML metadata
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//
//        // 3. Load the ocnfiguration file into the factory
//        reader.loadBeanDefinitions(new ClassPathResource("myConfigation.xml"));

        // Create a Spring Container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myConfiguration.xml");
        BaseBallCoach coach = context.getBean("bbCoach", BaseBallCoach.class);
        BaseBallCoach coach1 = context.getBean("bbCoach", BaseBallCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach);
        System.out.println(coach1);
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(swimCoach.getDailyWorkout());
        context.close();
    }
}
