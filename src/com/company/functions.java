package com.company;

import java.util.Scanner;

public class functions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length, then width");
        double w = scanner.nextDouble();
        double l = scanner.nextDouble();
        System.out.println("Area: " + getRectArea(l,w));
    }

    public static double getRectArea(double l, double w)
    {
        return l*w;
    }
}
