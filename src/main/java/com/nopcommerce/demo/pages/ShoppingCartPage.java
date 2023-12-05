package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Random;

public class ShoppingCartPage extends Utility {
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity = By.xpath("//td[@class=quantity\"]/child::input");
    By updateShoppingCart = By.id("updatecart");
    By total = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By termsOfServiceCheckBox = By.id("termsofservice");
    By checkOutButton = By.id("checkout");
    By verifyQuantity = By.xpath("//span[contains(text(),'(2)')]");
    By verifyTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirRadioButton = By.id("shippingoption_1");
    By creditCard = By.id("paymentmethod_1");
    By paymentContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By continueButton1 = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By creditCardDropDown = By.id("CreditCardType");
    //By radioButton2ndDayAir = By.id("shippingoption_2");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessProcessText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton3 = By.xpath("//button[contains(text(),'Continue')]");
    By radioButton2ndDayAir = By.id("shippingoption_2");
    By secondDayAirText = By.xpath("//span[contains(.,'2nd Day Air')]");
    By totalAmountNokiaText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By sortByCreditCard= By.xpath("//select[@id='CreditCardType']");

    public void fillMandatoryFields() {
        sendTextToElement(By.id("input-payment-firstname"), "Orange");
        sendTextToElement(By.id("input-payment-lastname"), "Purple");
        Random random = new Random();
        sendTextToElement(By.id("input-payment-email"), "orangepurple" + random.nextInt(1000) + "@gmail.com");
        sendTextToElement(By.id("input-payment-telephone"), "01234567899");
        sendTextToElement(By.id("input-payment-address-1"), "Orange Street");
        sendTextToElement(By.id("input-payment-city"), "London");
        sendTextToElement(By.name("postcode"), "AB1 2CD");
        selectByVisibleTextFromDropDown(By.id("input-payment-country"), "United Kingdom");
        selectByVisibleTextFromDropDown(By.id("input-payment-zone"), "Bristol");
    }

    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public void changeQuantity() {
        sendTextToElement(quantity, Keys.BACK_SPACE + "2");
    }

    public void clickOnUpdateCartButton() {
        clickOnElement(updateShoppingCart);
    }

    public String getTotalText() {
        return getTextFromElement(total);
    }

    public void clickOnTermsOfServiceCheckBox() {
        clickOnElement(termsOfServiceCheckBox);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
    }

    public String getVerifyQuantity() {
        return getTextFromElement(verifyQuantity);
    }

    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirRadioButton() {
        clickOnElement(nextDayAirRadioButton);
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }

    public void clickOnCreditCard() {
        clickOnElement(creditCard);
    }

    public void clickOnPaymentContinueButton() {
        clickOnElement(paymentContinue);
    }

    public void selectCreditCard(String card) {
        selectByVisibleTextFromDropDown(creditCardDropDown, card);
    }

    public void fillCreditCardMandatoryFields() {}
        //public void clickOnRadioButton2ndDayAir(){         clickOnElement(radioButton2ndDayAir);            }
        public void clickOnConfirmButton () {
            clickOnElement(confirmButton);
        }
        public String getThankYouText () {
            return getTextFromElement(thankYouText);
        }
        public String getOrderSuccessProcessText () {
            return getTextFromElement(orderSuccessProcessText);
        }
        public void clickOnContinueButton3 () {
            clickOnElement(continueButton3);
        }
        public void clickOnRadioButton2ndDayAir () {
            clickOnElement(radioButton2ndDayAir);
        }
        public String get02ndDayText () {
            return getTextFromElement(secondDayAirText);
        }
        public String getTotalAmountNokiaText () {
            return getTextFromElement(totalAmountNokiaText);
        }

    public void selectMasterCard(String card){ selectByVisibleTextFromDropDown(sortByCreditCard, card);}

    }
