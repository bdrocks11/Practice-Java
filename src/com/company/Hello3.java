package com.company;

public class Hello3 {
    public static void main(String[] args) {

        int num = 18;
        String name = "Abu";
        char firstInitial = 'A';
        boolean isMale = true;

        //System.out.println(num);
        //System.out.println(name);
        //System.out.println(firstInitial);
        //System.out.println(isMale);

        if (name.equals("Abu")) {
            System.out.println("Hello Abu");
        } else {
            System.out.println("Wrong person");
        }
        while (num >= 18) {
            System.out.println("You are considered an adult");
            num = 0;
        }
        }
    }

