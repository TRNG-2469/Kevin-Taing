import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Employee employee() {
        return new Employee(2, "Henry", 500, address());
    }

    @Bean
    public Address address() {
        return new Address("Houston", "Texas", 12321);
    }
}
