package com.danda.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class eleven13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i+1));
            nums.add(scanner.nextInt());
        }
        removeDuplicates(nums);
    }

    public static void removeDuplicates(ArrayList<Integer> list)
    {
        ArrayList<Integer> betterList = new ArrayList<>();
        for (Integer integer : list)
        {
            if (!isDuplicate(betterList, integer)) betterList.add(integer);
        }
        for (Integer integer : betterList)
        {
            System.out.println(integer);
        }
        System.out.println("YEA");
    }
    public static boolean isDuplicate(ArrayList<Integer> list, Integer num) {
        for (Integer integer : list) {
            if (integer.equals(num)) return true;
        }
        return false;
    }
}
