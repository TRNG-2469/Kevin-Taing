package pck;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BankAccount bankAccount = context.getBean("bankAccount", BankAccount.class);
        System.out.println(bankAccount);
        context.close();
    }
}
