package com.webdriveruniversity;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import com.utilities.WebsitesReader;
import com.webdriveruniversity.pages.contactUs;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class contactusTest {

    contactUs contactUs = new contactUs();

    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get(WebsitesReader.getProperty("contactus"));

    }

    @Test
    public void Test1() {
        PageFactory.initElements(Driver.getDriver(), this);

        Faker faker = new Faker();

        String name = faker.name().firstName();
        String lastname = faker.name().lastName();
        String email = name + lastname + "@gmail.com";

        ArrayList<String> nameSurname = new ArrayList<>();
        for (int i = 1; i < 10; i++) {


            contactUs.firstName.sendKeys(name);
            contactUs.last_name.sendKeys(lastname);
            contactUs.email.sendKeys(email);
            contactUs.message.sendKeys(faker.lorem().word());
            contactUs.submit.click();
            contactUs.thankYouMessage.isDisplayed();

            Driver.getDriver().navigate().back();

            try {
                //assertFalse method will pass the test if the boolean value returned is: false
                Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
                Assert.assertTrue((contactUs.firstName.getText().isEmpty()) && (contactUs.last_name.getText().isEmpty()) && (contactUs.email.getText().isEmpty()) && (contactUs.message.getText().isEmpty()));
            } catch (NoSuchElementException n) {
                Assert.assertTrue(true);
            }

            contactUs.reset.click();


            nameSurname.add("" + name + "" + "" + lastname + "");
        }

        System.out.println("nameSurname = " + nameSurname);

    }
}
