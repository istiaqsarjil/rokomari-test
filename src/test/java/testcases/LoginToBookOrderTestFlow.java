package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.PageLocatorsFlow;
import utilities.DriverSetup;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;


public class LoginToBookOrderTestFlow extends DriverSetup {

    PageLocatorsFlow pageLocatorsFlow = new PageLocatorsFlow();


    @Test
    public void testLoginAndOrderFLow() throws InterruptedException {
        getDriver().get(pageLocatorsFlow.homePageUrl);

        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.loginPageButton);

        //Login with existing account
        pageLocatorsFlow.textInput(pageLocatorsFlow.inputAccountEmail,"istiaq.test@gmail.com");
        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.loginNextButton);

        Thread.sleep(10000);



        //Login by Google account
        /*pageLocatorsFlow.clickOnElement(pageLocatorsFlow.googleButton);
        pageLocatorsFlow.textInput(pageLocatorsFlow.inputGmailAddress,"istiaq.test@gmail.com");
        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.clickNextToPassword);
        pageLocatorsFlow.textInput(pageLocatorsFlow.inputPassword,"$@&123Test");
        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.clickNextToPassword);*/

        //action.clickAndHold(pageLocatorsFlow.getElement(pageLocatorsFlow.selectWriter)).build().perform();
        pageLocatorsFlow.hoverOnElement(pageLocatorsFlow.selectWriter);

        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.selectHumayunAhmed);

        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.filterRochona);
        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.filterSomokalin);

        pageLocatorsFlow.scrollToElement(pageLocatorsFlow.nextButton);

        pageLocatorsFlow.hoverOnElement(pageLocatorsFlow.addBookByXPath);
        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.addToCartBook);

        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.cartIcon);

        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.placeOrderButton);

        //input details
        pageLocatorsFlow.textInput(pageLocatorsFlow.inputPhone,"01234567890");
        pageLocatorsFlow.textInput(pageLocatorsFlow.inputAlternatePhone,"09876543210");
        pageLocatorsFlow.selectWithVisibleText(pageLocatorsFlow.selectCountry,"Bangladesh");
        pageLocatorsFlow.selectWithVisibleText(pageLocatorsFlow.selectCity,"ঢাকা");
        pageLocatorsFlow.selectWithVisibleText(pageLocatorsFlow.selectArea,"শাহজাদপুর");
        pageLocatorsFlow.textInput(pageLocatorsFlow.inputAddress,"Shahjadpur, Dhaka.");
        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.selectPaymentMethod);

        //Logout
        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.loggedInAccountDetails);
        pageLocatorsFlow.clickOnElement(pageLocatorsFlow.logOut);


    }

    @Test
    public void testHomePage(){

        getDriver().get(pageLocatorsFlow.homePageUrl);

    }
    public String otpInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter OTP: ");
        String otp = scanner.next();
        return otp;
    }

    @Test
    public void myTestMethod() {
        // Your test logic before user input

        // Reading user input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some input: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);

        // Your test logic after user input
    }



}
