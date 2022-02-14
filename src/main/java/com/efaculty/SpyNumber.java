package com.efaculty;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        //todo code application logic here

        int r,n,num,mul = 1, sum =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number =");

        n = sc.nextInt();

        num =n;
        while (num > 0)
        {
            r= num % 10;
            sum = sum + r;
            mul = mul * r;
            num = num /10;

        }
        if (mul == sum){
            System.out.println("Spy number");
        }
        else {
            System.out.println("Not spy number");
        }
    }
}
/*

A spy number is a number where the sum of its digits equals the
product of its digits. For example, 1124 is a spy number, the sum of its digits
 is 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.
 */