package pages;

import org.openqa.selenium.By;

public class Homepage extends BasePage{

    //Step 1 - Sign Up using Google
    public String homePageUrl = "https://www.rokomari.com/";
    public String homePageTitle = " Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com ";
    public By crossAlert = By.xpath("//div[@id='js--quiz-image-popup']//i[@class='ion-close-round']");
    public By loggedInAccountDetails = By.xpath("//span[@class='user-name']");
    public By loginPageButton = By.xpath("//a[normalize-space()='Sign in']");


    //Step 2 - Select লেখক from the menu
    public By selectWriter = By.xpath("//a[@id='js--authors']");


    //Step 3 - Select হুমায়ুন আহমেদ
    public By selectHumayunAhmed = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");


    //Step 10 - Log out
    public By logOut = By.xpath("//a[normalize-space()='Sign Out']");


}
