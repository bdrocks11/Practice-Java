package com.company;

import java.util.Scanner;
public class Hello6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println( "Enter first number");
    int num1 = in.nextInt();
        System.out.println("Enter second number");
        int num2 = in.nextInt();

        System.out.println("choose operator +,-,*,/");
                char operator = in.next().charAt(0);
        switch (operator) {
            case '+':
                addition(num1, num2);
                break;
            case '-':
                subtraction(num1, num2);
                break;
            default:
                System.out.println("invalid operator");
        }
    }
        public static void addition (int num1, int num2){
    int answer =num1+num2;
            System.out.println("the sum of the answer is " + answer);
}
public static void subtraction (int num1, int num2){
        int answer = num1 - num2;
    System.out.println("total is " + answer);
}
}