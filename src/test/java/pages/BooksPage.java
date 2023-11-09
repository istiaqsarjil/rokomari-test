package pages;

import org.openqa.selenium.By;

public class BooksPage extends BasePage{




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
}
