package pck;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
        context.close();
    }
}
