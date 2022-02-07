import org.testng.Assert;
import org.testng.annotations.Test;

public class ReassigningValueTest {



@Test
           public void changeNum(){
            //declaring and assigning a valur to variable num.

    int num = 4;

            //reassigning value to the variable num.

            num = 5;



            int actualResult = num;
            int expectedResult = 5;

            Assert.assertEquals(expectedResult,actualResult);



}



}
