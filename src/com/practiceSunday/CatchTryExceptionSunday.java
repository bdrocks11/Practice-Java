package com.practiceSunday;

public class CatchTryExceptionSunday {
    public static void main(String[] args) {

        int num1,num2;

        try {

            num1 = 0;
            num2 = 62 / num1;

            System.out.println("Hey i am at the end of try block");
        }
        catch (ArithmeticException e){
            System.out.println("you should not divide a number by zero");

        }
        catch (Exception e){

            System.out.println("Exception Occurred");
        }
        System.out.println(" i am out of try- catch block in java");
    }
}
