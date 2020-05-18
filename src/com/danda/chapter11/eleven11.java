package com.danda.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class eleven11 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i+1));
            nums.add(scanner.nextInt());
        }
        sort(nums);

    }

    public static void sort(ArrayList<Integer> list)
    {
       int[] arr = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(arr);
        System.out.println("Numbers in sorted order");
        for (int integer : arr)
        {
            System.out.println(integer);
        }
    }
}
