package MainPackage.PractSeleniumProg;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class AssertHandson
{
    public static void main(String [] args) throws InterruptedException {


         System.setProperty("webDriver.Edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
         WebDriver driver = new EdgeDriver();

       // System.setProperty("webDriver.Chrome.driver","C:\\Megha\\My_First_Project\\driver\\chromedriver");
        //WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        String username ="rahul";
        String password = getPassword(driver);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(username);
        driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());

        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+username+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();
    }
      public static String getPassword(WebDriver driver) throws InterruptedException {
          driver.get("https://rahulshettyacademy.com/locatorspractice/");
          driver.findElement(By.linkText("Forgot your password?")).click();
          Thread.sleep(1000);
          driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();
          String pwd = driver.findElement(By.cssSelector(".infoMsg")).getText();
          String [] arr = pwd.split("'");
          String password = arr[1].split("'")[0];

          return password;
     }
}
