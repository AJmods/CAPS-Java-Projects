package com.danda.chapter5;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class five25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of iterations to calculate PI");
        int iterations = input.nextInt();
        System.out.println(calcPi(iterations));
    }
    public static BigDecimal calcPi(int numberOfSeries)
    {
        BigDecimal pi = new BigDecimal("0");
        for (int i = 1; i <= numberOfSeries; i++)
        {
            BigDecimal i2 = new BigDecimal(Integer.toString(i)); //i in bigDecimal form
            //These three lines do: ((-1)^(i+1))/(2i-1).  The equation for PI
            BigDecimal numberToAdd = new BigDecimal("-1").pow(i+1);
            BigDecimal divisor = new BigDecimal("2").multiply(i2).subtract(new BigDecimal("1"));
            numberToAdd = numberToAdd.divide(divisor, MathContext.DECIMAL128);
            pi = pi.add(numberToAdd);
        }
        return pi.multiply(new BigDecimal("4")); //multiply it by 4 cause that's how you calculate PI
    }
}
