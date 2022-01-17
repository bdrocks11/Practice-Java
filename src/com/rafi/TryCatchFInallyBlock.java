package com.rafi;

public class TryCatchFInallyBlock {
    static void myMethod (int testnum) throws Exception{
        System.out.println("start - myMethod");
        if (testnum == 12)
            throw new Exception();
        System.out.println("end - myMethod");
        return;
    }

    public static void main(String[] args) {
        int testnum = 12;
        try{
            System.out.println("try - first statement");
            myMethod(testnum);
            System.out.println("try - last statement");

        }
        catch (Exception ex){
            System.out.println("An exception");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("out of try/catch/finally - statement");
    }
}

/* flow of control in try/catch/finally blocks:
1. if exception occurs in try block's  body then control immediately
transferred (skipping rest of the statements in try block) to the
catch block. once catch block finished execution then finally block
and after that rest of the program.


2. if there is no exception occurred in the code which is present
in try block then first, the try block gets executed completely and then
control gets transferred to finally block (skipping catch blocks)

3. if a return statement is encountered either in try or catch block.
in this case finally block runs. control first jumps to finally, and then
it returned, back to return statement.

 */