package com.danda.chapter4.problem11;

import java.util.Scanner;

public class Problem11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select program");
        String program = input.next();
        InternetProvider internetProvider = new InternetProvider(program);
        System.out.println("Enter hours");
        int hours = input.nextInt();
        System.out.println("total charge is: $" + internetProvider.getCharge(hours));
    }
}
