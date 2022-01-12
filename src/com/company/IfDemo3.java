package com.company;

public class IfDemo3 {
    public static void main(String[] args) {
        System.out.println("my name is Rafi");

        int num;
        num = 2;
//^ had to declare num as a local variable then declare the value to num.
if (num == 1){
            System.out.println("hi");
        }else
    System.out.println("why cant we use int == 1?");
    }

}
