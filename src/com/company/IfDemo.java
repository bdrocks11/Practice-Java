package com.company;

public class IfDemo {

    public static void main(String[] args) {
        int num = 18;
        String name = "Abu";
        char firstInitial = 'A';
        boolean isMale = true;

        if (name.equals("Abu")) {
            // "equals" is a method which is being called by an object
            //named "name" object type "String"
            System.out.println("Hello Abu");
        } else System.out.println("Wrong person");
    }
}

