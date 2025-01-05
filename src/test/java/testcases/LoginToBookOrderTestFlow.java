package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.*;
import utilities.DriverSetup;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;


public class LoginToBookOrderTestFlow extends DriverSetup {

    Homepage homepage = new Homepage();
    LoginPage loginPage = new LoginPage();
    BooksPage booksPage = new BooksPage();
    CartPage cartPage = new CartPage();
    OrderPage orderPage = new OrderPage();



    @Test
    public void testLoginAndOrderFLow() throws InterruptedException {
        getDriver().get(homepage.homePageUrl);
        homepage.screenShot("Homepage Before Login");
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));


        homepage.clickOnElement(homepage.loginPageButton);
        loginPage.screenShot("Login Page");

        /*//Login with existing account
        pageLocatorsFlow.textInput(pageLocatorsFlow.inputAccountEmail,"istiaq.test@gmail.com");
        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.loginNextButton);*/


        //Login by Google account
        loginPage.clickOnElement(loginPage.googleButton);
        loginPage.screenShot("Google Login View - Input Email");
        loginPage.textInput(loginPage.inputGmailAddress, "istiaq.test@gmail.com");
        loginPage.clickOnElement(loginPage.clickNextToPassword);
        loginPage.screenShot("Google Login View - Input Password");
        loginPage.textInput(loginPage.inputPassword, "$@&123Test");
        loginPage.clickOnElement(loginPage.getClickNextToLogin2);


        //action.clickAndHold(pageLocatorsFlow.getElement(pageLocatorsFlow.selectWriter)).build().perform();

        Thread.sleep(5000);
        getDriver().navigate().refresh();

        homepage.screenShot("Homepage After Login");
        homepage.hoverOnElement(homepage.selectWriter);
        Thread.sleep(500);
        homepage.screenShot("Hover On Writer");
        homepage.clickOnElement(homepage.selectHumayunAhmed);

        booksPage.screenShot("Book page view - Humayun Ahmed");
        js.executeScript("window.scroll(0,600)");
        Thread.sleep(2000);
        booksPage.clickOnElement(booksPage.filterRochona);
        booksPage.screenShot("Book page view - After filter -Rochona");

        js.executeScript("window.scroll(0,600)");
        Thread.sleep(2000);
        booksPage.clickOnElement(booksPage.filterSomokalin);
        booksPage.screenShot("Book page view - After filter -Somokalin");

        js.executeScript("window.scroll(0,4200)");
        Thread.sleep(2000);
        booksPage.clickOnElement(booksPage.nextButton);
        booksPage.screenShot("Going to Next page");

        js.executeScript("window.scroll(0,200)");
        Thread.sleep(1000);
        booksPage.hoverOnElement(booksPage.addBookByXPath);
        booksPage.screenShot("Hover to view 'Add to Cart' ");
        Thread.sleep(2000);
        booksPage.clickOnElement(booksPage.addToCartBook);
        booksPage.screenShot("Books added to cart");


        cartPage.clickOnElement(cartPage.cartIcon);
        cartPage.screenShot("Cart page view");
        cartPage.clickOnElement(cartPage.placeOrderButton);
        Thread.sleep(1000);
        orderPage.screenShot("Order page view");


        //input details
        orderPage.textInput(orderPage.inputName, "Sarj");
        orderPage.textInput(orderPage.inputPhone, "01234567890");
        orderPage.textInput(orderPage.inputAlternatePhone, "09876543210");
        orderPage.selectWithVisibleText(orderPage.selectCountry, "Bangladesh");
        orderPage.selectWithVisibleText(orderPage.selectCity, "ঢাকা");
        orderPage.selectWithVisibleText(orderPage.selectArea, "শাহজাদপুর");
        orderPage.textInput(orderPage.inputAddress, "Shahjadpur, Dhaka.");
        orderPage.screenShot("Input User Details");

        js.executeScript("window.scroll(0,700)");
        Thread.sleep(1000);
        orderPage.clickOnElement(orderPage.selectPaymentMethod);
        orderPage.screenShot("Select Payment Method");

        //Logout
        homepage.clickOnElement(homepage.loggedInAccountDetails);
        homepage.clickOnElement(homepage.logOut);
        homepage.screenShot("After logout, homepage view");

    }

}