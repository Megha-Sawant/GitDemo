package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class StreamPagination
{
    public static void main(String args []) {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();
        //access the webpage
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
//        //Click on Search textbox
//        driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Beans");
//
//        //Save search Result in one list
//        List<WebElement> vegList = driver.findElements(By.xpath("//tr/td[1]"));
//
//        //Verify the search result contains correct data , filtering working fine
//           List<WebElement> findElement=vegList.stream().filter(veg-> veg.getText().contains("Beans")).collect(Collectors.toList());
//        Assert.assertEquals(vegList.size(),findElement.size());

        paginationFun(driver);



    }

    private static void paginationFun(WebDriver driver)
    {

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        //Click on Search textbox
        driver.findElement(By.xpath("//tr/td[1]")).click();

        //Save search Result in one list
        List<WebElement> vegList ;
        List<WebElement> veggies;
        do
        {
            vegList = driver.findElements(By.xpath("//tr/td[1]"));
            veggies=vegList.stream().filter(veg-> veg.getText().contains("Beans")).collect(Collectors.toList());
            if(veggies.isEmpty())
            {
                driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
            }


        }while(veggies.isEmpty());

    }
}
