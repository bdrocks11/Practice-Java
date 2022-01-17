package com.rafi;

public class FinallyControlStatement {
    public static void main(String[] args) {

        System.out.println(FinallyControlStatement.myMethod());
    }

    public static int myMethod() {

        try {
            return 112;
        } finally {
            System.out.println("This is Finally block");
            System.out.println("Finally block ran even after return statement");
        }
    }
}
/* statements present in the finally block execute even if
the try block contains control transfer statements like return,
break or continue.
 */

/* cases when the finally block doesnt execute:
1. death of a thread
2. using of the System.exit() method.
3. due to an exception arising in the finally block.
 */