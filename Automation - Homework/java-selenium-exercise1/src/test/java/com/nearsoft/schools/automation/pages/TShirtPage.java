package com.nearsoft.schools.automation.pages;

import com.nearsoft.schools.automation.pages.behaviors.filters.IFilterBehavior;
import org.openqa.selenium.WebDriver;

public class TShirtPage extends BasePage{

    IFilterBehavior filter;

    public TShirtPage(WebDriver webDriver, IFilterBehavior filter) {
        super(webDriver);
        this.filter = filter;
    }

    public void selectFilter(String category, String option){
        filter.selectFilter(category, option);
    }
}
