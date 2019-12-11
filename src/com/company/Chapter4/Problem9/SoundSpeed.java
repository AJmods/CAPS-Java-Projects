package com.company.Chapter4.Problem9;

public class SoundSpeed {

    final int AIR_SPEED = 1100;
    final int WATER_SPEED = 4900;
    final int STEEL_SPEED = 16400;
    double distance;

    public SoundSpeed(double distance)
    {
        this.distance = distance;
    }

    public double getSpeedInAir()
    {
        return distance/AIR_SPEED;
    }
    public double getSpeedInWater()
    {
        return distance/WATER_SPEED;
    }
    public double getSpeedInASteel()
    {
        return distance/STEEL_SPEED;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getAirSpeed() {
        return AIR_SPEED;
    }

    public int getSteelSpeed() {
        return STEEL_SPEED;
    }

    public int getWaterSpeed() {
        return WATER_SPEED;
    }
}
