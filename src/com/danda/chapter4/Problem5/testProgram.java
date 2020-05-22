package com.danda.chapter4.Problem5;

import java.util.Scanner;

public class testProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter endbalance");
        double eb = scanner.nextDouble();
        System.out.println("Enter check count");
        double checks = scanner.nextDouble();
        BankCharges bankCharges = new BankCharges(eb,checks);
        System.out.println("Fee is " + bankCharges.getFees());
    }
}
