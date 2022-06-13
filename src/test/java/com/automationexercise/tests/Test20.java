package com.automationexercise.tests;

import com.automationexercise.pages.BasePage;
import com.automationexercise.pages.Test20Page;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Test20 {
    BasePage basePage = new BasePage();
    Test20Page test20Page = new Test20Page();

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void Test20(){

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


        //3. Click on 'Products' button
        basePage.products.click();


        //4. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(test20Page.allProducts.isDisplayed());


        //5. Enter product name in search input and click search button
        test20Page.searchProductInput.sendKeys("pink");
        test20Page.submitSearch.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //6. Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertTrue(test20Page.searchedProducts.isDisplayed());

        //7. Verify all the products related to search are visible
        List<WebElement> resultList = test20Page.pinkList;
        int numberOfFindProducts = resultList.size();
        for (WebElement pink : resultList) {
            int a=0;
            if(pink.getText().equalsIgnoreCase("pink")){
                a++;
            };
            if(numberOfFindProducts==a){
                System.out.println("Test passed");
            }
        }
        //8. Add those products to cart

        for (WebElement webElement : resultList) {
//            wait.until(ExpectedConditions.visibilityOf(test20Page.addToCart));
//            test20Page.addToCart.click();
//            wait.until(ExpectedConditions.visibilityOf(test20Page.continueShopping));
//            test20Page.continueShopping.click();

        }



        //9. Click 'Cart' button and verify that products are visible in cart
            basePage.view_cart.click();

        //10. Click 'Signup / Login' button and submit login details
        //11. Again, go to Cart page
        //12. Verify that those products are visible in cart after login as well

    }

}

/*
Test Case 20: Search Products and Verify Cart After Login
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify user is navigated to ALL PRODUCTS page successfully
5. Enter product name in search input and click search button
6. Verify 'SEARCHED PRODUCTS' is visible
7. Verify all the products related to search are visible
8. Add those products to cart
9. Click 'Cart' button and verify that products are visible in cart
10. Click 'Signup / Login' button and submit login details
11. Again, go to Cart page
12. Verify that those products are visible in cart after login as well
 */