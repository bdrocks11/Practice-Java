package com.practiceSunday;

public class ConditionOperatorSunday {
    public static void main(String[] args) {
        int num =  999;

        if (num < 100 && num >= 1) {
            System.out.println("its  a two digit number");
        } else if (num <1000 && num >= 100){
            System.out.println("its a three digit number");
        }
    }

}
