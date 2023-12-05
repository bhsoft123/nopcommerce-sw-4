package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    BuildYourOwnComputer buildYourOwnComputer=new BuildYourOwnComputer();
    DesktopPage desktopPage = new DesktopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();

    //1. Create class “ComputerTest” into testsuite package
    //Write the following Test:
    @Test
    //1.Test name verifyProductArrangeInAlphaBaticalOrder()
    public void verifyProductArrangeInAlphaBaticalOrder() {
        //1.1 Click on Computer Menu.
        homePage.clickOnComputerMenu();
        //1.2 Click on Desktop
        homePage.clickOnDesktop();
        //1.3 Select Sort By position "Name: Z to A"
        homePage.selectSortByNameZtoA("Name: Z to A");
        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(homePage.originalProduct(),homePage.sortedProduct(),"Error");
    }

    @Test
    //2. Test name verifyProductAddedToShoppingCartSuccessFully()
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        homePage.clickOnComputerMenu();
        //2.2 Click on Desktop
        homePage.clickOnDesktop();
        //2.3 Select Sort By position "Name: A to Z"
        computerPage.selectSortByNameAtoZ("Name: A to Z");
        //2.4 Click on "build you own computer"
        //driver.findElement(By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']")).click();
        Thread.sleep(3000);
        desktopPage.buildYourOwnComputer();
        //2.5 Verify the Text "Build your own computer"
        Assert.assertEquals(buildYourOwnComputer.getTextFromBuildYourComputer(),"Build your own computer","Text not Displayed");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputer.selectProcessor();                                                                         //Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        //2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputer.selectRAM();
        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputer.selectHDDRadio();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputer.selectOSRadio();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
        buildYourOwnComputer.selectTotalCommander();
        //2.11 Verify the price "$1,475.00"
        //Assert.assertEquals(buildYourOwnComputer.getTextFromPrice(),"$1,300.00","Text not Displayed");
        //2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputer.clickOnAddToCartButton();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top//green Bar
        buildYourOwnComputer.verifyTheProductHasBeenAddedToYourShoppingCart();
        buildYourOwnComputer.closeTheBarByClickingOnTheCrossButton();
        //After that close the bar clicking on the cross button.
        buildYourOwnComputer.mouseHoverOnShoppingCartButton();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputer.clickOnGoToCartButton();
        //2.15 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCartPage.getShoppingCartText(),"Shopping cart","error");
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeQuantity();
        shoppingCartPage.clickOnUpdateCartButton();
        //2.17 Verify the Total"$2,950.00"
        Assert.assertEquals(shoppingCartPage.getTotalText(),"$2,950.00","error");
        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckBox();
        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(loginPage.getWelcomePageSignInText(),"Welcome, Please Sign In!","error");
        //2.21Click on “CHECKOUT AS GUEST” Tab
        loginPage.clickOnCheckoutAsGuestButton();
        //2.22 Fill the all mandatory field
        Thread.sleep(3000);
        shoppingCartPage.fillMandatoryFields();
        //2.23 Click on “CONTINUE”
        shoppingCartPage.clickOnContinueButton();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        shoppingCartPage.clickOnNextDayAirRadioButton();
        //2.25 Click on “CONTINUE”
        shoppingCartPage.clickOnContinueButton1();
        //2.26 Select Radio Button “Credit Card”
        shoppingCartPage.clickOnCreditCard();
        //2.27 Select “Master card” From Select credit card dropdown
        shoppingCartPage.selectMasterCard("Master card");
        //shoppingCartPage.clickOnPaymentContinueButton();
        //2.28 Fill all the details
        //shoppingCartPage.fillCreditCardMandatoryFields();
        //2.29 Click on “CONTINUE”
        shoppingCartPage.clickOnRadioButton2ndDayAir();
        //2.30 Verify “Payment Method” is “Credit Card”
        //Assert.assertEquals(shoppingCartPage.getCreditCardText(),"Credit Card","error");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        //Assert.assertEquals(shoppingCartPage.getNextDayAirText(),"Next Day Air","error");
        //2.33 Verify Total is “$2,950.00”
        //Assert.assertEquals(shoppingCartPage.getTotalAmountText(),"$2,950.00","error");
        //2.34 Click on “CONFIRM”
        shoppingCartPage.clickOnConfirmButton();
        //2.35 Verify the Text “Thank You”
        Assert.assertEquals(shoppingCartPage.getThankYouText(),"Thank you","error");
        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(shoppingCartPage.getOrderSuccessProcessText(),"Your order has been successfully processed!","error");
        //2.37 Click on “CONTINUE”
        shoppingCartPage.clickOnContinueButton3();
        //2.37 Verify the text “Welcome to our store”
        //Assert.assertEquals(shoppingCartPage.getWelcomeOurStoreText(),"Welcome to our store","error");*/
    }}