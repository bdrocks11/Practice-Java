package com.programiz.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimePredefinedConstants {
    public static void main(String[] args) {


        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted = current.format(formatter);
        System.out.println("Current date is " + formatted);
    }

    }

