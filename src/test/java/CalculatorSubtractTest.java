import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.*;
public class CalculatorSubtractTest {


    public static int subtract(int a, int b){
        int  result  = a-b;
        return result;
    }
    @Test
    public void addTest(){

        int actualResult = CalculatorSubtractTest.subtract(5,2);
        int expectedResult = 3;

        Assert.assertEquals(actualResult, expectedResult);
    }
}
