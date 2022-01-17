package com.rafi;

public class ExceptionInTryCatch {
    public static void main(String[] args) {

        int x = 0;
        int y = 10;
         try {
             int num = y/x;
             System.out.println("next statement: Inside try block");
         }
         catch ( Exception ex)
         {
             System.out.println("Exception occured");
         }
        System.out.println("next-statement: Outside of try- catch");
    }
}
/* there are two statements present inside try block. since exception occurred
because first statement, the second statement didn't execute. Hence, we can
conclude that if an exception occurs then the rest of the try block doesn't
execute and control passes to catch block.
 */