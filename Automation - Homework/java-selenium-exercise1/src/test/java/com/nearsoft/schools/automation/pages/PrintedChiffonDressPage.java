package com.nearsoft.schools.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrintedChiffonDressPage extends BasePage{

    private By chiffonText = By.cssSelector(".pb-center-column > h1");

    public PrintedChiffonDressPage(WebDriver webDriver){
        super(webDriver);

    }

    public String isPrintedChiffonDressDisplayed() {
        //return isElementDisplayed(chiffonText);
        return getElementText(chiffonText);
    }
}
