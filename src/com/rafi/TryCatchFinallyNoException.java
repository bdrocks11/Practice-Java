
/* the following example demonstrate the working of finally block when
no exception occurs in try block.
 */


package com.rafi;

public class TryCatchFinallyNoException {
    public static void main(String[] args) {

        try {
            System.out.println(" First statement of try block");
            int num = 45/3;
            System.out.println(num);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");

        }
        finally {
            System.out.println("Finally block");

        }
        System.out.println("Out of try-catch-finally block");
    }
}
