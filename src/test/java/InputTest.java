import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.Scanner;



public class InputTest {

    private int actualResult;

    @Test
    public void scannerClass() {



        actualResult = scn();
        int expectedResult = 4;


        Assert.assertEquals(actualResult, expectedResult);
    }
    public int scn(){
        Scanner in = new Scanner(System.in);

        System.out.println("enter an integer");

        int x = in.nextInt();
        return x;
    }
}