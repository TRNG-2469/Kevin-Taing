import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Course course() {
        return new Course(6, "Math", "3 days");
    }
    @Bean
    public Student student() {
        return new Student(2, "Jacob", course());
    }
}
