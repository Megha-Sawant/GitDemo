package PractProjModule1.PageObjectModel;

import PractProjModule1.AbstractComponent.AbstractMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends AbstractMethod
{

    @FindBy (className="hero-primary")
    WebElement messagetext;
    WebDriver driver;
    public ConfirmationPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getConfrimationMessage()
    {
        String message=messagetext.getText();
        return message;

    }


}
