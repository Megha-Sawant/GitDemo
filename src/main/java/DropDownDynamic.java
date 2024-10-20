import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropDownDynamic {
    public static void main(String[] arg) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //************Dynamic Dropdown *************

        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='PNQ']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//a[@value='SXR'])[2]")).click();
        // defaulting with index is not good so use another way to locate

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='SXR']")).click();

    }

}
