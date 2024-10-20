import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class MouseScroll
{
    public static void main (String [] avg)
    {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();

        //access the webpage
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        JavascriptExecutor jr =(JavascriptExecutor) driver;
        jr.executeScript("window.scrollBy(0,600)");
        jr.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for(int i=0; i< values.size();i++)
        {
           sum=sum + Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);



    // Second table -
        int tbSum=0;
    List <WebElement> tbValues = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr/td[3]"));
    for(int i=0; i< tbValues.size(); i++)
    {
        tbSum= tbSum + Integer.parseInt(tbValues.get(i).getText());
    }
        System.out.println(tbSum);
        System.out.println("Total Number of Rows :"+tbValues.size());
        int row = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr[1]/th")).size();
        List <WebElement> trValues = driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr"));
        System.out.println("Total Number of Column :"+row);
        System.out.println("3Rd Row Data : "+trValues.get(2).getText());

    }
    }
