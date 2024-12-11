package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class flipcartAssignment

{
    public static void main(String [] args) {
        WebDriver driver = new ChromeDriver();
        Set<String> s=driver.getWindowHandles();
       Iterator<String> it =s.iterator();
        driver.get("https://www.flipkart.com/viewcart");
        it.next();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.cssSelector(".zDPmFV")).sendKeys("latest mobile 5g");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.manage().window().maximize();
        //driver.findElement(By.className("UzRoYO.CmflSf"));
        driver.findElement(By.xpath("//div[normalize-space()='Bestseller']//parent::div//parent::a")).click();
        driver.switchTo().window(it.next());
          System.out.println(driver.getTitle());

             //driver.close();
    }
}
