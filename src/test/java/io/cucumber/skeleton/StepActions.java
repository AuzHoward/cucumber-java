package io.cucumber.skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class StepActions extends Element{

    public WebDriver driver = new FirefoxDriver();

    public void firefoxBrowser(){
        System.setProperty("webdriver.gecko.driver", "C:/WebDriver/drivers/geckodriver");
        driver.get(southwestURL);
    }
    public void setFlightType(String type){
        if(type.equals("Roundtrip")){
            driver.findElement(By.id(roundTripRadio)).click();
        }else{}
    }
}
