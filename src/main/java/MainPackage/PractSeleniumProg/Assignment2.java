package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assignment2
{
    public static void main(String [] args)
    {
        System.setProperty("webDriver.edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver =new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //driver.findElement(By.cssSelector("input[class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("Megha");
      //input[class='form-control ng-pristine ng-invalid ng-touched']
        driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Megha");
        driver.findElement(By.cssSelector("div[class='form-group'] input[name='email']")).sendKeys("megha@gmail.com");
        driver.findElement(By.cssSelector(".form-control")).sendKeys("abc123");
        driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();

        WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
        //gender.findElement(By.xpath("//select[@id='exampleFormControlSelect1']/option[2]")).click();
        Select dropdown = new Select(gender);
        dropdown.selectByVisibleText("Female");
        //dropdown.selectByIndex(0);
        //dropdown.selectByValue("abc");
        
        driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("05-03-1991");
        driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
        driver.close();





    }

}
