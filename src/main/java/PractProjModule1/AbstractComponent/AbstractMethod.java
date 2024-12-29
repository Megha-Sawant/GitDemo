package PractProjModule1.AbstractComponent;

import PractProjModule1.PageObjectModel.OrderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractMethod
{
 WebDriver driver;

    @FindBy(css = "[routerlink*='myorders']")
    WebElement orderHeader;
    @FindBy(css="[routerlink*='cart']")
    WebElement addProduct;

    public AbstractMethod(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }

    public void waitToAppear(By findBy)
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated (findBy));

    }
    public void waitWebElementToAppear(WebElement webElement)
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(webElement));

    }
    public void waitToDisappear(WebElement spinner) throws InterruptedException {
        Thread.sleep(5000);
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.invisibilityOf(spinner));

    }
    public void waitToCilckable(WebElement scrollDownElemt)
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(scrollDownElemt));

    }
    public void scrollDown(WebElement element)
    {
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
//        jr.executeScript("arguments[0].scrollIntoView();",element);
//        wait.until(ExpectedConditions.visibilityOf(element));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();



    }
    public OrderPage goToOrderPage()
    {
        orderHeader.click();
        OrderPage orderPage = new OrderPage(driver);
        return orderPage;

    }
    public void goToCartPage()
    {
        addProduct.click();
    }



}
