package com.danda.chapter8;

import java.util.Scanner;

public class eight1 {

    public static void main(String[] args) {
        System.out.println("Enter in a 3 by 4 matrix row by row");
        Scanner scanner = new Scanner(System.in);
        double[][] arr = new double[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter arr[" + i + "][" + j + "]");
                arr[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Sum of column " + i + " = " + sumRow(arr,i));
        }

    }
    public static double sumRow(double[][] arr, int row)
    {
        double sum = 0;
        for (double[] d : arr) {
            sum+=d[row];
        }
        return sum;
    }
    public static double sumArray(double[] arr)
    {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        return sum;
    }
}
