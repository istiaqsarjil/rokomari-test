package pages;

import org.openqa.selenium.By;

public class PageLocatorsFlow extends BasePage{

    //Step 1 - Sign Up using Google
    public String homePageUrl = "https://www.rokomari.com/";
    public String homePageTitle = " Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com ";
    public By crossAlert = By.xpath("//div[@id='js--quiz-image-popup']//i[@class='ion-close-round']");


    public By loginPageButton = By.xpath("//a[normalize-space()='Sign in']");
    public String loginPageUrl = "https://www.rokomari.com/login";
    public String loginPageTitle = " Login To Rokomari | Rokomari.com ";
    public By inputAccountEmail = By.xpath("//input[@placeholder='Email or phone']");
    public By loginNextButton = By.xpath("//button[@id='js--btn-next']");
    public By otp = By.xpath("//input[@placeholder='OTP']");
    public By loginButton = By.xpath("//form[@id='otp-login-form']//button[@type='submit'][normalize-space()='Login']");

    public By googleButton = By.xpath("//button[normalize-space()='Google']");
    public By gmailAccountSelect = By.xpath("//div[normalize-space()='istiaq.sarjil2@gmail.com']");

    public By inputGmailAddress = By.xpath("//input[@id='identifierId']");
    public By clickNextToPassword = By.xpath("//span[normalize-space()='Next']");
    public By inputPassword = By.xpath("//input[@name='Passwd']");
    //public By clickNextToLogin = By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]");
    public By getClickNextToLogin2 = By.xpath("//*[@id=\"passwordNext\"]/div/button/span");

    public By loggedInAccountDetails = By.xpath("//span[@class='user-name']");


    //Step 2 - Select লেখক from the menu
    public By selectWriter = By.xpath("//a[@id='js--authors']");


    //Step 3 - Select হুমায়ুন আহমেদ
    public By selectHumayunAhmed = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");


    //Step 4 - Filter  Categories like সমকালীন উপন্যাস, রচনা সংকলন ও সমগ্র
    public By filterSomokalin = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By filterRochona = By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");


    //Step 5 - Scroll Down and go to Next Page (IF Have)
    public By nextButton = By.xpath("//a[normalize-space()='Next']");


    //Step 6 - Add to the cart any book
    public By addBookByLinkedText = By.linkText("শুভ্র সমগ্র");

    //scroll korar por book name locator diye always same thake na, that's why customized xpath create kora hoise.
    public By addBookByXPath = By.xpath("//section/div/div/div[4]");
    public By addToCartBook = By.xpath("//section/div/div/div[4]//div[1]//div[2]//button[1]");


    //Step 7 - Click Cart Icon
    public By cartIcon = By.cssSelector("#cart-icon");


    //Step 8 - Go to the Shipping page
    public By placeOrderButton = By.xpath("//span[normalize-space()='Place Order']");


    //Step 9 - Provide your Shipping Information
    public By inputName = By.xpath("(//input[@id='name'])[1]");
    public By inputPhone = By.xpath("(//input[@id='phone'])[1]");
    public By inputAlternatePhone = By.xpath("(//input[@id='phone2'])[1]");
    public By selectCountry = By.xpath("//select[@id='js--country']");
    public By selectCity = By.xpath("//select[@id='js--city']");
    public By selectArea = By.xpath("//select[@id='js--area']");
    public By inputAddress = By.xpath("(//textarea[@id='address'])[1]");
    public By selectPaymentMethod = By.xpath("//label[@for='B_KASH']");


    //Step 10 - Log out
    public By logOut = By.xpath("//a[normalize-space()='Sign Out']");


}
