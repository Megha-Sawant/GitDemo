import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapper
{
    public static void main(String args [])
    {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();
        //access the webpage
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();

        //To get first columns all values
        driver.findElement(By.xpath("//tr/td[1]")).click();
       //to save the list items to arraylist
        List<WebElement> vegList= driver.findElements(By.xpath("//tr/td[1]"));

        List<String> originalList=vegList.stream().map(s-> s.getText()).sorted().collect(Collectors.toList());
      //  Assert.assertTrue(vegList.equals(originalList));

        //scan the name column  with getText()= "Beans"-> Print the price of rice
        List<String> price=  vegList.stream().filter(s-> s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());

        price.forEach(a->System.out.println(a));



    }

    private static String getPrice(WebElement s)
    {
       String price= s.findElement(By.xpath("following-sibling::td[1]")).getText();
       return price;


    }
}
