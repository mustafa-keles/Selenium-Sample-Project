package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class DriverWrapper {

    private static WebDriver driver;

    @BeforeMethod
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.zoomcare.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }




}
