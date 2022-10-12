package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia_ArticlePage {
    public Wikipedia_ArticlePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//h1[@id='firstHeading']")
    public WebElement wikiMainHeader;

    @FindBy (xpath =" //div[@style='display:inline']")
    public WebElement imageHeader;
}
