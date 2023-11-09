package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{

    //Step 7 - Click Cart Icon
    public By cartIcon = By.cssSelector("#cart-icon");

    //Step 8 - Go to the Shipping page
    public By placeOrderButton = By.xpath("//span[normalize-space()='Place Order']");
}
