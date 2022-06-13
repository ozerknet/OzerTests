package com.automationexercise.tests;

import com.automationexercise.pages.BasePage;
import com.automationexercise.pages.Test18Page;
import com.github.javafaker.Faker;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.time.Period.between;

public class Test18 {


    @Test
    public void Test18() {



    }

}
/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that categories are visible on left side bar
4. Click on 'Women' category
5. Click on any category link under 'Women' category, for example: Dress
6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
7. On left side bar, click on any sub-category link of 'Men' category
8. Verify that user is navigated to that category page
 */