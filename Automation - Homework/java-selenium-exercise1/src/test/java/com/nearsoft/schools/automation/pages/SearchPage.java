package com.nearsoft.schools.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{

    private By pageTitleBy = By.cssSelector(".page-heading");
    private By resultsCountBy = By.cssSelector(".heading-counter");
    private By alertWarningBy = By.cssSelector(".alert-warning");
    private By searchedKeywordBy = By.cssSelector(".lighter");

    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getTabTitle(){
        return super.getTabTitle();
    }

    public String getPageTitle() {
        return getElementText(pageTitleBy);
    }

    public String getResultsNumber() {
        return getElementText(resultsCountBy);
    }

    public String getAlertMessage() {
        return getElementText(alertWarningBy);
    }

    public String getSearchedKeyword() {
        return getElementText(searchedKeywordBy);
    }

    public boolean isItemDisplayedOnGrid(String blouse) {
        By locator = By.cssSelector("ul.product_list a.product-name[title='" + blouse +"']");
        return isElementDisplayed(locator);
    }
}
