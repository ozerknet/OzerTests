package com.webdriveruniversity.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUs {
    public contactUs() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement last_name;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement message;

    @FindBy(xpath = "//input[@type='reset']")
    public WebElement reset;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//h1")
    public WebElement thankYouMessage;


}
