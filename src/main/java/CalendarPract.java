import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class CalendarPract
{
    public static void main(String [] args) {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();
        String monthNumber ="6";
        String day="15";
        String year="2027";

        String [] date  ={monthNumber,day,year};


        //access the webpage
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.className("react-date-picker__inputGroup")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        driver.findElements(By.cssSelector(".react-calendar__tile.react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();

        List<WebElement> dt = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for(int i =0; i< dt.size(); i++)
        {
            System.out.println(dt.get(i).getAttribute("value"));
            Assert.assertEquals(dt.get(i).getAttribute("value"),date[i]);

        }




    }




}
