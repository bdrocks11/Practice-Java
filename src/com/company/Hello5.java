package com.company;
import java.util.*;
public class Hello5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter first number");
        int num1 = in.nextInt();

        System.out.println("enter second number");
        int num2 = in.nextInt();


            System.out.println("choose operator *,/");
            char operator = in.next().charAt(0);
            switch (operator){
                case '*':
                    multiplication(num1, num2);
            break;
                case '/':
                    division( num1, num2);
break;



        }
    }
    public static void multiplication (int num1, int num2) {
        int answer =  num1 * num2;
        System.out.println("equals to " + answer);
    }
    public static void division (int num1,int num2){
        int answer =  num1/num2;
        System.out.println("equals to " + answer);

    }
}
