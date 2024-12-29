package PractProjModule1.PageObjectModel;

import PractProjModule1.AbstractComponent.AbstractMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends AbstractMethod
{
    WebDriver driver;
    @FindBy(xpath = "//tbody/tr/td[2]")
    List<WebElement> productNames;


    public OrderPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public Boolean verifyOrderDisplay()
    {
        Boolean match=productNames.stream().anyMatch(product->product.getText().equalsIgnoreCase("productname"));
        return match;

    }
}
