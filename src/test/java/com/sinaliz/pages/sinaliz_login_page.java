package com.sinaliz.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class sinaliz_login_page {

    public sinaliz_login_page () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "user")
    public WebElement userLoginInput;

    @FindBy (name="pass")
    public WebElement userPasswordInput;


}
