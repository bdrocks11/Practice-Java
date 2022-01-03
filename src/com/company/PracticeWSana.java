package com.company;
import java.util.*;
public class PracticeWSana {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println ("Enter first number");

        int num1= in.nextInt();

        System.out.println("Enter second number");

        int num2= in.nextInt();
        addition(num1,num2);
        multiplication(num1,num2);
        substration(num1,num2);
        division (num1,num2); }
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