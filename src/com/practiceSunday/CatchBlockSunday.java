package com.practiceSunday;

public class CatchBlockSunday {
    public static void main (String [] args ){
        int x = 10;
        int y = 10;

        try{
            int num = x/y;
            System.out.println("next - statement : Inside try block");

            //we are dividing 10/10; in the try block, if it works it will print out
            //the line "inside try block"
        }
        catch (Exception e){
            System.out.println("Exception");

            // if 10/10 is a problem then this exception block will be displayed.

        }
        System.out.println("next statement: outside of try-catch");
    // this always prints out regardless of problems, because it is outside try block.
    }
}
