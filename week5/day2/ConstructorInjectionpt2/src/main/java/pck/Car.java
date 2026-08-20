package pck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    String model;
    int price;
    @Autowired
    Engine engine;

    @Autowired
    public Car(@Value("Mustang") String model, @Value("50000") int price, Engine engine) {
        this.model = model;
        this.price = price;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "pck.Car Model: " + model +
                "\nPrice: " + price +
                "\npck.Engine: " + engine;
    }
}
