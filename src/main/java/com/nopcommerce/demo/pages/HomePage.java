package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {

    By selectMenuOptions = By.xpath("//ul[@class='top-menu notmobile']/child::li");
    By computer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktop = By.xpath("//img[@alt='Picture for category Desktops']");
    By sortByNameZtoA = By.name("products-orderby");
    By productName1 = By.xpath("//h2[@class='product-title']");

    public void clickOnComputerMenu(){ clickOnElement(computer);}
    public void clickOnDesktop(){ clickOnElement(desktop);}
    public void selectSortByNameZtoA(String text){ selectByVisibleTextFromDropDown(sortByNameZtoA, text);};
    //products already sorted in High to low, so storing into array
    public ArrayList<Double> originalProduct() {
        List<WebElement> productName = driver.findElements(productName1);
        ArrayList<Double> originalProductsName = new ArrayList<>();
        for (WebElement e : productName) {
            System.out.println("Original price: " + e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsName.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
            System.out.println("After replacement" + originalProductsName);
        } return originalProductsName;
    }
    //sorting the products by Default value, which will give original order and then storing into array
    public ArrayList<Double> sortedProduct(){
        selectByVisibleTextFromDropDown(sortByNameZtoA,"Default");
        List<WebElement> productName = driver.findElements(productName1);
        ArrayList<Double> sortedProductsName = new ArrayList<>();
        for (WebElement e : productName){
            String []arr = e.getText().split("Ex Tax:");
            sortedProductsName.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
            System.out.println("Default:" +sortedProductsName);
        }return sortedProductsName;
    };





    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type
    //string
    //1.2 This method should click on the menu whatever name is passed as parameter.
    public void selectMenu(String menu){
        List<WebElement> topMenuList = driver.findElements(selectMenuOptions);

        for(WebElement e : topMenuList){
            if(e.getText().trim().equalsIgnoreCase(menu));{
                //list.add(e.getText());
                System.out.println(e.getText());
                System.out.println(menu);
                e.click();
                System.out.println("Navigated to:" +getTitleOfPage());
                break;   }} driver.navigate().back();
    }




}
