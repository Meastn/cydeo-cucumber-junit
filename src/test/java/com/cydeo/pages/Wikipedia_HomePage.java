package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia_HomePage {

    public Wikipedia_HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name ="search")
    public WebElement wikipediaSearchBox;

    @FindBy (xpath ="//i[@class='sprite svg-search-icon']")
    public WebElement wikipediaSearchButton;


}
