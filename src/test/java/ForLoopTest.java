import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.css.Counter;

public class ForLoopTest {


    @Test
    public void  loopCounter(){
        int counter = 0;
// its the initializer counter


        for (int num =1;num<=4; num++ ){
            System.out.println("you should be able to walk to school");
            // this code is on going because our end point is greater than our given number so
            // it will run infinite amount of times.
            counter++;
        }
        System.out.println(counter);

        int actualRestul = counter;
        int expectedResutl = 4;

        Assert.assertEquals(expectedResutl, actualRestul);
    }
}

