import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelInroduction
{
    public static void main(String arg [])
{
    System.setProperty("webDriver.Chrome.driver","C:\\Megha\\My_First_Project\\driver\\chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
//driver.close();

    //edge

//    System.setProperty("webDriver.edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
//    WebDriver driver1 = new EdgeDriver();
//    driver1.get("https://rahulshettyacademy.com");
//    System.out.println(driver1.getTitle());
//    System.out.println(driver1.getCurrentUrl());
//    driver1.quit();


}
}
