package com.cohort.vehicles;

public class Car extends Vehicle implements Driveable{

    public Car(String model) {
        super(model);
    }

    @Override
    public void accelerate() {
        this.speed += 20.0;
        System.out.println("The car accelerate by 20, making its current speed " + this.speed);
    }

    @Override
    public void start() {
        System.out.println("The car starts");
    }
}
