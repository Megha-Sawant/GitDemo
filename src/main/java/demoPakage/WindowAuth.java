package demoPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowAuth
{
    @Test
    public void windowAuthetication()
    {
        WebDriver driver = new ChromeDriver();
       // driver.get("https://the-internet.herokuapp.com/");
       // driver.findElement(By.linkText("Digest Authentication")).click();
        //https://admin:admin@site-url
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
      String msg=  driver.findElement(By.cssSelector("div[class='example'] p")).getText();
        Assert.assertEquals(msg,"Congratulations! You must have the proper credentials.");
        driver.close();
    }
}
