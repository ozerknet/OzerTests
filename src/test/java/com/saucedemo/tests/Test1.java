package com.saucedemo.tests;

import com.saucedemo.pages.SauceDemo;
import com.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

    }
    @Test
    public void SauceDemoTest() {

        PageFactory.initElements(Driver.getDriver(), this);

        SauceDemo Sd = new SauceDemo();




    }



}
