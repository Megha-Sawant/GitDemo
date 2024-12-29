package PractProjModule1.PageObjectModel;

import PractProjModule1.AbstractComponent.AbstractMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends AbstractMethod
{
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    JavascriptExecutor jr =(JavascriptExecutor) driver;
    By waitToclick =By.cssSelector(".ta-results");

    @FindBy (css="input[placeholder='Select Country']")
    WebElement country;

    @FindBy (css="button[class*='ng-star-inserted']:nth-of-type(2)")
    WebElement chktBtn;

    @FindBy (css=".btnn.action__submit.ng-star-inserted")
    WebElement scrollDownElemt;

    public ConfirmationPage addCheckOutDetails(String strCountry, JavascriptExecutor jr)
    {
        country.sendKeys(strCountry);
        chktBtn.click();
        scrollDown(scrollDownElemt);
        waitToCilckable(scrollDownElemt);
        scrollDownElemt.click();
        ConfirmationPage pg = new ConfirmationPage(driver);
        return pg;

    }

}
