package io.cucumber.skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepActions extends Element{

    public WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver,20);

    public void firefoxBrowser(){
        System.setProperty("webdriver.gecko.driver", "C:/WebDriver/drivers/geckodriver");
        driver.get(southwestURL);
    }

    public void closeBrowser(){
        driver.close();
    }

    public void setFlightType(String type){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(roundTripRadio)));
        if(type.equals("oneWay")){
            driver.findElement(By.cssSelector(roundTripRadio)).click();
        }
    }

    public void searchFlight(String fromFlight, String toFlight){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(fromAirportField)));
        driver.findElement(By.cssSelector(fromAirportField)).sendKeys(fromFlight);
        driver.findElement(By.cssSelector(toAirportField)).sendKeys(toFlight);
        driver.findElement(By.cssSelector(searchFlightButton)).click();
    }
}
