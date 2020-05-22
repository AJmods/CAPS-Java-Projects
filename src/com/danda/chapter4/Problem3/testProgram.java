package com.danda.chapter4.Problem3;

import java.util.Scanner;

public class testProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score 1");
        double score1=scanner.nextDouble();
        System.out.println("Enter score 2");
        double score2=scanner.nextDouble();
        System.out.println("Enter score 3");
        double score3=scanner.nextDouble();

        TestScores testScores = new TestScores(score1,score2,score3);

        System.out.println("Average is " + testScores.getAverage());
        System.out.println("grade is " + testScores.getLetterGrade());
    }
}
