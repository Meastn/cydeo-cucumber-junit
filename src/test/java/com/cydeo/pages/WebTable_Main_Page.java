package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class WebTable_Main_Page {

    public WebTable_Main_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
