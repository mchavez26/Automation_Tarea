package com.nearsoft.schools.automation.tests;

import com.nearsoft.schools.automation.framework.DriverHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{

    @Test
    public void UserNavigatesToEmptyCart(){
        landingPage.selectCartPreview();
        Assert.assertTrue(cartPage.isYourShoppingCartDisplayed(), "SHOPPING-CART SUMMARY is displayed");
        Assert.assertEquals(cartPage.getAlertMessage2(), "Your shopping cart is empty.", "'Empty Shopping Cart' alert is displayed");
    }

    @Test
    public void AddItemCart_Grid(){
        landingPage.selectButtonFromMenu("Dresses");
        dressesPage.selectGridView();
        dressesPage.hoverDress1();
        dressesPage.selectAddToCart();
      //Assert.assertTrue(dressesPage.isProductAddedMessageDisplayed(),"Product successfully added to your shopping cart");
        Assert.assertEquals(dressesPage.isProductAddedMessageDisplayed(), "Product successfully added to your shopping cart", "Product added Message displayed correctly.");
    }

    @Test
    public void AddItemCart_List(){
        landingPage.selectButtonFromMenu("Dresses");
        dressesPage.selectListView();
        dressesPage.selectAddToCart();
      //Assert.assertTrue(dressesPage.isProductAddedMessageDisplayed(),"Product successfully added to your shopping cart");
        Assert.assertEquals(dressesPage.isProductAddedMessageDisplayed(), "Product successfully added to your shopping cart", "Product added Message displayed correctly.");

    }

    @Test
    public void EnterSummerInSearchbox(){
        landingPage.typeSearchBox("Summer ");
        landingPage.selectChiffonDress();
        //Assert.assertTrue(printedChiffonDressPage.isPrintedChiffonDressDisplayed(),"Printed Chiffon Dress Text is displayed");
        Assert.assertEquals(printedChiffonDressPage.isPrintedChiffonDressDisplayed(), "Printed Chiffon Dress", "Printed Chiffon Dress Text is displayed");

    }

    @Test
    public void RemoveItemFromCart(){
        //Preconditions
        landingPage.selectButtonFromMenu("Women");
        womenPage.selectListView();
        womenPage.selectAddToCart2();
        womenPage.selectCloseX();
        womenPage.selectAddToCart3();
        womenPage.selectCloseX();
        DriverHandler.getDriver().get("http://automationpractice.com/index.php");

        //Test
        landingPage.hoverCartPreview();
        landingPage.removeFirstItem();
        Assert.assertEquals(landingPage.numberOfProductsInCart(), "1", "Only 1 product in Cart");
    }

}

