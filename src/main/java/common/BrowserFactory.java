package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver driver;

    public BrowserFactory(){

    }

    public static WebDriver getDriver(){
        if(driver==null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--headless");
            System.setProperty("webdriver.chrome.driver", "C:/development/drivers/chromedriver.exe");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        }
        return driver;
    }
}