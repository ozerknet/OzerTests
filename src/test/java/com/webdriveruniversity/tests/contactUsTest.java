package com.webdriveruniversity.tests;

import com.github.javafaker.Faker;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import com.utilities.WebsitesReader;
import com.webdriveruniversity.pages.contactUs;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class contactUsTest {

    contactUs contactUs = new contactUs();

    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get(WebsitesReader.getProperty("contactus"));

    }

    @Test
    public void Test1() {
        PageFactory.initElements(Driver.getDriver(), this);

        Faker faker = new Faker();


        ArrayList<String> nameSurname = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            String name = null;
            String lastname = null;
            String email = null;

            name = faker.name().firstName();
            lastname = faker.name().lastName();
            email = name + "@gmail.com";

            contactUs.firstName.sendKeys(name);
            contactUs.last_name.sendKeys(lastname);
            contactUs.email.sendKeys(email);
            contactUs.message.sendKeys(faker.lorem().word());
            contactUs.submit.click();
            contactUs.thankYouMessage.isDisplayed();

            Driver.getDriver().navigate().back();


            contactUs.reset.click();


            Assert.assertTrue((contactUs.firstName.getText().isEmpty()) && (contactUs.last_name.getText().isEmpty()) && (contactUs.email.getText().isEmpty()) && (contactUs.message.getText().isEmpty()));

            BrowserUtils.sleep(3);

            nameSurname.add("" + name + " " + " " + lastname + "");
        }

        System.out.println("nameSurname = " + nameSurname);

    }
}
