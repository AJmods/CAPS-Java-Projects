package com.danda.chapter9.nine9;

public class testProgram {

    public static void main(String[] args) {
        RegularPolygon[] polygons = new RegularPolygon[3];
       polygons[0] = new RegularPolygon();
       polygons[1] = new RegularPolygon(6,4);
       polygons[2] = new RegularPolygon(10,4,5.6,7.8);

       for (int i = 0; i < polygons.length; i++)
       {
           System.out.println("Polygon " + i + " perimeter is " + polygons[i].getPerimeter());
           System.out.println("Polygon " + i + " area is " + polygons[i].getArea());
       }
    }
}
