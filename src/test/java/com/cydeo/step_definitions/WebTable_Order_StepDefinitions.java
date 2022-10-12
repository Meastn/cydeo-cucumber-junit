package com.cydeo.step_definitions;

import com.cydeo.pages.WebTable_Login_Page;
import com.cydeo.pages.WebTable_OrderPage;
import com.cydeo.pages.WebTable_BasePage;
import com.cydeo.pages.WebTable_ViewOrders_Page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTable_Order_StepDefinitions {

    WebTable_Login_Page webtableLoggin = new WebTable_Login_Page();
    WebTable_OrderPage orderPage = new WebTable_OrderPage();
    WebTable_BasePage basePage = new WebTable_BasePage();
    WebTable_ViewOrders_Page viewOrderPage= new WebTable_ViewOrders_Page();

    @Given("user is already logged in and is on orders page")
    public void user_is_already_logged_in_and_is_on_orders_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        webtableLoggin.login();
        basePage.createOrderMenu.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(int quantity) {
        orderPage.quantityInput.clear();
        // or orderPage.quantityInput.sendKeys(Keys.BACK_SPACE);
        orderPage.quantityInput.sendKeys(quantity + ""); // either this way to turn int to String t
        //orderPage.quantityInput.sendKeys(String.valueOf(quantity)); // or this way

    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {
        orderPage.customerNameInput.sendKeys(customerName);
    }

    @When("user enters street {string}")
    public void user_enters_street(String streetName) {
        orderPage.streetAddressInput.sendKeys(streetName);
    }

    @When("user enters city {string}")
    public void user_enters_city(String cityName) {
        orderPage.cityAddressInput.sendKeys(cityName);
    }

    @When("user enters state {string}")
    public void user_enters_state(String stateName) {
        orderPage.stateAddressInput.sendKeys(stateName);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipCode) {
        orderPage.zipAddressInput.sendKeys(zipCode);
    }

    @When("user selects Credit Card Type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {
    List<WebElement> cardTypes = orderPage.cardType;
        // orderPage.mastercardRadiobutton.click();

        for (WebElement each : cardTypes) {
            if (each.getAttribute("value").equalsIgnoreCase(expectedCardType)){
                each.click();
            }
        }
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNo) {
        orderPage.cardNo.sendKeys(cardNo);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expiryDate) {
        orderPage.cardExpDateInput.sendKeys(expiryDate);
    }

    @When("user clicks process order button")
    public void user_clicks_process_order_button() {
        orderPage.processOrderButton.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName) {
        String actualName = viewOrderPage.newCustomerCell.getText();
        Assert.assertEquals(actualName, expectedName);
    }

}
