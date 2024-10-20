import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Assignment_pract1 {

    public static void main(String[] avg) {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();

        //access the webpage
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        String Country="India";
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Country);
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);








    }
}
