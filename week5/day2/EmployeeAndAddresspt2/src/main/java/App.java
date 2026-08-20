import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        context.close();
    }
}
