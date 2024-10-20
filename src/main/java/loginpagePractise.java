import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class loginpagePractise
{

    public static void main (String [] avg)
{
    System.setProperty("webdriver.Edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
    WebDriver driver = new EdgeDriver();

    //access the webpage
    driver.get("https://rahulshettyacademy.com/loginpagePractise/");

    //implicit wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.manage().window().maximize();

    //insert user name and password
    driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
    driver.findElement(By.id("password")).sendKeys("learning");

    //select user checkbox
    driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
    WebDriverWait tm= new WebDriverWait(driver, Duration.ofSeconds(5));
    tm.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
    driver.findElement(By.xpath("//button[@id='okayBtn']")).click();

   // driver.findElement(By.xpath("//select[@class='form-control']")).click();
    WebElement option = driver.findElement(By.xpath("//select[@class='form-control']"));
    Select op = new Select(option);
    op.selectByVisibleText("Consultant");
    //driver.findElement(By.xpath("//option[@value='consult']")).click();
    driver.findElement(By.id("terms")).click();
    driver.findElement(By.id("signInBtn")).click();

    //Go to next page after login and select all peresnt items
   // tm.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
    List<WebElement> productList = driver.findElements(By.xpath("//button[@class='btn btn-info']"));

    for (int i=0; i< productList.size(); i++)
    {
        driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
    }
    driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

 driver.close();

}

}
