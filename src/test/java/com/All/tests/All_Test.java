package com.All.tests;

import com.utilities.Driver;
import com.utilities.WebsitesReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class All_Test {
    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get(WebsitesReader.getProperty("all"));

    }
    @Test
    public void All_Test() {

        PageFactory.initElements(Driver.getDriver(), this);


        List<WebElement> allLink = new ArrayList<>();




    }

}
