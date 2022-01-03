package com.company;

public class CharToString {
    public static void main(String[] args) {
        // method one using toString () method

        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("String is: " +str);

        //method two using value of() method

    String str2 = String.valueOf(ch);
    System.out.println ("String is: " + str2);

    }
}
