package com.rafi;

public class CatchTryException {

    public static void main(String[] args) {
        int num1, num2;

        try{
            num1=0;
            num2=62 / num1;
            System.out.println("Hey I' m at the end of try block");
        /* we suspect that this block of statement can throw exception
        so, we handled it by placing these statements inside try and handled
        the exception in catch block
         */
        }
catch (ArithmeticException e){
            /* this block will only execute if any Arithmetic exception
            occurs in try block
             */
    System.out.println("you should not divide a number by zero");
        }
        catch (Exception e){

            /* this is a generic exception handler which means it can make
      handle all the exceptions. this will execute if the exception is not handled
      by previous catch blocks.
             */
            System.out.println("Exception occured");

        }
        System.out.println( "I'm out of try-catch block in Java");
    }
}
