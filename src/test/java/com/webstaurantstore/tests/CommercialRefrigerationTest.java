package com.webstaurantstore.tests;

import com.utilities.Driver;
import com.webstaurantstore.pages.CommercialRefrigeration;
import org.testng.annotations.Test;

public class CommercialRefrigerationTest {

     CommercialRefrigeration ComRefPage = new CommercialRefrigeration();
     @Test
     public void Test1(){
          Driver.getDriver().get("https://www.webstaurantstore.com/");
          ComRefPage.accountButton.click();
     }
}
