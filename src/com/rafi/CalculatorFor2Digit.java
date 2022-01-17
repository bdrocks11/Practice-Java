package com.rafi;
import java.util.Scanner;
public class CalculatorFor2Digit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter first number");

        int num1 = in.nextInt();

        System.out.println("enter second number");
        int num2 = in.nextInt();

        System.out.println("Enter calculation method +,-,*,/");

        char operator = in.next().charAt(0);

        switch (operator) {
            case '+': 
                addition(num1, num2);
                break;
            case'*':
                multiplication (num1,num2);
                break;
        }
    }
public static void addition (int num1, int num2){
    int result = num1+num2;
            System.out.println("total is " + result );

    }
    public static void multiplication(int num1, int num2){
        int answer = num1*num2;

        System.out.println("multiplies to " + answer);


    }
}
