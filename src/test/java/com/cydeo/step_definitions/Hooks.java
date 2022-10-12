package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    // import from io.cucumber.java not from junit

    //@Before (order = 1)
    public void setupScenario() {
        System.out.println("---O setting up browser using cucumber @ Before");
    }

    //@Before (value = "@login", order =2 )
    public void setupScenarioforLogins() {
        System.out.println("---O setting up browser using cucumber @ Before");
    }

   @After
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png", scenario.getName());
        }
        Driver.closeDriver();
    }

    // @BeforeStep
    public void setupBeforeStep() {
        System.out.println("ooooo----oooo This is a @Before STEP setup");
    }

    //@AfterStep
    public void closeDriver() {

    }
}
