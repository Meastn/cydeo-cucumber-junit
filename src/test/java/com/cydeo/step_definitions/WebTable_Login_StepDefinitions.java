package com.cydeo.step_definitions;

import com.cydeo.pages.WebTable_Login_Page;
import com.cydeo.pages.WebTable_Main_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class WebTable_Login_StepDefinitions {
    WebTable_Login_Page webtableLogin = new WebTable_Login_Page();
    WebTable_Main_Page webTable_main_page = new WebTable_Main_Page();
    Faker faker = new Faker();

    @Given("user is at login page")
    public void user_is_at_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enters {string} username")
    public void user_enters_username(String username) {
        webtableLogin.usernameWebTable.sendKeys(username);
    }

    @When("user enters {string} password")
    public void user_enters_password(String password) {
        webtableLogin.passwordWebTable.sendKeys(password);

    }


    @And("user clicks to login button")
    public void userClicksToLoginButton() {
        webtableLogin.loginButton.click();
    }

    @Then("verify that target URL contains {string}")
    public void verifyThatTargetURLContains(String expectedInURL) {
        BrowserUtils.verifyURLContains(expectedInURL);
    }
    //*******
        @When("user enters blank {string} username")
    public void user_enters_blank_username(String string) {
        webtableLogin.usernameWebTable.sendKeys("");
    }
//    @When("user enters blank {string} password")
//    public void user_enters_blank_password_password() {
//
//    }
    @Then("verify that wrong credentials warning is displayed")
    public void verify_that_wrong_credentials_warning_is_displayed() {
        if (webtableLogin.loginErrorMessage.isDisplayed()){
            System.out.println("Invalid Credentials Successfully Avoided");
        }
    }

    @When("user enters wrong {string} username and {string} password")
    public void userEntersWrongUsernameAndPassword(String arg0, String arg1) {
        webtableLogin.usernameWebTable.sendKeys(faker.name().username());
        webtableLogin.passwordWebTable.sendKeys(faker.bothify("??##??????#"));
    }

    @And("user enters blank {string} password")
    public void userEntersBlankPassword(String arg0) {
        webtableLogin.passwordWebTable.sendKeys("");
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {
        webtableLogin.usernameWebTable.sendKeys(credentials.get("username"));
        webtableLogin.passwordWebTable.sendKeys(credentials.get("password"));
    }

//    @When("username is")
//    public void usernameIs(Map<String, String> creds) {
//        for (Map.Entry<String, String> eachEntry : creds.entrySet()) {
//            String key = eachEntry.getKey();
//            String value = eachEntry.getValue();
//            webtableLogin.usernameWebTable.sendKeys(key);
//            webtableLogin.passwordWebTable.sendKeys(value);
//        }
//
//        }

    }
