package PractProjModule1.PageObjectModel;

import PractProjModule1.AbstractComponent.AbstractMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractMethod
{
    WebDriver driver;

    public LandingPage(WebDriver driver)
    {
       super(driver);
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }
    @FindBy (id="userEmail")
    WebElement userName;
    @FindBy (id="userPassword")
    WebElement userPwd;
    @FindBy (id="login")
    WebElement loginButton;
    @FindBy(css="[class*='flyInOut']")
    WebElement errorMessage;
    JavascriptExecutor jr =(JavascriptExecutor) driver;

    public void getLink()
    {
        driver.get("https://rahulshettyacademy.com/client");
    }
    public ProductCatalogue loginPage(String userNm, String pwd)
    {
        userName.sendKeys(userNm);
        userPwd.sendKeys(pwd);
        loginButton.click();
        ProductCatalogue productCatalogue =new ProductCatalogue(driver);
        return productCatalogue;
    }
    public String getErrorMessage()
    {
        waitWebElementToAppear(errorMessage);
        return errorMessage.getText();
    }
}
