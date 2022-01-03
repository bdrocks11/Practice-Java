package com.company;
import java.util.Scanner;
public class AlgebraUsingScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Input First Number: ");
        int num1 = in.nextInt();

        System.out.print("Input Second Number: ");
                int num2= in.nextInt();

                System.out.println (num1 + "x" + num2 + " = " + num1 * num2);
    }
}
