package pck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    String type;
    int horsePower;

    @Autowired
    public Engine(@Value("V8") String type,
                  @Value("450") int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "pck.Engine: " + type +
                "\nHorse Power: " + horsePower;
    }
}
