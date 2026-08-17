import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myConfiguration.xml");
        Student stuConstructor = context.getBean("stuConstructor", Student.class);
        Student stuSetter = context.getBean("stuSetter", Student.class);

        System.out.println(stuConstructor);
        System.out.println(stuSetter);

        context.close();
    }
}
