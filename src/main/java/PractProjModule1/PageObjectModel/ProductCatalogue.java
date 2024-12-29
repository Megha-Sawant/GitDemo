package PractProjModule1.PageObjectModel;

import PractProjModule1.AbstractComponent.AbstractMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.google.common.collect.Streams.stream;

public class ProductCatalogue extends AbstractMethod
{
    WebDriver driver;
        public ProductCatalogue(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    By productItemList = By.cssSelector(".card");
    By findBy = By.cssSelector(".mb-3");
    By tostMessage=By.cssSelector("#toast-container");
    By addToCart=By.cssSelector(".card-body button:last-of-type");
    @FindBy(css = ".mb-3")
    List<WebElement> products;


    @FindBy(css=".ng-animating")
    WebElement spinner;

    public WebElement searchProduct(String item)
    {

        WebElement product = getProductList().stream().filter(it->it.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(item)).findFirst().orElse(null);
                            return(product);

    }
    public List<WebElement> getProductList()
    {
        waitToAppear(findBy);
        return(products);
    }
    public CartPage addProductToCart(String item) throws InterruptedException {
        WebElement prod = searchProduct(item);
        prod.findElement(addToCart).click();
        waitToAppear(tostMessage);
        waitToDisappear(spinner);
        CartPage crt = new CartPage(driver);
        return crt;



    }


}
