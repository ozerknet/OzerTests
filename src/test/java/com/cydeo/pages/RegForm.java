package com.cydeo.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegForm {
    public RegForm() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@name='firstname'] ")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname'] ")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='username'] ")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='email'] ")
    public WebElement email;

    @FindBy(xpath = "//input[@name='phone'] ")
    public WebElement phone;

    @FindBy(xpath = "(//input[@name='gender'])[1] ")
    public WebElement genderMale;

    @FindBy(xpath = "//input[@name='birthday'] ")
    public WebElement birtday;

    @FindBy(xpath = " //select[@name='department']")
    public WebElement deparmant;






}
