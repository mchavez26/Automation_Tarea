package com.nearsoft.schools.automation.pages.behaviors.filters;

import com.nearsoft.schools.automation.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShortFilterImpl extends BasePage implements IFilterBehavior {
    public ShortFilterImpl(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectFilter(String category, String option) {
        click(By.xpath("//div[div[span[text()='" + category + "']]]/ul/li/label/a[contains(text(),'"+ option + "')]"));
    }

    public boolean isFilterSelected(String category, String option) {
        return false;
    }
}
