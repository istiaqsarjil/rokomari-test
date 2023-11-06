package pages;

import org.openqa.selenium.By;

public class PageLocatorsFlow extends BasePage{

    //Step 1 - Sign Up using Google
    public String homePageUrl = "https://www.rokomari.com/";
    public String homePageTitle = " Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com ";
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
    public By clickNextToLogin = By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]");
    public By loggedInAccountDetails = By.xpath("//span[@class='user-name']");


    //Step 2 - Select লেখক from the menu
    public By selectWriter = By.xpath("//a[@id='js--authors']");


    //Step 3 - Select হুমায়ুন আহমেদ
    public By selectHumayunAhmed = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");


    //Step 4 - Filter  Categories like সমকালীন উপন্যাস, রচনা সংকলন ও সমগ্র
    public By filterSomokalin = By.cssSelector("label[for='rok-filter-categoryIds-677']");
    public By filterRochona = By.cssSelector("label[for='rok-filter-categoryIds-1321']");


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
    public By inputPhone = By.xpath("//label[normalize-space()='Phone No']");
    public By inputAlternatePhone = By.xpath("//label[normalize-space()='Alternative Phone No']");
    public By selectCountry = By.xpath("//select[@id='js--country']");
    public By selectCity = By.xpath("//select[@id='js--city']");
    public By selectArea = By.xpath("//select[@id='js--area']");
    public By inputAddress = By.xpath("//label[normalize-space()='Address']");
    public By selectPaymentMethod = By.xpath("//img[@alt='Pay by Bkash']");


    //Step 10 - Log out
    public By logOut = By.xpath("//a[normalize-space()='Sign Out']");


}
