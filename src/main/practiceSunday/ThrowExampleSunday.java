package com.rafi;

public class ThrowExampleSunday{
    void checkAge (int age){
        if (age < 18)
            throw new ArithmeticException("Not eligible for voting");
        else
            System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {
        ThrowExampleSunday obj = new ThrowExampleSunday();
        obj.checkAge(13);
        System.out.println("End of Program");
    }
}