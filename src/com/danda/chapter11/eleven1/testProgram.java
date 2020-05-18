package com.danda.chapter11.eleven1;

import java.util.Scanner;

public class testProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Enter Triangle Color");
        triangle.setColor(scanner.next());
        System.out.println("Enter Triangle filled value (0 for false and 1 for true)");
        int answer = scanner.nextInt();
        triangle.setFilled((answer==0) ? false : true);
        System.out.println("Enter Triangle side 1 length");
        triangle.setSide1(scanner.nextDouble());
        System.out.println("Enter Triangle side 2 length");
        triangle.setSide2(scanner.nextDouble());
        System.out.println("Enter Triangle side 3 length");
        triangle.setSide3(scanner.nextDouble());
        System.out.println("Triangle info");
        System.out.println(triangle.toString());

    }
}
