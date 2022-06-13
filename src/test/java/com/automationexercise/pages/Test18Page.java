package com.automationexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class Test18Page {


    @FindBy(xpath = "//h2[text()='Category']")
    public WebElement category;

    @FindBy(xpath = "(//a[@data-toggle='collapse'])[1]")
    public WebElement women;

    @FindBy (xpath = "//div[@class='panel-body']")
    public List<WebElement> womenPanelBody;


}
