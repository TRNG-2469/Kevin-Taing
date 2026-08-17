public class Car {
    String model;
    int price;
    Engine engine;

    public Car(String model, int price, Engine engine) {
        this.model = model;
        this.price = price;
        this.engine = engine;
    }

    //Expected Output
    //Car Model: Honda City
    //Price: 1500000
    //Engine: Petrol
    //Horse Power: 120
    @Override
    public String toString() {
        return "Car Model: " + model +
                "\nPrice: " + price +
                "\nEngine: " + engine;
    }
}
