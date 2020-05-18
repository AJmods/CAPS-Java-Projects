package com.danda.chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class seven3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lots of integers, enter 0 when done");
        int answer;
        List<Integer> answers = new ArrayList<>();
        do {
            answer = scanner.nextInt();
            answers.add(answer);
        } while (answer != 0);
        int[] instances = countInstances(answers);
        printInstances(instances);

    }
    //enters
    public static int[] countInstances(int[] nums)
    {
        //goes from 1-100.  instances[0] =0;
        int[] instances = new int[101];
        instances[0] = 0;
        for (int i = 0; i <=100; i++)
        {
            for (int j = 0; j < nums.length-1; j++)
            {
                if (nums[j]==i)
                {
                    instances[i] = instances[i]+=1;
                }
            }
        }
        return instances;
    }
    public static int[] countInstances(List<Integer> nums)
    {
        //convert list<Integer> to int[].
        return countInstances(nums.stream().mapToInt(i->i).toArray());
    }
    public static void printInstances(int[] instances)
    {
        for (int i = 0; i < instances.length; i++)
        {
            if (instances[i] > 0) System.out.println(i + " occurs " + instances[i] + " times");
        }
    }
}
