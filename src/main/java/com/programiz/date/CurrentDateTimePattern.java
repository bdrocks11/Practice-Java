package com.programiz.date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimePattern {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        // LocalDateTime  is part of java.time

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:ss.SSS");
// above we wrote the pattern we want the time and date to be displayed;

        String formatted = current.format(formatter);

        System.out.println("current date time is  " + formatted);
    }
}
