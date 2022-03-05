package pageobjects;

import helper.ApplicationHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class SignIn {
    @FindBy (how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]")
    WebElement signInClick;
    @FindBy (how =  How.ID, using = "email_create" )
    WebElement emailBox;
    @FindBy (how = How.ID, using ="customer_firstname")
    WebElement firstName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"noSlide\"]/h1")
    WebElement assertSignIn;
    @FindBy (how = How.ID, using = "customer_lastname")
    WebElement lastName;
    @FindBy (how = How.ID, using = "passwd")
    WebElement password;

    public void clickSignIn() {
        signInClick.click();
    }
    public void typeEmail(String message){
        emailBox.sendKeys();
        ApplicationHelper.sendKeys("emailBox", emailBox, message);
    }
    public String getMessaga(){
        String message = assertSignIn.getText();
        return message;


    }
public void firstNameBox(String name){
        firstName.sendKeys();
    ApplicationHelper.sendKeys("firstName", firstName, name);

}
public void lastNameBox(String lastname){
        lastName.sendKeys();
        ApplicationHelper.sendKeys("lastName", lastName, lastname);
}
public void setPassword(String givePassword){
        password.sendKeys();
    ApplicationHelper.sendKeys("password", password, givePassword);

}

}
