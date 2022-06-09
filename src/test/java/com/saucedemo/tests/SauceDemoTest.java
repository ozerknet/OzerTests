package com.saucedemo.tests;

import com.saucedemo.pages.SauceDemo;
import com.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoTest {

SauceDemo sauceDemo=new SauceDemo();
@BeforeMethod
    public void setupMethod(){
    Driver.getDriver().get("https://www.saucedemo.com/");}
@Test
        public void test(){

    sauceDemo.username.sendKeys("standard_user");

    sauceDemo.password.sendKeys("secret_sauce");
    sauceDemo.login.click();




}
}
