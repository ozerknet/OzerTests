package com.webdriveruniversity;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import com.utilities.WebsitesReader;
import com.webdriveruniversity.pages.contactUs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class AkifTest {

    contactUs contactUs = new contactUs();

    @Test (priority = 1, description = "Testing contact us form reset functionality")
    public void resetTesting() {

        Driver.getDriver().get(WebsitesReader.getProperty("contactus"));

        Faker faker = new Faker();

        //Complete all the form by random inputs
        String fakerFirstName = faker.name().firstName();
        contactUs.firstName.sendKeys(fakerFirstName);

        String fakerLastName = faker.name().lastName();
        contactUs.last_name.sendKeys(fakerLastName);

        contactUs.email.sendKeys(fakerFirstName+fakerLastName+"@gmail.com");

        String fakerComments = faker.lorem().paragraph();
        contactUs.message.sendKeys(fakerComments);


        WebElement resetButton = Driver.getDriver().findElement(By.xpath("//input[@type='reset']"));
        resetButton.click();

       Assert.assertTrue((contactUs.firstName.getText().isEmpty()
               &&(contactUs.last_name.getText().isEmpty())
               &&(contactUs.email.getText().isEmpty())
               &&(contactUs.message.getText().isEmpty())));

    }

    @Test (priority = 2, description = "Testing contact us from submit functionality")
    public void submitTesting(){

        Driver.getDriver().get(WebsitesReader.getProperty("contactus"));

        Faker faker = new Faker();

        String fakerFirstName = faker.name().firstName();
        contactUs.firstName.sendKeys(fakerFirstName);

        String fakerLastName = faker.name().lastName();
        contactUs.last_name.sendKeys(fakerLastName);

        contactUs.email.sendKeys(fakerFirstName+fakerLastName+"@gmail.com");

        String fakerComments = faker.lorem().paragraph();
        contactUs.message.sendKeys(fakerComments);


        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        WebElement thankYouMessage = Driver.getDriver().findElement(By.xpath("//h1"));

        Assert.assertTrue(thankYouMessage.isDisplayed());




    }




}
