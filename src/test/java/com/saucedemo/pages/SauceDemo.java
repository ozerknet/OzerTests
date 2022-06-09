package com.saucedemo.pages;


import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemo {
    public SauceDemo() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath ="//input[@type='submit'] ")
    public WebElement login;

    @FindBy(tagName = "//h3")
    public WebElement message;
}
