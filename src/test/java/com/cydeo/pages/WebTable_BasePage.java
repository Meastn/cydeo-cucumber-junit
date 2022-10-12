package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTable_BasePage {

    public WebTable_BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[.='Order']")
    public WebElement createOrderMenu;

    @FindBy (xpath ="//a[.='View all orders']")
    public WebElement viewAllOrdersMenu;

    @FindBy (xpath ="//a[.='View all products']")
    public WebElement viewAllProductsMenu;

    @FindBy (xpath ="//button[@class='button __logout']")
    public WebElement logoutButton;

}
