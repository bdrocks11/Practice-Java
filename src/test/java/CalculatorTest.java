import TestFiles.CalculatorJahidul;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTest {

    @Test
    public void addTest(){

        int actualResult = CalculatorJahidul.add(2,2);
        int expectedResult = 4;

        // compare actual result with expected result.
         //** above comment will deploy something true or false.
        // or same or not same which ultimately means true or false.

        Assert.assertEquals(actualResult, expectedResult);

        System.out.println("Test Passed");

    }
}
