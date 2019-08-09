package PDFEmail;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 *      Please, check this URL for PDF report utility: http://uttesh.com/pdfngreport/
 */

public class BaseClass {
    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            WebDriver driver;
            System.setProperty("webdriver.gecko.driver",
                    "C:\\Users\\mihovm.MASCORP\\Downloads\\selenium-java-3.141.59\\geckodriver.exe");
//                "/Users/balivo/Downloads/selenium/course/geckodriver");

            driver = new FirefoxDriver();
        }
        return driver;
    }

    /**
     * This function will take screenshot
     * @param webdriver
     * @param fileWithPath
     * @throws Exception
     */
    public static void takeSnapShot(WebDriver webDriver, String fileWithPath) throws IOException {

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot)webDriver);

        //Call getScreenshotAs method to create image file
        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File destFile = new File(fileWithPath);

        //Copy file at destination
        FileUtils.copyFile(scrFile, destFile);
    }
}
