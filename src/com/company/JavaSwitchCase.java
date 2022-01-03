package com.company;

public class JavaSwitchCase {
    public static void main(String[] args) {

        int num =2;
        switch (num+2)
        {
            case 1:
                System.out.println ("case1: Value is: " +num);
            case 2:
                System.out.println ("case2: Value is: " +num);
            case 3:
                System.out.println ("case3: Value is: " +num);
            default:
                System.out.println ("Default: Value is: " +num);
        }
    }
}
