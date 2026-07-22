class Vehicle {}
class Car extends Vehicle {}
class Airplane extends Vehicle {}

public class AirportApp {
    public static void main(String[] args) {
        Vehicle myVehicle = new Airplane();

        // Safely check type before casting
        if (myVehicle instanceof Car) {
            Car myCar = (Car) myVehicle;
            System.out.println("Vehicle downcasted successfully.");
        } else {
            System.out.println("Vehicle is not a Car. It is an " + myVehicle.getClass().getSimpleName());
        }
    }
}