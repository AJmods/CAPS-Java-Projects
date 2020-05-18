package com.danda.chapter2;

import java.util.Scanner;

public class problem12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a city");
        String city = scanner.next();

        System.out.println("Number of characters: " + city.length());
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println("First letter: " + city.charAt(0));
    }
}
