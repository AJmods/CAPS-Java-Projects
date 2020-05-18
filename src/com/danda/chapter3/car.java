package com.danda.chapter3;

public class car {

    int yearModel;
    String make;
    int speed;

    public car(int yearModel, String make)
    {
        this.yearModel = yearModel;
        this.make = make;
        speed=0;
    }

    public void accelerate() {speed+=5;}
    public void brake() {speed-=5;}
    public String getMake() {
        return make;
    }
    public int getYearModel() {
        return yearModel;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }
}
