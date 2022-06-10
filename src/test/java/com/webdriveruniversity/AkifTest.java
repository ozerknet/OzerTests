package com.webdriveruniversity;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import com.utilities.WebsitesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AkifTest {


    @Test (priority = 1, description = "Testing contact us form reset functionality")
    public void resetTesting() {

        Driver.getDriver().get(WebsitesReader.getProperty("contactus"));

        //Locating all contact us form elements
        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='first_name']"));
        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='last_name']"));
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        WebElement comments = Driver.getDriver().findElement(By.xpath("//textarea[@name='message']"));

        Faker faker = new Faker();

        //Complete all the form by random inputs
        String fakerFirstName = faker.name().firstName();
        firstName.sendKeys(fakerFirstName);

        String fakerLastName = faker.name().lastName();
        lastName.sendKeys(fakerLastName);

        email.sendKeys(fakerFirstName+fakerLastName+"@gmail.com");

        String fakerComments = faker.lorem().paragraph();
        comments.sendKeys(fakerComments);


        WebElement resetButton = Driver.getDriver().findElement(By.xpath("//input[@type='reset']"));
        resetButton.click();

       Assert.assertTrue((firstName.getText().isEmpty()&&(lastName.getText().isEmpty())&&(email.getText().isEmpty())&&(comments.getText().isEmpty())));

    }

    @Test (priority = 2, description = "Testing contact us from submit functionality")
    public void submitTesting(){

        Driver.getDriver().get(WebsitesReader.getProperty("contactus"));

        //Locating all contact us form elements
        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='first_name']"));
        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='last_name']"));
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        WebElement comments = Driver.getDriver().findElement(By.xpath("//textarea[@name='message']"));

        Faker faker = new Faker();

        //Complete all the form by random inputs
        String fakerFirstName = faker.name().firstName();
        firstName.sendKeys(fakerFirstName);

        String fakerLastName = faker.name().lastName();
        lastName.sendKeys(fakerLastName);

        email.sendKeys(fakerFirstName+fakerLastName+"@gmail.com");

        String fakerComments = faker.lorem().paragraph();
        comments.sendKeys(fakerComments);


        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        WebElement thankYouMessage = Driver.getDriver().findElement(By.xpath("//h1"));

        Assert.assertTrue(thankYouMessage.isDisplayed());




    }




}
