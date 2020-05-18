package com.danda.chapter9.nine1;

public class testProgram {

    public static void main(String[] args) {
        Rectangle one = new Rectangle(4,40);
        Rectangle two = new Rectangle(3.5,35.9);

        System.out.println("Rectangle one height is " + one.getHeight());
        System.out.println("Rectangle one width is " + one.getWidth());
        System.out.println("Rectangle one Area is " + one.getArea());
        System.out.println("Rectangle one Perimeter is " + one.getPerimeter());

        System.out.println("Rectangle two height is " + two.getHeight());
        System.out.println("Rectangle two width is " + two.getWidth());
        System.out.println("Rectangle two Area is " + two.getArea());
        System.out.println("Rectangle two Perimeter is " + two.getPerimeter());
    }
}
