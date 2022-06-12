package com.automationexercise.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//li//a[@href='/']")
    public WebElement home;

    //li//a[@href='/products']
    @FindBy(xpath = "//li//a[@href='/products']")
    public WebElement products;

    //li//a[@href='/view_cart']
    @FindBy(xpath = "//li//a[@href='/view_cart']")
    public WebElement view_cart;

    //li//a[@href='/login']
    @FindBy(xpath = "//li//a[@href='/login']")
    public WebElement login;

    //li//a[@href='/test_cases']
    @FindBy(xpath = " //li//a[@href='/test_cases']")
    public WebElement test_cases;

    //li//a[@href='/api_list']
    @FindBy(xpath = "//li//a[@href='/api_list']")
    public WebElement api_list;

    //li//a[@href='/contact_us']
    @FindBy(xpath = "//li//a[@href='/contact_us']")
    public WebElement contact_us;

}
