package Listener_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// Enable below, to be able see test info if was not enabled on testng_listener.xml file
//@Listeners(Listener_Demo.ListenerTest.class)

public class TestCases {
    static {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\mihovm.MASCORP\\Downloads\\selenium-java-3.141.59\\geckodriver.exe");
//                "/Users/balivo/Downloads/selenium/course/geckodriver");
    }

    WebDriver driver = new FirefoxDriver();

    // Test to pass as to verify listeners .
    @Test
    public void login() {
        driver.get("http://demo.guru99.com/V4/");
        Reporter.log("The browser is open now. ");
        driver.findElement(By.name("uid")).sendKeys("mngr214692");
        Reporter.log("Username is populated to field. ");
        driver.findElement(By.name("password")).sendKeys("nYrurUd");
        Reporter.log("Password is populated to field. ");
        driver.findElement(By.name("btnLogin")).click();
        Reporter.log("Log in is submitted! ");
    }

    // Forcefully failed this test as to verify listener.
    @Test
    public void testToFail() {
        System.out.println("This method to test fail");
        Reporter.log("Output text to console log. ");
        Assert.fail();
        Reporter.log("Force fails the test case! ");
    }

}
