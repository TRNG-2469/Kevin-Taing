public class EmailMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("EmailMessageService " + message);
    }
}
