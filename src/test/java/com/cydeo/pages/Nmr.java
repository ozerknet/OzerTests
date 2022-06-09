package com.cydeo.pages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.WebsitesReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nmr {

    public Nmr(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[.='Click here']")
    public WebElement clickHere;

    @FindBy (xpath = "//div[@id='flash']")
    public WebElement actionSuccessfull;


}
