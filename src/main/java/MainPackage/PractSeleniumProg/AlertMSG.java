package MainPackage.PractSeleniumProg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AlertMSG
{
    public static void main(String [] arg)
    {
     System.setProperty("webDriver.Edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
     //EdgeOptions edgop = new EdgeOptions();
     //edgop.setAcceptInsecureCerts(true);
     WebDriver driver = new EdgeDriver();
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         driver.findElement(By.id("name")).sendKeys("Megha Sawant");
         driver.findElement(By.id("alertbtn")).click();
         driver.switchTo().alert().accept();
         //driver.switchTo().alert().dismiss();


    }
}

