package com.danda.chapter5;

public class five18 {

    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
            //System.out.println("i: " + i);
        }
        System.out.println("Pattern B");
        for (int i = 6; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
            //System.out.println("i: " + i);
        }
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++)
        {
            for (int j = 6; j >= 1; j--)
            {
                if (j>i) System.out.print("  "); //two spaces
                else System.out.print(j + " "); //number and one space
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        int loopCount=6;
        for (int i = loopCount; i >=1; i--)
        {
            for (int i2 = 0; i2 < (loopCount-i); i2++) System.out.print("  "); //add spaces before numbers
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
