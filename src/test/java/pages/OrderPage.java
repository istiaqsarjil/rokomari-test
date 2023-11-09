package pages;

import org.openqa.selenium.By;

public class OrderPage extends BasePage{

    //Step 9 - Provide your Shipping Information
    public By inputName = By.xpath("(//input[@id='name'])[1]");
    public By inputPhone = By.xpath("(//input[@id='phone'])[1]");
    public By inputAlternatePhone = By.xpath("(//input[@id='phone2'])[1]");
    public By selectCountry = By.xpath("//select[@id='js--country']");
    public By selectCity = By.xpath("//select[@id='js--city']");
    public By selectArea = By.xpath("//select[@id='js--area']");
    public By inputAddress = By.xpath("(//textarea[@id='address'])[1]");
    public By selectPaymentMethod = By.xpath("//label[@for='B_KASH']");

}
