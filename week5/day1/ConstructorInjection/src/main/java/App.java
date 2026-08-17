import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
        context.close();
    }
}
