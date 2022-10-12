package com.cydeo.step_definitions;

import com.cydeo.pages.Dropdown_Months;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class Dropdown_StepDefinitions {
Dropdown_Months dropdownMenu = new Dropdown_Months();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in months dropdown")
    public void user_should_see_below_info_in_months_dropdown(List<String> expectedMonths) {
        List <String> actualMonths = BrowserUtils.dropdownOptionsAsString(dropdownMenu.monthDropdownList);
        Assert.assertEquals("Months list DOES NOT match", expectedMonths,actualMonths);
 }
}
