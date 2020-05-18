package com.danda.chapter11.eleven1;

import java.awt.*;
import java.util.Date;

public class GeometricObject {

    private String color="";
    private boolean filled=false;
    private Date dateCreated;

    public GeometricObject() {
        color = "";
        filled = false;
        dateCreated = new Date();
    }


    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public GeometricObject(String color) {
        this.color = color;
        this.filled = false;
        dateCreated = new Date();
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color=" + color +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

}
