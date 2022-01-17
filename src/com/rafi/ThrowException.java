package com.rafi;

public class ThrowException {

    static void checkEligibility (int stuage, int stuweight) {

        if (stuage < 12 && stuweight < 40 ) {

            throw new ArithmeticException("Student is not eligible for registration");
        }
        else {
            System.out.println("Student entry is Valid");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Registration process!");
        checkEligibility(10,39);
        System.out.println("Have a nice day..");
    }
}

/* above example, we check the student age:
if the student age is below 12 and weight is below 40
then the program should return that student is not eligible for registration
 */

/* also we have throw an unchecked exception, same way we can throw unchecked
and user defined exception as well.
 */