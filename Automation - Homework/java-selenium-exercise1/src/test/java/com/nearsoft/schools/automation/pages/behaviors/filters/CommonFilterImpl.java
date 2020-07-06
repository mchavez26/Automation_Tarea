package com.nearsoft.schools.automation.pages.behaviors.filters;

import com.nearsoft.schools.automation.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonFilterImpl extends BasePage implements IFilterBehavior{
    public CommonFilterImpl(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectFilter(String category, String option) {
        List<WebElement> filterSections = findElements(By.cssSelector("div#layered_block_left .layered_filter"));
        for (WebElement filterElement :filterSections) {
            String sectionName = filterElement.findElement(By.cssSelector(".layered_subtitle")).getText();
            if (category.equals(sectionName)){
                List<WebElement> optionsElements = filterElement.findElements(By.cssSelector("ul.layered_filter_ul li"));
                for (WebElement optionElement : optionsElements){
                    WebElement link = optionElement.findElement(By.cssSelector("label a"));
                    String optionName = link.getText();
                    if(optionName.startsWith(option)){
                        link.click();
                        return;
                    }
                }
            }
        }
    }

    public boolean isFilterSelected(String category, String option) {
        return false;
    }
}
