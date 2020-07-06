package com.nearsoft.schools.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ISuite;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver webDriver){
        super(webDriver);
    }

    private By logoBy = By.cssSelector(".logo");
    private By searchBoxBy = By.id("search_query_top");
    private By searchButtonBy = By.name("submit_search");
    private By cartPreviewBy = By.cssSelector(".shopping_cart > a:nth-child(1)"); //HW
    private By chiffonDress = By.cssSelector("li.ac_even:nth-child(3)"); //HW
    private By removeItemButton = By.cssSelector("dt.first_item > span:nth-child(3) > a:nth-child(1)"); //HW
    private By numberOfProducts = By.cssSelector("span.ajax_cart_quantity:nth-child(2)"); //HW


    public boolean isLogoDisplayed() {
        return isElementDisplayed(logoBy);
    }

    //public void clickLogo(){
    //    WebElement logoElement = isElementDisplayed(logoBy);
    //    logoElement.click();
    //}

    public boolean isSearchBoxDisplayed(){
        return isElementDisplayed(searchBoxBy);
    }

    public boolean isCartPreviewDisplayed(){
        return isElementDisplayed(cartPreviewBy);

    }

    public void search(String keyword) {
        sendText(searchBoxBy,keyword);
        click(searchButtonBy);
    }

    public void hoverMenuButton(String menuButton) {
        Actions actions = new Actions(getWebDriver());
        By locator = By.cssSelector("div#block_top_menu a[title='" + menuButton + "']");
        WebElement menuElem = findElement(locator);
        actions.moveToElement(menuElem).perform();
    }

    public boolean isSubmenuDisplayed(String menuButton) {
        By locator = By.cssSelector("div#block_top_menu a[title='" + menuButton + "'] + ul");
        return isElementDisplayed(locator);
    }

    public void selectButtonFromMenu(String menuButton) {
        //click(By.cssSelector("div#block_top_menu a[title='" + menuButton + "']"));
        click(By.cssSelector("#block_top_menu > ul > li > a[title=" + menuButton + "]"));
        WebDriverWait wait = new WebDriverWait(getWebDriver(), 5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".category-name")));
    }

    public void selectCartPreview() { //HW
        click(cartPreviewBy); //HW
    } //HW

    public void typeSearchBox(String summer) { //HW
        sendText(searchBoxBy,summer); //HW
    } //HW

    public void selectChiffonDress() { //HW
        click(chiffonDress); //HW
    } //HW

    public void hoverCartPreview() {
        Actions actions = new Actions(getWebDriver());
        By locator = By.cssSelector(".shopping_cart a");
        WebElement menuElem = findElement(locator);
        actions.moveToElement(menuElem).perform();
    }

    public void removeFirstItem() { //HW
        click(removeItemButton); //HW
        timeOut3Seconds(); //HW
    }

    public String numberOfProductsInCart() { //HW
        return getElementText(numberOfProducts); //HW
    } //HW
}
