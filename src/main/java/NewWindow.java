import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import javax.swing.text.html.HTMLDocument;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class NewWindow
{
    public static void main(String [] args) throws IOException {
        System.setProperty("webdriver.Edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        //Switch Windows
        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> handle = driver.getWindowHandles();
        Iterator<String> it = handle.iterator();
        String parentWindow =it.next();
        String childWindow= it.next();
        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/");

        String values = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();

        driver.switchTo().window(parentWindow);
       WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
               name.sendKeys(values);

        //take screen shot of element
        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("Logo.png"));

        //get hight and width

        System.out.println(name.getRect().getHeight());
        System.out.println(name.getRect().getWidth());
    }
}
