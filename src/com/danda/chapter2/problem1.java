package com.danda.chapter2;

import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("enter name");
       String name = scanner.next();
       System.out.println("enter age");
       int age = scanner.nextInt();
       System.out.println("enter annual pay");
       double annualPay = scanner.nextDouble();

       System.out.println("My name is " + name + ", my age is " + age + " and");
       System.out.println("I hope to earn $" + annualPay + " per year");
    }
}
