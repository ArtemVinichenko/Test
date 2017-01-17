package common;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


public abstract class BasePage {

    WebDriver Driver;
    public Logger log = Logger.getLogger(BasePage.class);

    protected BasePage(WebDriver driver) {
        Driver = driver;
    }

//    public void findElementByXPathAndClick(String xPath) throws Exception {
//        try {
//            Driver.findElement(By.xpath(xPath)).click();
//            log.info("Method 'FindElementByXPathAndClick' was successful.");
//        } catch (Exception e) {
//            log.error("Method 'FindElementByXPathAndClick' has failed.");
//            throw e;
//        }
//    }

    public void waitForElementToBeClickableAndClick(String xPath) throws Exception {
        try {
            WebElement element = Driver.findElement(By.xpath(xPath));
            WebDriverWait wait = new WebDriverWait(Driver, 7);
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            log.info("Method 'waitForElementToBeClickableAndClick' was successful for element: " + xPath);
        } catch (Exception e) {
            log.error("Method 'waitForElementToBeClickableAndClick' has failed for element: " + xPath);
            throw e;
        }
    }

    public void waitForElementToBeClickable(String xPath) throws Exception {
        try {
            WebElement element = Driver.findElement(By.xpath(xPath));
            WebDriverWait wait = new WebDriverWait(Driver, 7);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            log.info("Method 'waitForElementToBeClickable' was successful for element: " + xPath);
        } catch (Exception e) {
            log.error("Method 'waitForElementToBeClickable' has failed for element: " + xPath);
            throw e;

        }
    }

    public void waitForElementToBeClickableAndSendKeys(String xPath, String text) throws Exception {
        try {
            WebElement element = Driver.findElement(By.xpath(xPath));
            WebDriverWait wait = new WebDriverWait(Driver, 7);
            wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
            log.info("Method 'waitForElementToBeClickableAndSendKeys' was successful for element: " + xPath);
        } catch (Exception e) {
            log.error("Method 'waitForElementToBeClickableAndSendKeys' has failed for element: " + xPath);
            throw e;
        }
    }


}