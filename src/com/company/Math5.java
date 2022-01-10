package com.company;
import java.util.Scanner;
public class Math5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter first digit");

        int num1 = in.nextInt();

        System.out.println("enter second digit");

        int num2 = in.nextInt();

        System.out.println("choose which operator you would like to use for your sum from :  -,+,/,*");
        char operator = in.next().charAt(0);

        switch (operator) {
            case '+':
            addition(num1,num2);
            break;
            case '*':
            multiplication(num1,num2);
            case '-':
                subtraction(num1,num2);
            case'/':
                division(num1,num2);
             break;
            default:
                System.out.println("invalid request");

        }
    }
    public static void addition (int num1, int num2){
        int result = num1+num2;
        System.out.println("both number add to : " + result);
    }
public static void multiplication (int num1, int num2){
        int result = num1*num2;
    System.out.println("multiplies to: " + result);
}
public static void subtraction (int num1, int num2){
        int result = num1-num2;
    System.out.println("difference is: " + result);
}
public static void division (int num1, int num2){
        int result = num1/num2;
    System.out.println("equals : " + result);
}
}
