package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_SearchPage {

    // create constructor
    // initialize the driver instance and this class' instance using pagefactory.initelements
    public Google_SearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "q")
    public WebElement searchBox ;

}
