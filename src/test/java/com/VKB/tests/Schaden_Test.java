package com.VKB.tests;
import com.VKB.pages.HomePage;
import com.VKB.pages.SchadenfreiheitsrabattPage;
import com.VKB.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Schaden_Test extends TestBase{

    HomePage homePage= new HomePage();
    SchadenfreiheitsrabattPage schadenfreiheitsrabattPage= new SchadenfreiheitsrabattPage();

    @Test
    public void test1SchdnNchtAnwsnd() throws InterruptedException {

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
        schadenfreiheitsrabattPage.weitrSendBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(1, "Max");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(2, "Mustermann");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(4, "999999991234");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(5, "Schlossallee 42");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(6, "81234 München");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(7, "A");
        schadenfreiheitsrabattPage.datum2000.sendKeys("01.2000");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(8, "Deutschland");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(9, "Max");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(10, "Mustermann");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(11, "Allianz Versicherung");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(12, "KR999999991234");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(13, "HH-SO 1005");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.weitrSendBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.nichtAnswesend.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.email.sendKeys("maxmustermann@gmail.com");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.weitrSendBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.sendBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.pdfBtn.click();

        //

    }

    @Test
    public void test2Verstorben() throws InterruptedException {

        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.navigateToradioBtn_Mtd("verstorben");
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.weiterBtn.click();
        //schadenfreiheitsrabattPage.datumInput.sendKeys("04.2004");
        //schadenfreiheitsrabattPage.ausstellLands.sendKeys("Deutschland");

        /*schadenfreiheitsrabattPage.angabenZumFührerSchein_Mtd(1, "Deutschland");
        schadenfreiheitsrabattPage.angabenZumFührerSchein_Mtd(2, "Elke");
        schadenfreiheitsrabattPage.angabenZumFührerSchein_Mtd(3, "Mustermann");*/


    }


    @Test
    public void test3Anwesend() throws InterruptedException {
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.navigateToradioBtn_Mtd("anwesend");
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.weiterBtn.click();


    }
}




