package stepdefs;

import core.SeleniumCore;
import core.SeleniumUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class SeleniumStepDefs {


    @Given("^the user initializes the Selenium driver for \"([^\"]*)\"$")
    public void theUserInitializesTheSeleniumDriverFor(String browser) throws Throwable {
        SeleniumCore.setDriver(browser);
        System.out.println(browser);
    }

    @And("^the user navigates to Google$")
    public void theUserNavigatesToGoogle() {
        SeleniumCore.driver.get("https://www.google.com/");
        String actualTitle = SeleniumCore.driver.getTitle();
        SeleniumCore.driver.manage().window().maximize();
        Assert.assertEquals("Google",actualTitle);
    }

    @Then("we close the driver$")
    public void closeDriver(){
        SeleniumCore.driverCleanup();
    }

    @And("The user searches Google via page object model\"([^\"]*)\"$")
    public void theUserTypesPageModel(String text){
        SeleniumUtils utils = new SeleniumUtils();
        utils.search(text);
    }

    @And("the user navigates to the device \"([^\"]*)\" and model \"([^\"]*)\"$")
    public void theUserTypesPageModel(String device, String model) {
        SeleniumUtils utils = new SeleniumUtils();
        utils.testGoogleStore(device,model);
    }



}
