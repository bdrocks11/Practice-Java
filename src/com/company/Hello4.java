package com.company;
import java.util.*;
public class Hello4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter first number");

        int num1 = in.nextInt();

        System.out.println("enter second number");

        int num2 = in.nextInt();
        add (num1,num2);
    }


        public static void add (int num1, int num2){

            int answer = num1 + num2;
            System.out.println("sum of the number is " + answer);



    }


    }

