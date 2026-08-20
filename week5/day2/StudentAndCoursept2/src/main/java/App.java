import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        context.close();
    }
}
