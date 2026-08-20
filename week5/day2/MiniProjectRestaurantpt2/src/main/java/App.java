import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Restaurant italianRest = context.getBean("italianRest", Restaurant.class);
        Restaurant indianRest = context.getBean("indianRest", Restaurant.class);
        System.out.println(italianRest);
        System.out.println(indianRest);
    }
}
