package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by Artem on 08.01.2017.
 */
public class MainPage extends LoginPage {
    public static final String ButtonWrite = "//a[@data-params='source=toolbar']";
    public static final String AddressField = "//div[@name='to']";
    public static final String MessageField = "//input[@name='subj']";
    public static final String ButtonSend = "//button[@id='nb-17']";
    public static final String PopUp = "//div[text()='Лист успішно надіслано']";


    private static final Logger log = Logger.getLogger("LoginPage");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean sendMessage(String destinationEmail, String messageText) throws Exception {
        try {
            waitForElementToBeClickableAndClick(ButtonWrite);
            waitForElementToBeClickableAndSendKeys(AddressField, destinationEmail);
            waitForElementToBeClickableAndSendKeys(MessageField, messageText);
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

