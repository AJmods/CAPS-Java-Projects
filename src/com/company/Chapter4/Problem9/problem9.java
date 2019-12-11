package com.company.Chapter4.Problem9;

import java.util.Scanner;

public class problem9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Distance:");
        double distance = scanner.nextDouble();
        SoundSpeed soundSpeed = new SoundSpeed(distance);
        int choice;
        do {
            System.out.println("Enter 0 for air speed, 1 for water, 2 for steel");
            choice=scanner.nextInt();
        } while (choice<0 || choice > 2);

        if (choice==0) System.out.println(distance + " in air speed is " + soundSpeed.getSpeedInAir() + "mph");
        else if (choice==1) System.out.println(distance + " in water speed is " + soundSpeed.getSpeedInWater() + "mph");
        else if (choice==2) System.out.println(distance + " in steel speed is " + soundSpeed.getSpeedInASteel()+ "mph");
    }
}
