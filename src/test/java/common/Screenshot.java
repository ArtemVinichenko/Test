package common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Artem on 14.01.2017.
 */
public class Screenshot {

    public static void takeScreenshot(WebDriver driver, String screenName) {
        // Set folder name to store screenshots.
        String destDir = "screenshots";
        // Capture screenshot.
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Create folder under project with name "screenshots" provided to destDir.
        new File(destDir).mkdirs();
        // Set file name using current date time.
        String destFile = screenName + ".png";

        try {
            // Copy paste file at destination folder location
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
