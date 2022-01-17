package com.company;

public class ForLoopDemo9 {

    public static void main(String[] args) {

        int age = 5;
        // we want to travel every 4 years to a different country starting age 5;

        for (age = 5; age <=37; age++){
            System.out.println("Age: " + age + ", traveling every four years");
           age = age + 3;

        }
    }
}
