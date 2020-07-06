package com.nearsoft.schools.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private WebDriver webDriver;
    public WebDriverWait webDriverWait; //HW
    private Actions actions; //HW

    protected BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver,30); //HW
        this.actions = new Actions(webDriver); //HW
    }

    protected WebDriver getWebDriver(){
        return webDriver;
    }

    protected Actions getActions(){ //HW
        return actions; //HW
    } //HW

    //encontrar elemento
    protected WebElement findElement(By locator){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator)); //HW
        return getWebDriver().findElement(locator);
    }

    protected void timeOut3Seconds (){ //HW
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
             e.printStackTrace();
         }
        //getWebDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //HW
    } //HW

    protected List<WebElement> findElements(By locator){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator)); //HW
        return getWebDriver().findElements(locator);
    }

    protected void click(By locator) {findElement(locator).click(); } //HW

    //introducir texto en elemento
    protected void sendText(By locator, String text){
        findElement(locator).sendKeys(text);
    }

    //checar que este visible
    protected boolean isElementDisplayed(By locator){
        //try {
        //     return findElement(locator).isDisplayed();
        //} catch(NoSuchElementException ex){
        //    return false;
        //}
        WebElement element = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator)); //HW
        return element.isDisplayed(); //HW
    }

    protected String getTabTitle(){
        return getWebDriver().getTitle();
    }

    protected String getElementText(By locator){
        return findElement(locator).getText();
    }
}
