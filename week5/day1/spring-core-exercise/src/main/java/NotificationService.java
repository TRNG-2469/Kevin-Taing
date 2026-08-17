public class NotificationService {
    private final EmailSender emailSender;

    public NotificationService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void notifyUser(String recipient, String alert) {
        emailSender.send(recipient, alert);
    }
}