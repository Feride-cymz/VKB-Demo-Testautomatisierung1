package com.VKB.tests;
import com.VKB.pages.HomePage;
import com.VKB.pages.SchadenfreiheitsrabattPage;
import com.VKB.utilities.BrowserUtils;
import com.VKB.utilities.ConfigurationReader;
import com.VKB.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;

    HomePage homePage= new HomePage();
    SchadenfreiheitsrabattPage schadenfreiheitsrabattPage= new SchadenfreiheitsrabattPage();
    @BeforeMethod
    public void setUp() {

        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.get("url"));

        homePage.schadenFreiheitsRabatt.click();
        Assert.assertEquals(schadenfreiheitsrabattPage.sfTitle.getText(),"SF-Übertragung an einen anderen Versicherungsnehmer");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        BrowserUtils.waitFor(1);
        driver.close();
    }
}
