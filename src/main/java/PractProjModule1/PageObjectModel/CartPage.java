package PractProjModule1.PageObjectModel;

import PractProjModule1.AbstractComponent.AbstractMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends AbstractMethod
{
    WebDriver driver;
    @FindBy(css=".totalRow button")
    WebElement checkOutBtn;

    @FindBy(css=".cartSection h3")
    List<WebElement> checkOutProduct;

    public CartPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

 public CheckoutPage checkout()
 {
     scrollDown(checkOutBtn);
     checkOutBtn.click();
     CheckoutPage checkotpage =new CheckoutPage(driver);
     return checkotpage;

 }
    public Boolean checkOutProduct(String productName)
    {
        Boolean match = checkOutProduct.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));
        return match;


    }
}
