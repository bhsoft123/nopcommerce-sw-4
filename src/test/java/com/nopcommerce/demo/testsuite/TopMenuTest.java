package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homepage = new HomePage();


@Test
//1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
//select the Menu and click on it and verify the page navigation.
public void verifyPageNavigation() {
    homepage.selectMenu("Computers ");
    homepage.selectMenu("Electronics");
    homepage.selectMenu("Apparel");
    homepage.selectMenu("Digital downloads");
    homepage.selectMenu("Books");
    homepage.selectMenu("Jewelry");
    homepage.selectMenu("Gift Cards");


}}
