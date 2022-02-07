package com.programiz.date;

public class LargestNumber {
    public static void main(String[] args) {
        // declaring double types of variables

        double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

        // check if n1 is greater than or equal to n2;

        if (n1 >= n2) {

            // if... else statement inside the if block
            // checks if n1 is greater than or equal to n3;

            if (n1 >= n3) {
                largest = n1;
            } else {
                largest = n3;
            }
        }
            else {
                if (n2>=n3){
                    largest = n2;

                }
                else{
                    largest = n3;
                }

            }

        System.out.println("largest number " + largest);
            }
}
