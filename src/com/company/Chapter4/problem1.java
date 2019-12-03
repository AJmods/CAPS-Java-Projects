package com.company.Chapter4;

import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 1-10");
            number = scanner.nextInt();
            if (number <1 || number >10)
            {
                System.err.println("ERROR: NUMBER OUT OF RANGE!  try again");
            }
        } while (number <1 || number >10);


        String Rnumber="";

        switch (number)
        {
            case 1 : Rnumber="I"; break;
            case 2 : Rnumber="II"; break;
            case 3 : Rnumber="III"; break;
            case 4 : Rnumber="IV"; break;
            case 5 : Rnumber="V"; break;
            case 6 : Rnumber="VI"; break;
            case 7 : Rnumber="VII"; break;
            case 8 : Rnumber = "VIII"; break;
            case 9 : Rnumber = "IX"; break;
            case 10 : Rnumber = "X"; break;
        }
        System.out.println(number + " in Roman Numerals is: " + Rnumber);
    }
}
