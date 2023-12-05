package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**Write the following test
 1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
 1.1 Mouse Hover on “Electronics” Tab
 1.2 Mouse Hover on “Cell phones” and click
 1.3 Verify the text “Cell phones”
 2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
 2.1 Mouse Hover on “Electronics” Tab
 2.2 Mouse Hover on “Cell phones” and click
 2.3 Verify the text “Cell phones”
 2.4 Click on List View Tab
 2.5 Click on product name “Nokia Lumia 1020” link
 2.6 Verify the text “Nokia Lumia 1020”
 2.7 Verify the price “$349.00”
 2.8 Change quantity to 2
 2.9 Click on “ADD TO CART” tab
 2.10 Verify the Message "The product has been added to your shopping cart" on Top
 green Bar
 After that close the bar clicking on the cross button.
 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 2.12 Verify the message "Shopping cart"
 2.13 Verify the quantity is 2
 2.14 Verify the Total $698.00
 2.15 click on checkbox “I agree with the terms of service”
 2.16 Click on “CHECKOUT”
 2.17 Verify the Text “Welcome, Please Sign In!”
 2.18 Click on “REGISTER” tab
 2.19 Verify the text “Register”
 2.20 Fill the mandatory fields
 2.21 Click on “REGISTER” Button
 2.22 Verify the message “Your registration completed”
 2.23 Click on “CONTINUE” tab
 2.24 Verify the text “Shopping card”
 2.25 click on checkbox “I agree with the terms of service”
 2.26 Click on “CHECKOUT”
 2.27 Fill the Mandatory fields
 2.28 Click on “CONTINUE”
 2.29 Click on Radio Button “2nd Day Air ($0.00)”
 2.30 Click on “CONTINUE”
 2.31 Select Radio Button “Credit Card”
 2.32 Select “Visa” From Select credit card dropdown
 2.33 Fill all the details
 2.34 Click on “CONTINUE”
 2.35 Verify “Payment Method” is “Credit Card”
 2.36 Verify “Shipping Method” is “2nd Day Air”
 2.37 Verify Total is “$698.00”
 2.38 Click on “CONFIRM”
 2.39 Verify the Text “Thank You”
 2.40 Verify the message “Your order has been successfully processed!”
 2.41 Click on “CONTINUE”
 2.42 Verify the text “Welcome to our store”
 2.43 Click on “Logout” link
 2.44 Verify the URL is “https://demo.nopcommerce.com/”**/
public class ElectronicsTest extends BaseTest {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    BuildYourOwnComputer buildYourOwnComputer=new BuildYourOwnComputer();
    DesktopPage desktopPage = new DesktopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    ElectronicsPage electronicsPage =new ElectronicsPage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumia1020Page nokiaLumia1020Page = new NokiaLumia1020Page();
    RegisterPage registerPage = new RegisterPage();



    //Write the following test
@Test
//1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        electronicsPage.hoverOnElectronics();                                                                           //Mouse Hover on “Electronics” Tab
        electronicsPage.hoverOnCellPhoneAndClick();                                                                     // Mouse Hover on “Cell phones” and click
        String actualText= cellPhonesPage.getCellPhoneText();                                                           //Verify the text “Cell phones”
        Assert.assertEquals(actualText,"Cell phones","Text not Displayed");
    }

@Test
public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        electronicsPage.hoverOnElectronics();                                                                           //Mouse Hover on “Electronics” Tab
        electronicsPage.hoverOnCellPhoneAndClick();                                                                     //Mouse Hover on “Cell phones” and click
        String actualText= cellPhonesPage.getCellPhoneText();                                                           //Verify the text “Cell phones”
        Assert.assertEquals(actualText,"Cell phones","Text not Displayed");
        cellPhonesPage.clickOnListViewTab();                                                                            //Click on List View Tab
        Thread.sleep(1000);
        cellPhonesPage.clickOnNokiaLumia1020();                                                                         //Click on product name “Nokia Lumia 1020” link
        String actualNokiaLumiaText=nokiaLumia1020Page.getNokiaLumiaText();                                             //Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(actualNokiaLumiaText,"Nokia Lumia 1020","Text not Displayed");
        String actualNokiaPriceText=nokiaLumia1020Page.getNokiaPriceText();
        Assert.assertEquals(actualNokiaPriceText,"$349.00","Text not Displayed");                       //Verify the price “$349.00”
        nokiaLumia1020Page.changeQuantity();                                                                            //Change quantity to 2
        nokiaLumia1020Page.clickOnAddToCartButton();                                                                    // Click on “ADD TO CART” tab
        String actualTextShoppingCart=nokiaLumia1020Page.getTextFromProductAddedToCart();
        Assert.assertEquals(actualTextShoppingCart,"The product has been added to your shopping cart","Text not Displayed");        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar  After that close the bar clicking on the cross button.
        nokiaLumia1020Page.closeTheBarByClickingOnTheCrossButton();
        nokiaLumia1020Page.mouseHoverOnShoppingCart();                                                                  //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020Page.clickOnShoppingCart();
        String actualShoppingCartMessage = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(actualShoppingCartMessage,"Shopping cart","error");                          //Verify the message "Shopping cart"
        Thread.sleep(2000);
        String actualQuantity=shoppingCartPage.getVerifyQuantity();
        Assert.assertEquals(actualQuantity,"(2)","Error");                                               //Verify the quantity is 2
        String actualTotal=shoppingCartPage.getVerifyTotal();
        Assert.assertEquals(actualTotal,"$698.00","Error");                                              //Verify the Total $698.00
        shoppingCartPage.clickOnTermsOfServiceCheckBox();                                                                //click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckOutButton();                                                                        //Click on “CHECKOUT”
        String actualWelcomeText=loginPage.getWelcomePageSignInText();
        Assert.assertEquals(actualWelcomeText,"Welcome, Please Sign In!","Error");                       // Verify the Text “Welcome, Please Sign In!”
        loginPage.clickOnRegisterButton();                                                                               //Click on “REGISTER” tab
        String actualRegisterText=registerPage.getRegisterText();
        Assert.assertEquals(actualRegisterText,"Register","Error");                                      //Verify the text “Register”
        registerPage.inputFirstname("Orange");                                                                            //Fill the mandatory fields
        registerPage.inputLastname("Purple");
        registerPage.inputEmail("orangepurple@gmail.com");
        registerPage.inputPassword("Orange@purple");
        registerPage.inputConfirmPassword("Orange@purple");
        registerPage.clickOnRegisterButton();                                                                           //Click on “REGISTER” Button
        String actualRegisterSuccessMessage = registerPage.getRegisterSuccessText();                                    //Verify the message “Your registration completed”
        Assert.assertEquals(actualRegisterSuccessMessage,"Your registration completed","error");
        registerPage.clickOnContinueButton();                                                                           //Click on “CONTINUE” tab
        shoppingCartPage.getShoppingCartText();                                                                         //Verify the text “Shopping card”
    }
}


