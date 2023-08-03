package com.driver;

public class F1 extends Car{

    public F1(String name, boolean currentGear) {
        super(name, currentGear);

    }

    public void accelerate(double rate){
        this.currentSpeed += rate;
        // Add logic here to change the gear accordingly based on rate and F1's acceleration capabilities
        // For simplicity, I'll just set the gear to 6 for demonstration purposes.
    }
}
