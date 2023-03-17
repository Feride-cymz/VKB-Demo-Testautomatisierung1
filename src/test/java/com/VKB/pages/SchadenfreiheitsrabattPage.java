package com.VKB.pages;
import com.VKB.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SchadenfreiheitsrabattPage extends BasePage{

    @FindBy(xpath = "//*[@class='title']")
    public WebElement sfTitle;

    @FindBy(xpath = "(//laser-text[@class='grid-child--two-cols'])[1]")
    public WebElement ihreDtn;

    @FindBy(xpath = "(//div[@class='noInfoTextLabel'])[1]")
    public WebElement vornameInput;

    @FindBy(xpath = "(//div[@class='noInfoTextLabel'])[2]")
    public WebElement nachnameInput;

    @FindBy(xpath = "(//div[@class='noInfoTextLabel'])[3]")
    public WebElement versicherungsNummerInput;

    @FindBy(xpath = "(//div[@class='noInfoTextLabel'])[4]")
    public WebElement straßeHausNummerInput;

    @FindBy(xpath = "(//div[@class='noInfoTextLabel'])[5]")
    public WebElement postleitzahlOrtInput;

    @FindBy(xpath = "//*[@class='container-buttons__button container-buttons__button--next']")
    public WebElement weiterBtn;

   @FindBy(xpath = "//button[@id='ember802']")
    public WebElement startBtn;

   @FindBy(xpath = "//span[@class='checkmark']")
   public WebElement datenSchtzKlick;

   @FindBy(xpath = "//button[@class='footer-button-right']")
   public WebElement weitrBtn;

   @FindBy(xpath = "(//*[text()='Vorname'])[1]")
   public WebElement vorNameInput;

   @FindBy(xpath = "//*[@id='control']")
   public WebElement führerscheinSelect;


    public void navigateToradioBtn_Mtd(String radioMenu){
        Driver.get().findElement(By.xpath("//laser-radio[text()=' "+radioMenu+" ']")).click();
    }

    public void führerschein_Mtd(){
        Select select = new Select(führerscheinSelect);
        select.selectByVisibleText("A");
    }

















}
