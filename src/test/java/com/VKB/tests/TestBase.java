package com.VKB.tests;
import com.VKB.utilities.ConfigurationReader;
import com.VKB.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp() {

        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.get("url"));
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
    }
}
