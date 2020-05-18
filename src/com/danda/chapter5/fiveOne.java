package com.danda.chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class fiveOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result;
        double positives = 0;
        double negatives = 0;
        double total = 0;
        System.out.println("Enter an integer and press Enter to separate them and enter the integer 0 when done with inputting integers");
        do {
            result = input.nextInt();
            total+=result;
            if (result > 0) positives++;
            else if (result < 0) negatives++;

        } while (result != 0);
        double average = total/(positives+negatives); //number of positives + number of negatives is the amount of numbers in the set.
        System.out.println("the number of positives is " + positives);
        System.out.println("the number of negatives is " + negatives);
        System.out.println("the total is " + total);
        System.out.printf("The average is %2.2f", average);
    }
}
