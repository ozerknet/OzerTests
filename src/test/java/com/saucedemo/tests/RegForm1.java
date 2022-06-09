package com.saucedemo.tests;

import com.cydeo.pages.RegForm;
import com.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegForm1 {
    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");

    }
    @Test
    public void tes1(){
        RegForm regForm= new RegForm();
        regForm.firstName.sendKeys("ali");
        regForm.lastName.sendKeys("veli");
        regForm.userName.sendKeys("aliwewewe");
        regForm.email.sendKeys("r.yttrtr@gmail.com");
        regForm.password.sendKeys("323232323244");
        regForm.phone.sendKeys("323-232-2223");
        regForm.genderMale.click();
        regForm.birtday.sendKeys("01/01/1990");
        Select departeantDropDown= new Select(regForm.deparmennt);
        departeantDropDown.selectByVisibleText("Department of Engineering");
        Select jobTitleDropDown= new Select(regForm.jobTitle);
        jobTitleDropDown.selectByVisibleText("QA");
        regForm.javaButton.click();
        regForm.signUpButton.click();
        System.out.println("regForm.wellDone.isDisplayed() = " + regForm.wellDone.isDisplayed());


    }

}
