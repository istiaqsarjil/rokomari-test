package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.DriverSetup;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.Scanner;

import static utilities.DriverSetup.getDriver;

public class BasePage extends DriverSetup{

    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public void textInput(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public boolean isElementVisible(By locator){
        return getElement(locator).isDisplayed();

    }

    public void selectWithVisibleText(By selectLocator, String visibleText){
        Select select = new Select(getElement(selectLocator));
        select.selectByVisibleText(visibleText);
    }

    public void assertAnything(String URL, By locator, String text){

        Assert.assertEquals(getDriver().getCurrentUrl(), URL," Not Matched!!");
        Assert.assertEquals(getElement(locator).getText(), text," Not Matched!!");
    }

    public void hoverOnElement(By locator) {
        Actions action = new Actions(getDriver());
        action.clickAndHold(getElement(locator)).build().perform();
    }

    public void scrollToElement(By locator) {
        Actions action = new Actions(getDriver());
        action.scrollToElement(getElement(locator)).build().perform();
    }

    public void screenShot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }



    /*public String otpInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter OTP: ");
        String otp = scanner.next();
        return otp;
    }*/

}
