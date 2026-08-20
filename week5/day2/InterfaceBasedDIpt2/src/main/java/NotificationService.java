public class NotificationService {
    MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }
}
