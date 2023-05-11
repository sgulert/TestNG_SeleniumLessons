package cw.tests.Day18;

import cw.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C03_LinkedinLoginPage {

    public C03_LinkedinLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);}


        //FindBy ile PageFActory kardeş, biri varsa öbürü olmak zorunda

        @FindBy( id= "username")
        WebElement email;

        @FindBy(id = "password")
        WebElement password;

        @FindBy(xpath = "//button[@aria-label='Sign in']")
        WebElement signIn;

        @FindBy(id = "error-for-username")
        WebElement errorMessage;


}
