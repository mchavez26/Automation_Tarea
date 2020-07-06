package com.nearsoft.schools.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public CartPage(WebDriver webDriver){
        super(webDriver);
     }

    private By shoppingCartSummary = By.id("cart_title");
    private By alertWarningBy2 = By.cssSelector(".alert-warning");

    public boolean isYourShoppingCartDisplayed() {
        return isElementDisplayed(shoppingCartSummary);
    }

    public String getAlertMessage2() {
        return getElementText(alertWarningBy2);
    }


}
