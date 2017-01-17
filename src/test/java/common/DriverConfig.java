package common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Artem on 01.01.2017.
 */
public class DriverConfig {
    static WebDriver driver;
    private static final Logger log = Logger.getLogger(String.valueOf(DriverConfig.class));

    public static WebDriver OpenDefaultPage() throws Exception {
        try {
            driver = new ChromeDriver();
            driver.navigate().to(TestData.url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            log.info("Method 'OpenDefaultPage' was successful.");
            return driver;
            } catch (Exception e){
            log.error("Method 'OpenDefaultPage' has failed. Stack: " + e);
            throw e;
        }
    }

//    public static WebDriver OpenDefaultPage(WebDriver driver1, String url) throws Exception {
//        try {
//            driver1.navigate().to(url);
//            driver1.manage().window().maximize();
//            driver1.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//            log.info("Method 'OpenDefaultPage' was successful.");
//            return driver;
//            } catch (Exception e){
//            log.error("Method 'OpenDefaultPage' has failed. Stack: " + e);
//            throw e;
//        }
//    }
}
