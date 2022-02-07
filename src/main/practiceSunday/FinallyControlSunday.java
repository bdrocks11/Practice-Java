package com.practiceSunday;

public class FinallyControlSunday {
    public static void main(String[] args) {

        System.out.println(FinallyControlSunday.myMethod());
    }
    public static int myMethod(){
        try {
            return 112;

        }
        finally {
            System.out.println("this is finally block");
            System.out.println("Finally block runs even after return statement");
        }
    }
}
