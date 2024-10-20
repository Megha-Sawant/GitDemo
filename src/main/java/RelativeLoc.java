import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLoc
{
    public static void main(String [] args)
    {
        System.setProperty("webdriver.Edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();

       WebElement name= driver.findElement(By.cssSelector("[name='name']"));

        System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());

        WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

        driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
    }
}
