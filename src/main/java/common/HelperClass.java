package common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class HelperClass {

    public static WebDriver driver;

    public HelperClass(){
    }

    @BeforeSuite
    public void beforeSuite(){

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("in @BeforeClass");
        HelperClass.driver = BrowserFactory.getDriver();
    }

    @BeforeMethod
    public void beforeMethodClass(){
        System.out.println("in @BeforeMethod");
    }

    @AfterMethod
    public void close()
    {}

    @AfterClass
    public void afterClass(){
        this.driver.close();
    }

    @AfterSuite
    public void afterSuite() throws IOException{
        driver.quit();
    }
}