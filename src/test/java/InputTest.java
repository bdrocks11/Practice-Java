import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.Scanner;



public class InputTest {

/*
   // public static void main(String[] args) {
      //  takeNumber();

    //}

 */
   @Test
    public static void takeNumber() {
 Scanner in = new Scanner(System.in);

        System.out.println("enter number");

    int act = in.nextInt();


       int actualResult = act;


            int expectedResult = 4;


            Assert.assertEquals(actualResult, expectedResult);
        }


    }
