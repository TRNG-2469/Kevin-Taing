import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        NotificationService notificationService = context.getBean("notificationService", NotificationService.class);
        notificationService.notifyUser("trainee@jfsd.com", "XML Config Successful!");

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        NotificationService notificationService1 = context.getBean("notificationService", NotificationService.class);
        notificationService1.notifyUser("trainee@jfsd.com", "Java Config Successful!");
        NotificationService notificationService2 = context.getBean("notificationService", NotificationService.class);
        System.out.println("Are NotificationService instances identical? " + (notificationService1 == notificationService2));
    }
}
