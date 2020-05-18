package com.danda.chapter6;

import java.time.LocalDate;
import java.util.TimeZone;

public class six24 {

    public static void main(String[] args) {
        System.out.println("Current Date is");
        displayCurrentDateAndTime();
    }
    public static void displayCurrentDateAndTime()
    {
//        System.out.println(LocalDate.now(
//                TimeZone.getDefault().toZoneId()
//        ).atStartOfDay(
//                TimeZone.getDefault().toZoneId()
//        ));
       System.out.println(java.time.LocalDateTime.now());
    }
}
