import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        NotificationService ems = context.getBean("nsems", NotificationService.class);
        ems.messageService.sendMessage("ems");
        NotificationService sms = context.getBean("nssms", NotificationService.class);
        sms.messageService.sendMessage("sms");
        context.close();
    }
}