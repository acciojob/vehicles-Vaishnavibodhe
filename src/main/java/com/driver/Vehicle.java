package com.driver;

public class Vehicle {

    private String name;
    double currentSpeed;
    private double currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;

    }



    public void steer(int direction){
        this.currentDirection += direction;
    }

    public void move(int speed, int direction){
        this.currentSpeed = speed;
        this.currentDirection = direction;
    }

    public void stop(){
        this.currentSpeed = 0;

    }

}
