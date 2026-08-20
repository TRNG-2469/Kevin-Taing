package pck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    int customerId;
    String name;
    String email;

    @Autowired
    public Customer(@Value("12") int customerId, @Value("John") String name, @Value("email@email.com") String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "pck.Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
