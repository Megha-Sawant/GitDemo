import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorPractice2
{
    public static void main(String [] args)
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //************************************* Sibling to Sibling Travers from parent **************************************************************

        System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//div/button[2]/preceding-sibling::button[1]")).getText());

        //************************************* child to parent reverse  Travers **************************************************************

        System.out.println(driver.findElement(By.xpath("//div/button[1]/parent::div/a")).getText());

        driver.close();





    }
}
