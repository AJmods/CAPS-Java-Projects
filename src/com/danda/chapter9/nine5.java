package com.danda.chapter9;

import java.util.Date;
import java.util.GregorianCalendar;

public class nine5 {

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date()); //set calenter to today
        System.out.println("Today's date is " + calendar.get(GregorianCalendar.MONTH) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" + calendar.get(GregorianCalendar.YEAR));
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("1234567898765L's date is " + calendar.get(GregorianCalendar.MONTH) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" + calendar.get(GregorianCalendar.YEAR));
    }
}
