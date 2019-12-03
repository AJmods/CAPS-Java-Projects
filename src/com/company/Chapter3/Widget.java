package com.company.Chapter3;

public class Widget {

    int numWidget;

    public Widget(int numWidget)
    {
        this.numWidget = numWidget;
    }
    public int calcDays()
    {
        return (int) (Math.round(calcHours()/16));
    }
    private double calcHours()
    {
        return numWidget/10;
    }
}
