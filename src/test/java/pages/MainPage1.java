package pages;

import common.BasePage;
import entities.Message;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by Artem on 15.01.2017.
 */
public class MainPage1 extends BasePage {
    public static final String ButtonWrite = "//a[@data-params='source=toolbar']";
    public static final String AddressField = "//div[@name='to']";
    public static final String MessageField = "//input[@name='subj']";
    public static final String ButtonSend = "//button[@id='nb-17']";
    public static final String PopUp = "//div[text()='Лист успішно надіслано']";


    private static final Logger log = Logger.getLogger(MainPage1.class);

    public MainPage1(WebDriver driver) {
        super(driver);
    }

    public boolean sendMessage1(Message message) throws Exception {
        try {
            waitForElementToBeClickableAndClick(ButtonWrite);
            waitForElementToBeClickableAndSendKeys(AddressField, message.getDestinationEmail());
            waitForElementToBeClickableAndSendKeys(MessageField, message.getMessageText());
            waitForElementToBeClickableAndClick(ButtonSend);
            waitForElementToBeClickable(PopUp);

            log.info("Method 'sendMessage' was successful.");
            return true;
        } catch (Exception e) {
            log.error("Method 'sendMessage' has failed, stack: " + e);
            return false;
        }
    }
}