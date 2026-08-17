import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public EmailSender emailSender() {
        return new EmailSender();
    }

    @Bean
    public NotificationService notificationService(EmailSender emailSender) {
        return new NotificationService(emailSender);
    }
}
