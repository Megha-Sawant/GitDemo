import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class Assignmet3

{
    public static void main(String [] arg) {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        int size=driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label")).size();
        System.out.println(size);
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        String op= driver.findElement(By.xpath("//label[@for='benz']")).getText();
        System.out.println(op);

        Select drpdwn= new Select(driver.findElement(By.id("dropdown-class-example")));
        drpdwn.selectByVisibleText(op);

        driver.findElement(By.cssSelector("#name")).sendKeys(op);
        driver.findElement(By.cssSelector("#alertbtn")).click();
       String text = driver.switchTo().alert().getText().trim();
       driver.switchTo().alert().accept();

       String op1 = text.split(",")[0].split("Hello")[1].trim();
        System.out.println(op1);

       if(op.equalsIgnoreCase(op1))
       {
           System.out.println("both option are same");
       }




    }


}
