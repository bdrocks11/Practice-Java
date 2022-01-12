package com.company;

public class IfDemo1 {
    public static void main(String[] args) {

        String name = "Rafi";
        if (name == "Rafi") {
            // == is another way to call an object instead of calling it
            // equals.(objectname).
            System.out.println("Hello Rafi");
        } else System.out.println("Wrong person");
    }

}
