package com.programiz.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class CurrentDateTimeLocalizedStyle {
    public static void main(String[] args) {

        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formatted = current.format(formatter);

        System.out.println("Current date is " + formatted);
    }
}
// COULD ALSO BE WRITTEN TO GET (SHORT INSTEAD OF MEDIUM)