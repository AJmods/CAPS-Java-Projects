package com.company;

import java.util.Scanner;

public class Arrays {

    public static Scanner input = new Scanner(System.in);

    public static String[][] classRoom;
    public static String[] tNames;

    public static void main(String[] args) {

        System.out.println("Class room Student Storage program");

        while (true)
        {
            System.out.println("Select Operation:");
            System.out.println("0: Make Array");
            System.out.println("1: Search array");
            int choice = input.nextInt();
            if (choice==0) MakeArray();
            else if (choice == 1) SearchArray();
        }

    }
    public static void MakeArray()
    {
        System.out.println("Enter Classroom Count");
        int rowCount = input.nextInt();
        System.out.println("Enter Students per classroom count");
        int colCount = input.nextInt();

        classRoom = new String[rowCount][colCount];
        tNames = new String[rowCount];

        for (int i =0; i < classRoom.length; i++)
        {
            System.out.println("Enter Teacher name for classroom " + i);
            tNames[i] = input.next();
        }
        for (int i =0; i < classRoom.length; i++) for (int j = 0; j < classRoom[0].length; j++)
        {
            System.out.println("Enter Student " + j + "'s name for " + tNames[i] + "'s class");
            classRoom[i][j] = input.next();
        }

        System.out.println("Here's your array: ");
        printArray(classRoom, tNames, "'s classroom roster");
    }
    public static void SearchArray()
    {
        printArray(classRoom,tNames, "'s classroom roster");

        System.out.println("Select classroom, then student");
        System.out.println();
        for (int i =0; i < classRoom.length; i++)
        {
            System.out.println(i + ": " + tNames[i] + "'s classroom");
        }
        System.out.println("Please select Classroom");
        System.out.println(classRoom.length);
        int classRoomNum = input.nextInt();
        if (classRoomNum > classRoom.length-1)
        {
            System.out.println("You suck");
            return;
        }
        for (int i =0; i < classRoom[0].length; i++)
        {
            System.out.println(i + ": " + classRoom[classRoomNum][i]);
        }
        System.out.println("Please select student");
        int student = input.nextInt();
        if (student > classRoom[0].length-1)
        {
            System.out.println("You suck");
            return;
        }
        System.out.println(classRoom[classRoomNum][student] + " from " + tNames[classRoomNum] + "'s class selected");

    }
    public static void printArray(String[][] arr, String[] rowNames, String rowName2)
    {
        for (int i =0; i < arr.length; i++)
        {
            System.out.println(rowNames[i] + rowName2 + ": ");
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
