package com.telerik.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class getInTouch {

    public getInTouch(String url) {
        PageFactory.initElements(Driver.getDriver(), this);
        Driver.getDriver();
    }

    @FindBy(id = "Dropdown-1")
    public WebElement whatCanWeHelpYouWith;

    @FindBy(id = "Dropdown-2")
    public WebElement productInterest;

    @FindBy(id = "Textbox-1")
    public WebElement firstName;

    @FindBy(id = "Textbox-2")
    public WebElement lastName;

    @FindBy(id = "Email-1")
    public WebElement businessEmail;

    @FindBy(id = "Textbox-3")
    public WebElement companyName;

    @FindBy(id = "Country-1")
    public WebElement country;

    @FindBy(id = "Textbox-4")
    public WebElement phone;

    @FindBy(id = "Textarea-1")
    public WebElement comments;

    @FindBy(css = ".Btn")
    public WebElement submitButton;


}
