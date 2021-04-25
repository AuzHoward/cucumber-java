package io.cucumber.skeleton;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends StepActions{

    //Objects
    StepActions actions = new StepActions();

    @Given("Web Browser is open")
    public void open_web_browser(){
        actions.firefoxBrowser();
    }

    @Then("Search flights from {word} to {word}")
    public void search_flights(String fromDestination, String toDestination){
        actions.searchFlight(fromDestination, toDestination);
    }

    @When("Flight type is {word}")
    public void flight_type_is_oneWay(String flightType){
        actions.setFlightType(flightType);
    }
    
}
