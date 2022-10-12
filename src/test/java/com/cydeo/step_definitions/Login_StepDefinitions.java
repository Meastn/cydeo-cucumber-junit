package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user sees the dashboard");
    }

    @When("user enters admin username")
    public void user_enters_admin_username() {
        System.out.println("User enters ADMIN username");
    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("User enters ADMIN password");
    }

    @When("user enters mtudent username")
    public void userEntersMtudentUsername() {
    }

    @And("user enters mtudent password")
    public void userEntersMtudentPassword() {
    }
}
