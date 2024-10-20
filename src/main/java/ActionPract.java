import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.Key;
public class ActionPract
{
    public static void main (String [] arg)
    {
        System.setProperty("webdriver.Edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.amazon.in");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();



    }

}
