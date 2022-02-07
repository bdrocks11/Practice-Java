package com.practiceSunday;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Hello5Sunday {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");

        int num1 = in.nextInt();

        System.out.println("Enter second number");
        int num2 = in.nextInt();

        System.out.println("Choose method of Calculation from + and -");
        char operator = in.next().charAt(0);
switch (operator){
case '+' :
addition (num1,num2);
break;
case '-' :
subtraction (num1,num2);
break;
}
}
public static void addition(int num1, int num2) {
    int answer = (num1 + num2);
    System.out.println("sum of both number equals : " + answer);
}
public static void subtraction(int num1, int num2){
    int answer = (num1-num2);
    System.out.println("subtracts to : " + answer);
    }
}
