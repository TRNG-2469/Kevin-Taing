import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("nsems")
    public NotificationService nsems() {
        return new NotificationService(emailMessageService());
    }

    @Bean("nssms")
    public NotificationService nssms() {
        return new NotificationService(sMSMessageService());
    }

    @Bean
    public EmailMessageService emailMessageService() {
        return new EmailMessageService();
    }

    @Bean
    public SMSMessageService sMSMessageService() {
        return new SMSMessageService();
    }
}
