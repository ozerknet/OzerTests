package com.cydeo.tests;

import com.cydeo.pages.Nmr;
import com.utilities.Driver;
import com.utilities.WebsitesReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Notification_message_rendered {

    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get(WebsitesReader.getProperty("notification_message_rendered"));

    }
    @Test
    public void Notification_message_rendered() {

        PageFactory.initElements(Driver.getDriver(), this);

        Nmr Nmr = new Nmr();

        Nmr.clickHere.click();




    }

}

