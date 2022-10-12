package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackDashboard {

    public VyTrackDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath="//li[@id='user-menu']/a")
    public WebElement fullName;

    // @FindBy (xpath ="//a[@href='/user/logout']")
    // public WebElement logoutLink;
    @FindBy (xpath="//a[@href='/user/logout']")
    public WebElement logoutLink;

    public void logout(){
        fullName.click();
        logoutLink.click();
    }
}
