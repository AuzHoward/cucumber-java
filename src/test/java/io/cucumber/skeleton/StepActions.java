package io.cucumber.skeleton;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class StepActions extends Element{

    public WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver,20);

    public void takeScreenShot() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("C:\\Projects\\cucumber-java\\target\\tmp\\screenshot.png"));
    }

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
