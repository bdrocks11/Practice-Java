package com.company;
import java.util.*;
public class LearnWithSana {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number");

        int num1 = in.nextInt();

        System.out.println("Enter second number");

        int num2 = in.nextInt();

        System.out.println("Enter operator +,-,/,*");
        char operator = in.next().charAt(0);
        switch (operator) {
            case '+':
                addition(num1, num2);
                break;
            case '-':
                substration(num1,num2);
                break;
            case '*':
                multiplication(num1,num2);
                break;
            case '/':
                division(num1,num2);
                break;
            default:
                System.out.println("invalid operator");

        }
    }
    public static void addition (int num1, int num2){
        int answer = num1+num2;
        System.out.println ("the sum of the number is equal to "+ answer);
    }
    //multiplication

    public static void multiplication (int num1,int num2){
        int answer = num1 * num2;
        System.out.println("the sum of answer " + answer);
        }

// division

public static void division (int num1, int num2){
int answer = num1/num2;
System.out.println ("the sum of division is " + answer);
}

//subtraction

public static void substration (int num1, int num2) {
int answer = num1 - num2;
System.out.println ("Answer to the substracted number " + answer);
}
}