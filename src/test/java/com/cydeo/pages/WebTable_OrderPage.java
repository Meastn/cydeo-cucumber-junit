package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTable_OrderPage extends WebTable_BasePage {

    public WebTable_OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name="product")
    public WebElement productDropdown;

    @FindBy (name="quantity")
    public WebElement quantityInput;

    @FindBy (name="name")
    public WebElement customerNameInput;

    @FindBy (name="street")
    public WebElement streetAddressInput;

    @FindBy (name="city")
    public WebElement cityAddressInput;

    @FindBy (name="state")
    public WebElement stateAddressInput;

    @FindBy (name="zip")
    public WebElement zipAddressInput;

    @FindBy (xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;

    @FindBy (xpath = "//input[@value='MasterCard']")
    public WebElement mastercardRadiobutton;

    @FindBy (name ="card")
    public List<WebElement> cardType;

//    @FindBy (xpath = "//input[@value='American Express']")
//    public WebElement americanExpressRadiobutton;
//
//    @FindBy (name="cardNo")
//    public WebElement cardNoInput;
//
    @FindBy (name="cardExp")
    public WebElement cardExpDateInput;

    @FindBy (name="cardNo")
    public WebElement cardNo;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement processOrderButton;

}
