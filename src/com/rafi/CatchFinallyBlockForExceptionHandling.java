package com.rafi;

public class CatchFinallyBlockForExceptionHandling {

    public static void main(String[] args) {

        int x = 10;
        int y = 10;
        try{
            int num = x/y;
            System.out.println("next- statement: Inside try block");

        }
        catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println("next-statement: Outside of try-catch");

    }


}
/* when exception doesn't occur:
when statements that are present in try block doesn't throw any exception
then first, the body of try block executes and then the code after catch
blocks. in this catch block it never runs as they are meant to run when an
exception occurs
 */

// above example exception didn't occur in try block so catch block didn't run.