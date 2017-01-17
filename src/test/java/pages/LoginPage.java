package pages;

import common.BasePage;
import entities.User;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public static final String InputName = "//input[@name='login']";
    public static final String InputPassword = "//input[@name='passwd']";
    public static final String ButtonLogIn = "//span[text()='Войти']/parent::button";


    private static final Logger log = Logger.getLogger(LoginPage.class);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean makeLogIn(String userName, String userPass){
        try {
            waitForElementToBeClickableAndSendKeys(InputName, userName);
            waitForElementToBeClickableAndSendKeys(InputPassword, userPass);
            waitForElementToBeClickableAndClick(ButtonLogIn);

            log.info("Method 'makeLogIn' was successful.");
            return true;
        }catch (Exception e){
            log.error("Method 'makeLogIn' has failed, stack: " + e);
            return false;
        }
    }
}
