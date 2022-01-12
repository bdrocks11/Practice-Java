package com.company;

public class ForLoopDemo5 {

    public static void main(String[] args) {
        int age = 1;

        for (age = 1; age <= 21; age++) {
            age = age +2;
            System.out.println("age: " +age+ ", starting from age 1 until age 21 there will be a vacation every 3 years");
        }
    }
}