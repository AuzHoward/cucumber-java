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

    //@Given("Web Browser is open")
    public void flight_type_is_oneWay(String flightType){
        actions.setFlightType(flightType);
    }

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public boolean I_wait_an_hour(int hour){
        if(hour == 1){
            return true;
        }else{return false;}
    }

    @Then("my belly should growl")
    public void belly_growl(){
        if(I_wait_an_hour(1) == true){
            System.out.println("GRRRRRRRRRRRRRRRRRR");
        }else{System.out.println("PLEASE WAIT AN HOUR");}
    }
}
