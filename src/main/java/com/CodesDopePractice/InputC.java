package com.CodesDopePractice;

import java.util.Scanner;

public class InputC {
    public static void main(String[] args) {

InputC obj = new InputC();
obj.scannerClass();

    /* in this we will see how to input, taking a value from user is quite easy.
    you just have to write a statement, and it's done.
     */

        // need to input Scanner class and create containers for input.

        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();    // s is the object of Scanner class.

/* statement n = s.nextInt() is used to input an integer value from the user and
assign it to the variable n.
nextInt(), is a method of the object s of the scanner class.
 */
    }
    public static void scannerClass(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter an integer");
        int a;
        a= s1.nextInt();
        System.out.println("The number entered is " + a);
    }
}
