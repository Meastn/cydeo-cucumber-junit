package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTable_Login_Page {

    public WebTable_Login_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name="username")
    public WebElement usernameWebTable;

    @FindBy (name="password")
    public WebElement passwordWebTable;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//div[@class='login__error']")
    public WebElement loginErrorMessage;


    public void login (){
        this.usernameWebTable.sendKeys("Test");
        this.passwordWebTable.sendKeys("Tester");
        this.loginButton.click();
    }
}
