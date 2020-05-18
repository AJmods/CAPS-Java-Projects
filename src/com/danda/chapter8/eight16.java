//package com.danda.chapter8;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//
//public class eight16 {
//
//    public static void main(String[] args) {
//        double[][] nums = new double[][] {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
//        System.out.println("ordinal array is");
//        for (double[] num : nums) {
//            System.out.println(num[0] + ", " + num[1]);
//        }
//        Arrays.sort(nums, Comparator.comparingDouble(o -> o[0]));
//        List<List<double[][]>> moreNums = new ArrayList<>();
//        int listNumber = 0;
//        double currentNum=0;
//        double oldcurrentNum = 0;
//        moreNums.add(new ArrayList<>());
//        for (int i = 0; i < nums.length; i++)
//        {
//            currentNum = nums[i][1];
//            if (currentNum == oldcurrentNum) moreNums.get(i).add(new double[]{})
//        }
//        System.out.println("sorted array is");
//        for (double[] num : nums) {
//            System.out.println(num[0] + ", " + num[1]);
//        }
//    }
//}
