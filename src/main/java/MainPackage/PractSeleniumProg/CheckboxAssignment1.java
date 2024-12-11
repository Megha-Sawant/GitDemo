package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class CheckboxAssignment1
{
    public static void main(String [] args)
    {
        System.setProperty("webDriver.Edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver =new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Check the first checkbox
        driver.findElement(By.cssSelector("#checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());

        //Uncheck the first checkbox
        driver.findElement(By.cssSelector("#checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());

        //Count the total check present on webpage
        System.out.println("Total "+driver.findElements(By.xpath("//input[@type='checkbox']")).size() + " checkbox are available on page :");

        driver.close();
    }

}
