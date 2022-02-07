package com.programiz.date;

import org.joda.time.LocalDate;

import java.time.Month;

public class Birthday {
    public static void main(String[] args) {

        // declare variable for B-day

        int birthDate = 28;
        Month birthMonth = Month.DECEMBER;

        // get current date

        LocalDate currentDate = LocalDate.now();
        System.out.println("The Date is " + currentDate);

        // get current date and month

        int date = currentDate.getDayOfMonth();
        Month month = Month.of(currentDate.getMonthOfYear());

         if (date == birthDate && month == birthMonth) {
            System.out.println("Happy Birthday to you!!");
        } else {
            System.out.println("Not your Birthday");
        }
    }
}
