package com.company;

public class Math {

        public static int addition (int a, int b) {
    int sum = a+b;

    return sum;

    }

public static void main (String[] args) {
    int num1 = 3;
            int num2= 4;
            Math obj = new Math();

            int result = obj.addition(num1,num2);
    System.out.println("sum is: " + result);

        }
    }

