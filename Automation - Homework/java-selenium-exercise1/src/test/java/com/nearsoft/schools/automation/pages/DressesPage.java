package com.nearsoft.schools.automation.pages;

import com.nearsoft.schools.automation.pages.behaviors.filters.IFilterBehavior;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DressesPage extends BasePage {

    private IFilterBehavior filter;
    public DressesPage(WebDriver webDriver, IFilterBehavior filter) {
        super(webDriver);
        this.filter = filter;
    }

    private By gridView = By.cssSelector(".icon-th-large"); //HW
    private By listView = By.cssSelector(".icon-th-list"); //HW
    // private By addToCart = By.cssSelector("li.ajax_block_product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > a:nth-child(1) > span:nth-child(1)");
    //private By addToCart = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]");
    private By addToCart = By.cssSelector("a[data-id-product=\"3\"] span"); //HW

    //private By productAddedMessage = By.cssSelector("div#layer_cart h2 i");
    private By productAddedMessage = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2");
    //private By productAddedMessage = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/text()");
    public void selectFilter(String category, String option) {
        filter.selectFilter(category, option);
    }

    public void selectGridView() { //HW
        click(gridView); //HW
    } //HW

    public void selectListView(){
        click(listView);
    }

    public void hoverDress1() { //HW
        Actions actions = new Actions(getWebDriver());
        By locator = By.cssSelector("li.ajax_block_product:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)");
        WebElement menuElem = findElement(locator);
        actions.moveToElement(menuElem).perform();
    }

    public void selectAddToCart() { //HW
        click(addToCart);
        timeOut3Seconds();
    }



    public String isProductAddedMessageDisplayed() {
     // return isElementDisplayed(productAddedMessage);
        return getElementText(productAddedMessage);
    }

}
