package com.danda.chapter7;

import java.util.*;

public class seven19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lots of integers, enter 0 when done");
        int answer;
        List<Integer> answers = new ArrayList<>();
        do {
            answer = scanner.nextInt();
            if (answer != 0) answers.add(answer);
        } while (answer != 0);
        if (isSorted(answers)) System.out.println("the list is sorted");
        else  {
            System.out.println("The list is not sorted");
            Collections.sort(answers);
            System.out.println("Sorted List:");
            printList(answers);
        }
    }
    public static void printList(List list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
    public static boolean isSorted(int[] nums)
    {
        int[] nums2 = nums.clone();
        Arrays.sort(nums2);
        return Arrays.equals(nums, nums2);
    }
    public static boolean isSorted(List<Integer> list) {
        List<Integer> list2 = new ArrayList<>(list);
        Collections.sort(list);
        return list.equals(list2);
    }
}
