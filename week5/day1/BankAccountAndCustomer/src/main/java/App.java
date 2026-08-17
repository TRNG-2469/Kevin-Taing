import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        BankAccount bankAccount = context.getBean("bankAccountConstructor", BankAccount.class);
        BankAccount bankAccount1 = context.getBean("bankAccountSetter", BankAccount.class);
        System.out.println(bankAccount);
        System.out.println(bankAccount1);
        context.close();
    }
}
