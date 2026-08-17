import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        context.close();
    }
}
