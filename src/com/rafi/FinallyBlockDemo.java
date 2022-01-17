package com.rafi;

public class FinallyBlockDemo {
    public static void main(String[] args) {

        try{
            int num = 121/0;
            System.out.println(num);
        }
        catch (ArithmeticException e){
            System.out.println("Number should not be divided by zero");

        }
        /*finally block will always execute
        even if there is no exception in try block
         */
        finally {
            System.out.println("this is finally block");

        }
        System.out.println("out of try-catch-finally");
    }
}


/* A Finally-block must be associated with a try block,
you cannot use finally without a try block.
you should place those statements in this block that must be executed always.
 */
/* Finally-block is optional, because a try catch block is sufficient
for (exception) handling, however if you place a Finally-block then
it will always run after the execution of try block.
 */
/* an Exception in the Finally-block,
behaves exactly like any other exception
 */
