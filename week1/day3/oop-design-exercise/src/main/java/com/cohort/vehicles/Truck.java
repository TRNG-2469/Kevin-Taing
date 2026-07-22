package com.cohort.vehicles;

public class Truck extends Vehicle implements Driveable {

    public Truck(String model) {
        super(model);
    }

    @Override
    public void accelerate() {
        this.speed += 10.0;
        System.out.println("The truck accelerate by 10, making its current speed " + this.speed);
    }

    @Override
    public void start() {
        System.out.println("The truck starts");
    }

    @Override
    public void soundHorn() {
        System.out.println("[TRUCK HORN] HONK HONK!");
    }
}
