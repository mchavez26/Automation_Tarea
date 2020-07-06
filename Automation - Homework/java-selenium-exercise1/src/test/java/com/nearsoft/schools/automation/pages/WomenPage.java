package com.nearsoft.schools.automation.pages;

import com.nearsoft.schools.automation.pages.behaviors.filters.CommonFilterImpl;
import com.nearsoft.schools.automation.pages.behaviors.filters.IFilterBehavior;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WomenPage extends BasePage{

    private By addToCart2 = By.cssSelector("a[data-id-product=\"1\"] span");//HW
    private By addToCart3 = By.cssSelector("a[data-id-product=\"2\"] span");//HW
    private IFilterBehavior filter;
    private By listView = By.cssSelector(".icon-th-list"); //HW
    private By Xbutton = By.cssSelector(".cross");

    public WomenPage(WebDriver webDriver,IFilterBehavior filter) {
        super(webDriver);
        this.filter = filter;
    }

    public void selectFilter(String category, String option) {
        filter.selectFilter(category, option);
    }

    public void selectListView(){
        click(listView);
    }

    public void selectAddToCart2(){ //HW
        click(addToCart2); //HW
        timeOut3Seconds(); //HW
    }

    public void selectAddToCart3(){ //HW
        click(addToCart3); //HW
        timeOut3Seconds(); //HW
    }

    public void selectCloseX() {
        click(Xbutton); //HW
    }
}
