package com.danda.chapter6;

import java.util.Scanner;

public class six2 {

    public static void main(String[] args) {
        System.out.println("Enter an Integer");
        Scanner input =  new Scanner(System.in);
        long n = input.nextLong();
        System.out.println("Sum of digits is: " + sumDigits(n));
    }
    public static int sumDigits(long n) //This method converts the number into a string, then splits it into characters and adds them together.
    {
        int total = 0;
        String nString = Long.toString(n);

        for (int i = 0; i < nString.length(); i++)
        {
            total += Character.getNumericValue(nString.charAt(i));
        }
        return total;
    }
}
