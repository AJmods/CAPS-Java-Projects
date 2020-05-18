package com.danda.chapter6;

import java.util.Scanner;

public class six17 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                int number = (int) Math.round(Math.random());
               System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
