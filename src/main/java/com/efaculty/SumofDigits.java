package com.efaculty;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        // to do code application logic here

        int r, n, num,
                sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        n = sc.nextInt();
        num = n;
        while (num > 0){
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        System.out.println("Sum of digit " +sum);
    }
}
