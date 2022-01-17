package com.rafi;

public class MultipleException3 {
    public static void main(String[] args) {


        try {
            int arr[] = new int[7];
            arr[10] = 10 / 5;
            System.out.println("Last Statement of try block");

        }
        //catch (Exception e) {
            //System.out.println("Some other Exception");
        //}
        catch (ArithmeticException e) {
            System.out.println("you should not divide a number by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Accessing array elements outside of the limit");
        }

    }
}


/*in this code we learned that,  the generic code needs to be placed at the
end of all other specific exception catch block.
if you place the generic exception code block at the beginning then the catch blocks
placed after wont be reachable.
 */