package com.danda.chapter3;

public class problem1 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacuring", "Engineer");

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

    }
}
