package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameLgn;
    @FindBy(id = "prependedInput2")
    public WebElement passwordLgn;
    @FindBy(name = "_submit")
    public WebElement submitLgn;



    public void loginToVY(String username, String password) {
        usernameLgn.sendKeys(username);
        passwordLgn.sendKeys(password);
        submitLgn.click();
    }
}

