package com.VKB.tests;
import com.VKB.pages.HomePage;
import com.VKB.pages.SchadenfreiheitsrabattPage;
import com.VKB.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Schaden_Test extends TestBase{
    HomePage homePage= new HomePage();
    SchadenfreiheitsrabattPage schadenfreiheitsrabattPage= new SchadenfreiheitsrabattPage();
    @Test
    public void testSchdnNchtAnwsnd() throws InterruptedException {

        homePage.schadenFreiheitsRabatt.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(schadenfreiheitsrabattPage.sfTitle.getText(),"SF-Übertragung an einen anderen Versicherungsnehmer");
        Assert.assertEquals(schadenfreiheitsrabattPage.ihreDtn.getText(), "Ihre Daten");
        Assert.assertEquals(schadenfreiheitsrabattPage.vornameInput.getText(), "Vorname");
        Assert.assertEquals(schadenfreiheitsrabattPage.nachnameInput.getText(), "Nachname");
        Assert.assertEquals(schadenfreiheitsrabattPage.versicherungsNummerInput.getText(), "Versicherungsnummer");
        Assert.assertEquals(schadenfreiheitsrabattPage.straßeHausNummerInput.getText(), "Straße und Hausnummer");
        Assert.assertEquals(schadenfreiheitsrabattPage.postleitzahlOrtInput.getText(), "Postleitzahl und Ort");
        schadenfreiheitsrabattPage.navigateToradioBtn_Mtd("nicht anwesend");
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.weiterBtn.click();
        BrowserUtils.waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String path="document.querySelector(\"body > app-root > div > div > app-page > div > div.page.ng-untouched.ng-pristine.ng-valid > div > app-section > div > div.grid-child.grid-child__row-2-col-1-colWidth-2 > app-attribute > div > laser-link\").shadowRoot.querySelector(\"a\")";
        WebElement element = (WebElement) jse.executeScript("return "+path);
        jse.executeScript("arguments[0].click();", element);
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.startBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.datenSchtzKlick.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.weitrBtn.click();
        BrowserUtils.waitFor(1);

        //BrowserUtils.clickWithJS(schadenfreiheitsrabattPage.vorNameInput);
        schadenfreiheitsrabattPage.vorNameInput.click();


       // WebElement vorNameInput = driver.findElement(By.id("Vorname"));
        schadenfreiheitsrabattPage.vorNameInput.sendKeys("Max");



    }

    @Test
    public void testVerstorben() throws InterruptedException {

        homePage.schadenFreiheitsRabatt.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(schadenfreiheitsrabattPage.sfTitle.getText(),"SF-Übertragung an einen anderen Versicherungsnehmer");
        Assert.assertEquals(schadenfreiheitsrabattPage.ihreDtn.getText(), "Ihre Daten");
        Assert.assertEquals(schadenfreiheitsrabattPage.vornameInput.getText(), "Vorname");
        Assert.assertEquals(schadenfreiheitsrabattPage.nachnameInput.getText(), "Nachname");
        Assert.assertEquals(schadenfreiheitsrabattPage.versicherungsNummerInput.getText(), "Versicherungsnummer");
        Assert.assertEquals(schadenfreiheitsrabattPage.straßeHausNummerInput.getText(), "Straße und Hausnummer");
        Assert.assertEquals(schadenfreiheitsrabattPage.postleitzahlOrtInput.getText(), "Postleitzahl und Ort");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.navigateToradioBtn_Mtd("verstorben");
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.weiterBtn.click();




    }



    @Test
    public void testAnwesend() throws InterruptedException {

        homePage.schadenFreiheitsRabatt.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(schadenfreiheitsrabattPage.sfTitle.getText(),"SF-Übertragung an einen anderen Versicherungsnehmer");
        Assert.assertEquals(schadenfreiheitsrabattPage.ihreDtn.getText(), "Ihre Daten");
        Assert.assertEquals(schadenfreiheitsrabattPage.vornameInput.getText(), "Vorname");
        Assert.assertEquals(schadenfreiheitsrabattPage.nachnameInput.getText(), "Nachname");
        Assert.assertEquals(schadenfreiheitsrabattPage.versicherungsNummerInput.getText(), "Versicherungsnummer");
        Assert.assertEquals(schadenfreiheitsrabattPage.straßeHausNummerInput.getText(), "Straße und Hausnummer");
        Assert.assertEquals(schadenfreiheitsrabattPage.postleitzahlOrtInput.getText(), "Postleitzahl und Ort");
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.navigateToradioBtn_Mtd("anwesend");
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.weiterBtn.click();


    }
}
