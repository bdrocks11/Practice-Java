package com.practiceSunday;

public class ThrowExampleSunday1 {
    void checkAge (int age){
        if (age < 18)
            throw new ArithmeticException("checking");
        else
            System.out.println("vote");

    }

    public static void main(String[] args) {
        ThrowExampleSunday1 obj = new ThrowExampleSunday1();
        obj.checkAge(13);
        System.out.println("end of prog" );
    }
}
// with ThrowExampleSunday.. (checkAge) didnt work
// because (obj) didn't register it.