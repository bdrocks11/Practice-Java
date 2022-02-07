package com.practiceSunday;

public class CharToStringSunday {

    public static void main(String[] args) {

        // method 1 toString
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("String is: " + str);

        // method 2 using value of

        String str2 = String.valueOf(ch);
        System.out.println("String is: " + str2);

    }
}
