import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        NotificationService ems = context.getBean("nsems", NotificationService.class);
        ems.messageService.sendMessage("ems");
        NotificationService sms = context.getBean("nssms", NotificationService.class);
        sms.messageService.sendMessage("sms");
        context.close();
    }
}