package com.VKB.pages;
import com.VKB.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SchadenfreiheitsrabattPage extends BasePage{

    @FindBy(xpath = "//*[@class='title']")
    public WebElement sfTitle;

    @FindBy(xpath = "//*[@class='container-buttons__button container-buttons__button--next']")
    public WebElement weiterBtn;

   @FindBy(xpath = "//button[@id='ember802']")
    public WebElement startBtn;

   @FindBy(xpath = "//span[@class='checkmark']")
   public WebElement datenSchtzKlick;

   @FindBy(xpath = "//button[@class='footer-button-right']")
   public WebElement weitrSendBtn;

   //@FindBy(xpath = "//*[@id='control']")
  // public WebElement führerscheinSelect;

   @FindBy(xpath = "//input[@type='tel']")
   public WebElement datum2000;

   @FindBy(xpath = "(//div[@class='content-wrapper'])[1]")
   public WebElement nichtAnswesend;

   @FindBy(xpath = "//input[@type='email']")
   public WebElement email;

    @FindBy(xpath = "//input[@class='submit-input']")
    public WebElement pdfBtn;

    @FindBy(xpath = "//button[@class='footer-button-right']")
    public WebElement sendBtn;

    //verstorben locater
    @FindBy(id = "mat-input-0")
    public WebElement besitzInput;

    @FindBy(xpath = "(//laser-input[@type='text'])[1]")
    public WebElement ausstellLands;

    public void navigateToradioBtn_Mtd(String radioMenu){
        Driver.get().findElement(By.xpath("//laser-radio[text()=' "+radioMenu+" ']")).click();
    }

    public void ihreDateninput_Mtd(int index, String data){
        Driver.get().findElement(By.xpath("(//input[@type='text'])["+index+"]")).sendKeys(data);
    }

  /* public void angabenZumFührerSchein_Mtd(int index, String daten){
        Driver.get().findElement(By.xpath("(//laser-input[@type='text'])["+index+"]")).sendKeys(daten);
    }*/

    /*public void führerschein_Mtd(){
        Select select = new Select(führerscheinSelect);
        select.selectByVisibleText("A");
    }*/




















}
