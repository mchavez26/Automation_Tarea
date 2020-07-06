package com.nearsoft.schools.automation.tests;

import com.nearsoft.schools.automation.framework.DriverHandler;
import com.nearsoft.schools.automation.pages.*;
import com.nearsoft.schools.automation.pages.behaviors.filters.CommonFilterImpl;
import com.nearsoft.schools.automation.pages.behaviors.filters.ShortFilterImpl;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected LandingPage landingPage;
    protected SearchPage searchPage;
    protected WomenPage womenPage;
    protected DressesPage dressesPage;
    protected TShirtPage tshirtPage;
    protected CartPage cartPage; //HW
    protected PrintedChiffonDressPage printedChiffonDressPage; //HW


    BaseTest(){
        landingPage = new LandingPage(DriverHandler.getDriver());
        searchPage = new SearchPage(DriverHandler.getDriver());
        womenPage = new WomenPage(DriverHandler.getDriver(), new CommonFilterImpl(DriverHandler.getDriver()));
        dressesPage = new DressesPage(DriverHandler.getDriver(), new CommonFilterImpl(DriverHandler.getDriver()));
        tshirtPage = new TShirtPage(DriverHandler.getDriver(),new ShortFilterImpl(DriverHandler.getDriver()));
        cartPage = new CartPage(DriverHandler.getDriver()); //HW
        printedChiffonDressPage = new PrintedChiffonDressPage(DriverHandler.getDriver()); //HW

    }
    @BeforeMethod
    public void testSetup(){
        DriverHandler.getDriver().get("http://automationpractice.com/index.php");
    }

    @AfterMethod
    public void teardownTest(){
        DriverHandler.teardown();
    }

    @AfterSuite
    public void teardownSuite(){
        DriverHandler.closeDrive();
    }

}
