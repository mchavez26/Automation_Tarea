package com.nearsoft.schools.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LandingTest extends BaseTest{
    @Test
    public void Landing_UserNavigatesToProductURL(){

        Assert.assertTrue(landingPage.isLogoDisplayed(),"Logo is displayed");
        Assert.assertTrue(landingPage.isSearchBoxDisplayed(),"Search box is displayed");
        Assert.assertTrue(landingPage.isCartPreviewDisplayed(),"Cart preview is displayed");
    }

    @Test
    public void Menu_UserHoversMenuToDisplaySubmenus(){
        //Mouse over a button in the Menu
        landingPage.hoverMenuButton("Women");

        //Woman submenu is displayed
        Assert.assertTrue(landingPage.isSubmenuDisplayed("Women"),"Women submenu is displayed");
    }

}
