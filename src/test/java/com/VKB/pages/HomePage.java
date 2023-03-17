package com.VKB.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div/*[text()='HOME']")
    public WebElement homePage;

    @FindBy(xpath = "(//*[@class='navbar__options__btn-option__label'])[1]")
    public WebElement schadenFreiheitsRabatt;

    @FindBy(xpath = "(//*[@class='navbar__options__btn-option__label'])[2]")
    public WebElement unwetterSchaden;

    @FindBy(xpath = "(//*[@class='navbar__options__btn-option__label'])[3]")
    public WebElement teilKaskoSturm;










}
