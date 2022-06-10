package com.telerik.tests;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import com.utilities.WebsitesReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.telerik.pages.getInTouch;

public class getInTouchTest {

    getInTouch getInTouch = new getInTouch(WebsitesReader.getProperty("GetInTouch"));


    @Test
    public void Test1() {
        PageFactory.initElements(Driver.getDriver(), this);

        Faker faker = new Faker();

        //getInTouch.whatCanWeHelpYouWith.
        getInTouch.productInterest.sendKeys("3");
        getInTouch.firstName.sendKeys(faker.name().firstName());
        getInTouch.lastName.sendKeys(faker.name().lastName());
        getInTouch.businessEmail.sendKeys(faker.name()+"@gmail.com");
        getInTouch.companyName.sendKeys(faker.company().name());
        //getInTouch.country
        getInTouch.phone.sendKeys(faker.phoneNumber().cellPhone());
        getInTouch.comments.sendKeys(faker.lorem().word());
    }
}
