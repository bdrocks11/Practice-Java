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
        }
    }
    public static void addition (int num1, int num2){
        int result = num1+num2;
        System.out.println("both number add to : " + result);
    }

}
