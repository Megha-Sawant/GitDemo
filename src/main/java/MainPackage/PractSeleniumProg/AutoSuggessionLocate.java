package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class AutoSuggessionLocate
{
    public static void main(String[] arg) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(1000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));

        for (WebElement option : options)
        {
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }

        }

        driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_chk_SeniorCitizenDiscount')]")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_chk_SeniorCitizenDiscount')]")).isSelected());
        //List<WebElement> count =driver.findElements(By.xpath("//input[@type='checkbox']"));
       // System.out.println(count.size());
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

        driver.close();

    }

}
