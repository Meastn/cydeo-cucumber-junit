package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTable_ViewOrders_Page {

    public WebTable_ViewOrders_Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath ="//button[.='Select All']")
    public WebElement selectAllButton;

    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement newCustomerCell;
    
}
