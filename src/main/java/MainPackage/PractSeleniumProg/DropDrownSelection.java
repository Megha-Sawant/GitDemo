package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropDrownSelection
{
    public static void main (String [] arg )
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement static_element = driver.findElement(By.xpath("//select[contains(@name,'DropDownListCurrency')]"));

        System.out.println(static_element.getText());
        static_element.findElement(By.xpath("//option[@value='INR']")).click();

        driver.findElement(By.cssSelector("#divpaxinfo")).click();
        //driver.findElement(By.cssSelector(".adult-popup")).click();

        int i=1;
        while (i<3)
        {
            driver.findElement(By.cssSelector("#hrefIncAdt")).click();
            i++;

        }
        driver.findElement(By.cssSelector("input[id='btnclosepaxoption']")).click();
        System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
        driver.close();
    }
}
