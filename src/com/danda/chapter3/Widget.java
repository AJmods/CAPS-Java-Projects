package com.danda.chapter3;

public class Widget {

    double numWidget;

    public Widget(int numWidget)
    {
        this.numWidget = numWidget;
    }
    public int calcDays()
    {

        return (int) Math.ceil(calcHours()/16);
    }
    private double calcHours()
    {
        return numWidget/10;
    }
}
