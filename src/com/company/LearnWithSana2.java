package com.company;
import java.util.*;
public class LearnWithSana2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println ("Enter the Number ");
        int num = in.nextInt();

        if (num >= 90){
        System.out.println("A+");
    }
        else if (num >=80 && num<=89) {
            System.out.println ("A");
        }
        else if (num >=70 && num <=79){
            System.out.println("B+");
        }
        else if (num >=60 && num <= 69){
            System.out.println ("B");}
            else if (num >=50 && num <=59){
                System.out.println ("C");
            }
            else if (num >=40 && num <=49){
                System.out.println ("D");
            }
            else if (num >= 0 && num <=39){
                System.out.println ("Fail");
            }
        }
}
