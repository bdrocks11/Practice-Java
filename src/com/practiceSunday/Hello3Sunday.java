package com.practiceSunday;

public class Hello3Sunday {
    public static void main(String[] args) {

        int num = 18;
        String name = "Abu";
        char firstInitial = 'A';
        boolean isMale = true;
        if (name == "Abu") {
            System.out.println("hello Abu");
        } else {
            System.out.println("Wrong person");
        }
        while (num >= 18) {
            System.out.println("you are considered an adult");
            num = 0;
            // num is set to 0 to stop the loop; or else it wil be on going,
            // for while loop always need a false statement to stop the loop.
        }
    }
}
