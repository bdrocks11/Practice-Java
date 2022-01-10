package com.company;

// not my work
public class SumOfAB {
    public int addNumbers (int a, int b) {
        int sum = a+b;

        return sum;

    }

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 15;

        SumOfAB obj = new SumOfAB();

        int result = obj.addNumbers(num1,num2);
        System.out.println("sum is: " +result);
    }

}
