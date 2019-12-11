package com.company.Chapter4;

import com.company.Chapter4.problem11.InternetProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem12 {

    public static ArrayList<Double> charges = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select program");
        String program = input.next();
        InternetProvider internetProvider = new InternetProvider(program);
        System.out.println("Enter hours");
        int hours = input.nextInt();
        charges = internetProvider.getAllCharges(hours);
        if (program.equalsIgnoreCase("A"))
        {
            System.out.println("total charge for package A is: $" + charges.get(0));
            System.out.println("if you choose package B the total charge is $" + charges.get(1));
            System.out.println("if you choose package C the total charge is $" + charges.get(2));
            if (charges.get(0) > charges.get(1))
            {
                System.out.println("You will save $" + (charges.get(0) - charges.get(1)) + " if you choose package B");
            }
            if (charges.get(0) > charges.get(2))
            {
                System.out.println("You will save $" + (charges.get(0) - charges.get(2)) + " if you choose package C");
            }
        }
        if (program.equalsIgnoreCase("B"))
        {
            System.out.println("total charge for package B is: $" + charges.get(1));
            System.out.println("if you choose package C the total charge is $" + charges.get(2));
            if (charges.get(1) > charges.get(2))
            {
                System.out.println("You will save $" + (charges.get(0) - charges.get(2)) + " if you choose package C");
            }
        }
        else {
            System.out.println("total charge for package " + program + " is: $" + internetProvider.getCharge(hours));
        }
    }
}
