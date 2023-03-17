package com.VKB.tests;
import com.VKB.pages.HomePage;
import com.VKB.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage_Test extends TestBase{

    HomePage homePage= new HomePage();

    @Test
    public void homePageTest() {

        //driver.get(ConfigurationReader.get("url"));
        Assert.assertEquals(homePage.homePage.getText(),"HOME");
        Assert.assertEquals(homePage.schadenFreiheitsRabatt.getText(),"Schadenfreiheitsrabatt");
        Assert.assertEquals(homePage.unwetterSchaden.getText(),"Unwetterschaden");
        Assert.assertEquals(homePage.teilKaskoSturm.getText(),"Teilkasko Sturm");



    }
}
