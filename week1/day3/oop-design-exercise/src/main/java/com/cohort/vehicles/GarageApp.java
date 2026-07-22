package com.cohort.vehicles;

public class GarageApp {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Truck truck = new Truck("Ford");

        car.start();
        truck.start();

        car.accelerate();
        truck.accelerate();

        car.soundHorn();
        truck.soundHorn();

        car.stop();
        truck.stop();
    }
}
