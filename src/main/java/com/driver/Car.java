package com.driver;

public class Car extends Vehicle {
    private boolean currentGear;



    public Car(String name, boolean currentGear) {
            super(name);
            this.currentGear = currentGear;
    }

    public void changeGear(boolean newGear){

            this.currentGear = newGear;
    }

    public void changeSpeed(int newSpeed, int newDirection){

            move(newSpeed, newDirection);
    }
}
