package com.danda.chapter2;

import java.util.Scanner;

public class problem13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("enter collage");
        String collage = scanner.next();
        System.out.println("Enter profession");
        String profession = scanner.next();
        System.out.println("Enter an animal");
        String animal = scanner.next();
        System.out.println("Enter animal's name");
        String petName = scanner.next();

        System.out.println("There was once a person named " + name + " who lived in " + city + ".  At the age of " + age + ",");
        System.out.println(name + " went to collage at " + collage + ".  " + name + "graduated and went to work as a");
        System.out.println(profession + ".  Then, " + name + " adopted a(n) " + animal + " named " + petName + ".  They both lived");
        System.out.println("happy every after");
    }
}
