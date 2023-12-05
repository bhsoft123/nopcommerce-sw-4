package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By buildOwnComputer = By.xpath("//div[@class='picture']//img[@title='Show details for Build your own computer']");

    public void buildYourOwnComputer(){ clickOnElement(buildOwnComputer);}
}
