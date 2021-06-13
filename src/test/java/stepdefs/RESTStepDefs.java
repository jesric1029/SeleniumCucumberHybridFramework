package stepdefs;

import core.RESTUtils;
import core.SeleniumCore;
import core.SeleniumUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import okhttp3.Response;
import org.junit.Assert;

import java.io.IOException;


public class RESTStepDefs {

    public static Response lastResponse;

    @Given("^the user makes a GET request to URL \"([^\"]*)\"$")
    public void theUserMakesAGETRequest(String url) throws Throwable {
        RESTUtils restUtils = new RESTUtils();
        lastResponse = restUtils.getRequest(url);

    }

    @Given("^we validate the status code is \"([^\"]*)\"$")
    public void validateStatusCode(int statusCode) {
        Assert.assertEquals(statusCode,lastResponse.code());
    }

    @And("the user validates the response with a year of \"([^\"]*)\" has a population of \"([^\"]*)\"$")
    public void validateYearToPopulation(String year, String population) throws IOException {
        RESTUtils restUtils = new RESTUtils();
        restUtils.validateCountryPopulationByYear(lastResponse,year,population);
    }

}
