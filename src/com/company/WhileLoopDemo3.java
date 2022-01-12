package com.company;

public class WhileLoopDemo3 {
    public static void main(String[] args) {

        int age = 4;
        if (age >=4){
            System.out.println("one should go to school");
        }

        while( age <=18 ){
            System.out.println("Age: " +age+ " one should be in school");
            age= age+1;
        }
    }
}
