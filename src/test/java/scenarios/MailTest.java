package scenarios;

import common.DriverConfig;
import common.Screenshot;
import common.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LoginPage1;
import pages.MainPage;
import pages.MainPage1;

/**
 * Created by Artem on 01.01.2017.
 */
public class MailTest {
    private WebDriver driver;
    public static String MethodName;

    @BeforeTest
    public void Begin() throws Exception {
        driver = DriverConfig.OpenDefaultPage();
    }

//    @Test
//    public void Login(){
//        MethodName = "Login";
//        LoginPage loginPage = new LoginPage(driver);
//
//        Assert.assertTrue(loginPage.makeLogIn(TestData.userName, TestData.userPass));
//    }

    @Test
    public void Login1(){
        MethodName = "Login1";
        LoginPage1 loginPage1 = new LoginPage1(driver);

        Assert.assertTrue(loginPage1.makeLogIn1(TestData.MainUser));
    }

//    @Test
//    public void Message() throws Exception {
//        MethodName = "Message";
//        MainPage mainPage = new MainPage(driver);
//
//        Assert.assertTrue(mainPage.sendMessage(TestData.destinationEmail, TestData.messageText));
//    }

    @Test
    public void Message1() throws Exception {
        MethodName = "Message1";
        MainPage1 mainPage1 = new MainPage1(driver);

        Assert.assertTrue(mainPage1.sendMessage1(TestData.NewMessage));
    }

    @AfterTest
    public void CloseDriver(){
        Screenshot.takeScreenshot(driver, MethodName);
        driver.close();
    }
}
