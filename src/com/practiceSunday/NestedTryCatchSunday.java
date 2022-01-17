package com.practiceSunday;

public class NestedTryCatchSunday {
    public static void main(String[] args) {
        try{
            // above try is the parent try block, below try will be nested in parent.

            try {
                System.out.println("Inside block one");
                int b = 45/0;
                System.out.println(b);
            }
            catch (ArithmeticException e1){
                System.out.println("exception e1");

            }

            // this try block is also nested with parent try block.
            try {
                System.out.println("Inside block two");
                int b = 45/0;
                System.out.println(b);
            }
            catch (ArrayIndexOutOfBoundsException e2){
                System.out.println("Exception e2");
            }
            System.out.println("Just other statements");
        }
        catch (ArithmeticException e3){
            System.out.println("Arithmetic exception");
            System.out.println("Inside parent try catch block");
        }
        catch (ArrayIndexOutOfBoundsException e4){
            System.out.println("ArrayIndexOutOfBounds Exception");
            System.out.println("Inside parent try catch block");
        }
        catch (Exception e5){
            System.out.println("Exception");
            System.out.println("Inside Parent try catch block");


        }
        System.out.println("next statement");
    }

}
