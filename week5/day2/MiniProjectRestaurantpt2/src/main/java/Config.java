import org.springframework.context.annotation.Bean;

public class Config {
    @Bean("italianRest")
    public Restaurant italianRest() {
        return new Restaurant("Italinia Basic", "123 Street", chef("John", "Italian"));
    }

    @Bean("indianRest")
    public Restaurant indianRest() {
        return new Restaurant("India Basic", "122 Street", chef("Raj", "Indian"));
    }

    public Chef chef(String name, String speciality) {
        return new Chef(name, speciality);
    }
}
