package com.rafi;

public class TryCatchFinallyExceptionProperly {

    // when exception occurs in try block and handled properly in catch block

    public static void main(String[] args) {
        try {
            System.out.println("First statement of try block");
            int num = 45/0;
            System.out.println(num);

        }
        catch (ArithmeticException e){
            System.out.println("ArithmethicException");
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("out of try-catch-finally block");
    }

}
