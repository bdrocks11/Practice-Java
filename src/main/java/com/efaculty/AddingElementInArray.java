package com.efaculty;

import java.util.Scanner;

public class AddingElementInArray {
    public static void main(String[] args) {

        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter the number ar[" + i + "]:");
            arr[i] = sc.nextInt();

        }
        int n = arr.length;

        int newarr[] = new int[n + 1];
        System.out.println("Enter position:");
        int pos = sc.nextInt();
        System.out.println("Enter number to be insert:");
        int x = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (i < pos - 1) {
                newarr[i] = arr[i];
            } else if (i == pos - 1) {
                newarr[i] = x;
            } else {
                newarr[i] = arr[i - 1];
            }
        }
        System.out.println("Adding Element in New Array:");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(newarr[i]);
        }
    }
}