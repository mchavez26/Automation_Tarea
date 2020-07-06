package com.nearsoft.schools.automation.tests;

import com.nearsoft.schools.automation.framework.DriverHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{
    @Test
    public void Search_UserSearchesWithEmptyCriteria(){
        //Leave searchbox empty
        landingPage.search("");

        //Search page is displayed
        Assert.assertEquals(searchPage.getTabTitle(),"Search - My Store","Tab Title is 'Search - My Store'");
        Assert.assertTrue(searchPage.getPageTitle().startsWith("SEARCH"), "Page title is 'Search'.");

        //Results label is displayed
        Assert.assertEquals(searchPage.getResultsNumber(),"0 results have been found.", "Results found is 0");

        //Alert message is displayed
        Assert.assertEquals(searchPage.getAlertMessage(), "Please enter a search keyword", "'Please enter a search keyboard' alert is displayed");
    }

    @Test
    public void Search_UserSearchesWithValidKeyword(){
        //Enter a valid keyword
        landingPage.search("Blouse");

        //Search keyword is displayed in quotes next to title
        Assert.assertEquals(searchPage.getSearchedKeyword(),"\"BLOUSE\"","Search keyword is displayed in quotes next to title");

        //Results label is displayed
        Assert.assertEquals(searchPage.getResultsNumber(),"1 result has been found.", "Result found is 1");

        //Search item is displayed on the grid
        Assert.assertTrue(searchPage.isItemDisplayedOnGrid("Blouse"),"Search item is displayed on the grid");

    }
}
