package com.automationexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Test20Page extends BasePage {
    @FindBy(xpath = "//h2[.='All Products']")
    public WebElement allProducts;

    @FindBy(xpath = "//h2[text()='Category']")
    public WebElement category;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProductInput;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement submitSearch;

    @FindBy(xpath = "//h2[.='Searched Products']")
    public WebElement searchedProducts;


    @FindBy(xpath = "//div[@class='features_items']/div[@class='col-sm-4']")
    public List<WebElement> pinkList;

    @FindBy(xpath = "(//a[@data-product-id='12'])[1]")
    public WebElement addToCart;

    @FindBy (xpath = "//button[.='Continue Shopping']")
    public WebElement cintinueShopping;




//    public void addProductToCart()
}
