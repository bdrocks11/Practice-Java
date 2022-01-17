package com.practiceSunday;

public class MultipleExceptionSunday {
    public static void main(String[] args) {
        try {
            int arr [] = new int[7];
            arr[4]=30/0;
            System.out.println("Last Statement of try block");

        }
    catch (ArithmeticException e){
        System.out.println("you should not divide a number by zero");

    }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing array elements outside of the limit");
        }
        catch (Exception e){
            System.out.println("Some other Exception");
        }
        System.out.println("out of try-catch block");
    }
}
