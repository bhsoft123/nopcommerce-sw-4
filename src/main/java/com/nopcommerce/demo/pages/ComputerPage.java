package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By sortByNameAtoZ = By.name("products-orderby");
    By addToCartButton=By.xpath("//button[@type='button'][normalize-space()='Add to cart'][1]");


    public void selectSortByNameAtoZ(String text){ selectByVisibleTextFromDropDown(sortByNameAtoZ, text);}
    public void addToCartButton(){ clickOnElement(addToCartButton); }

}
