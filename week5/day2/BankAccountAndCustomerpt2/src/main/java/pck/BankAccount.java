package pck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BankAccount {
    int accountNumber;
    double balance;
    @Autowired
    Customer customer;

    @Autowired
    public BankAccount(@Value("123") int accountNumber, @Value("100")double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "pck.BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}
