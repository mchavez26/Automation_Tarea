package com.nearsoft.schools.automation.tests;

import org.testng.annotations.Test;

public class FiltersTest extends BaseTest {

    @Test
    public void Filters_UserSelectsAFilter_Women(){
        //Click on Women
        landingPage.selectButtonFromMenu("Women");

        //Select a Filter
        womenPage.selectFilter("Size","M");

        //Check if filter is selected

    }

    @Test
    public void Filters_UserSelectsAFilter_Dresses(){
        //Click on Women
        landingPage.selectButtonFromMenu("Dresses");

        //Select a Filter
        dressesPage.selectFilter("Size","M");
    }

    @Test
    public void Filters_UserSelectsAFilter_TShirt(){
        //Click on Women
        landingPage.selectButtonFromMenu("T-shirts"); //se equivoco

        //Select a Filter
        tshirtPage.selectFilter("Styles","Casual");
    }

}
