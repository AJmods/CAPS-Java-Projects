package com.company.Chapter3;

public class Circle {

    double r;
    final double pi = Math.PI;

    public Circle(double r)
    {
        this.r=r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    public double getArea()
    {
        return pi * Math.pow(r,2);
    }
    public double getDiameter()
    {
        return 2*r;
    }
    public double getCircumference()
    {
        return getDiameter() * pi;
    }
}
