package com.danda.chapter8;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class eight32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] points = new double[3][2];
        for (int i = 0; i < points.length; i++) {
            System.out.println("Enter x" + i);
            points[i][0] = scanner.nextDouble();
            System.out.println("Enter y" + i);
            points[i][1] = scanner.nextDouble();
        }
        System.out.println("Area is: " + getTriangleArea(points));
    }
    public static double getTriangleArea(double[][] points)
    {
        double area = ((points[0][0]*(points[1][1]-points[2][1]))+(points[1][0]*(points[2][1]-points[0][1]))+(points[2][0]*(points[0][1]-points[1][1])))/2;
        return area;
    }
}
