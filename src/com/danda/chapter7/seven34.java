package com.danda.chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class seven34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String ans = scanner.next();
        System.out.println("String sorted is: " + sortString(ans));
    }
    public static String sortString(String string)
    {
        char[] chars = string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return charsToString(chars);
    }
    public static String charsToString(char[] chars)
    {
        StringBuilder sb = new StringBuilder();
        return sb.append(chars).toString();
    }
}
