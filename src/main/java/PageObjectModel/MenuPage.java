package PageObjectModel;

import AbstractComponent.AbstractMethod;
import org.openqa.selenium.WebDriver;

public class MenuPage extends AbstractMethod
{
    WebDriver driver;
    public MenuPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver ;
    }




}
