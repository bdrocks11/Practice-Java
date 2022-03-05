package pageobjectstests;

import browserdriver.BrowserDriver;
import excelreader.MyDataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.SignIn;

public class SignInTest extends BrowserDriver {
    SignIn signIn = null;


    @BeforeMethod

    public void initializeElements() {
        signIn = PageFactory.initElements(driver, SignIn.class);

    }

        @Test
    public void clickSignIn(String e){
        signIn.clickSignIn();
        signIn.typeEmail("abusufian145@gmail.com");
       String actualMessage = signIn.getMessaga();
      // Assert.assertEquals(actualMessage, "CREATE AN  ACCOUNT");
            //System.out.println("test passed");
        signIn.firstNameBox("Abu");
        signIn.lastNameBox("Sufian");
        signIn.setPassword("abc012");

    }

}
