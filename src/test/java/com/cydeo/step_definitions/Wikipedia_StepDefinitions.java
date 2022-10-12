package com.cydeo.step_definitions;

import com.cydeo.pages.Wikipedia_ArticlePage;
import com.cydeo.pages.Wikipedia_HomePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDefinitions {

    Wikipedia_HomePage wikiHomePage = new Wikipedia_HomePage();
    Wikipedia_ArticlePage wikiArticlePage = new Wikipedia_ArticlePage();
    @Given("user is on wikipedia homepage")
    public void user_is_on_wikipedia_homepage() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }
    @When("user types {string} in the search box")
    public void user_types_in_the_search_box_and_clicks_enter(String searchKeyword) {
        wikiHomePage.wikipediaSearchBox.sendKeys(searchKeyword);

    }
    @And("user clicks search button")
    public void userClicksSearchButton() {
        wikiHomePage.wikipediaSearchButton.click();
    }

    @Then("user sees {string} in the wiki page title")
    public void user_sees_in_the_wiki_title(String searchKeyword) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(searchKeyword));
    }

    @Then("user sees {string} in the main header")
    public void user_sees_in_the_main_header(String searchKeyword) {
        String expectedMainHeader = searchKeyword;
        String actualMainHeader =  wikiArticlePage.wikiMainHeader.getText();
        //Assert.assertEquals("Main Header is NOT as expected", actualMainHeader, expectedMainHeader);
        Assert.assertTrue(wikiArticlePage.wikiMainHeader.getText().contains(searchKeyword));
    }

    @Then("user sees {string} in the image header")
    public void user_sees_in_th_image_peader(String searchKeyword) {
        String expectedImageHeader = searchKeyword;
        String actualImageHeader =  wikiArticlePage.imageHeader.getText();
        Assert.assertEquals("Image Header is NOT as expected", actualImageHeader, expectedImageHeader);
    }



}
