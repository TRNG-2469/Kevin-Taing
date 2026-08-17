import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("--- Container Bootstrapped ---");
        ConnectionPool conPool = context.getBean("conPool", ConnectionPool.class);
        conPool.executeQuery("executeQuery(\"SELECT * FROM users\")");
        System.out.println("--- Closing Container ---");
        context.close();
    }
}
