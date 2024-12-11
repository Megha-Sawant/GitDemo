package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsAssignments
{
    public static void main (String [] arg) throws InterruptedException {

        System.setProperty("webdriver.Edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();


        driver.navigate().to("https://the-internet.herokuapp.com/");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']")).click();
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();

        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        String parentID = it.next();


        driver.switchTo().window(it.next());
       System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

        driver.switchTo().window(parentID);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());



    }
}
