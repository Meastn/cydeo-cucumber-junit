package com.cydeo.step_definitions;

import com.cydeo.pages.Google_SearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    Google_SearchPage googleSearchPage = new Google_SearchPage();

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("user types apple and clicks Enter")
    public void user_types_apple_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user sees apple in the google search title")
    public void user_sees_apple_in_the_google_search_title() {
        String expectedTitle = "apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title is not as expected", expectedTitle, actualTitle);


    }

    @When("user types {string} and clicks Enter")
    public void user_types_and_clicks_enter(String searchKeyword) {
      googleSearchPage.searchBox.sendKeys(searchKeyword, Keys.ENTER);

    }
    @Then("user sees {string} in the google search title")
    public void user_sees_in_the_google_search_title(String searchKeyword) {
        String expectedTitle = searchKeyword +" - XXGoogle'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title is not as expected", expectedTitle, actualTitle);

    }


}
