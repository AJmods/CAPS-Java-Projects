package com.danda.chapter9.nine1;

public class Rectangle {

    private double width=1;
    private double height=1;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }
    public double getPerimeter()
    {
        return (width*2) + (height*2);
    }
}