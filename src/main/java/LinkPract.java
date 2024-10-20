import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class LinkPract
{

    public static void main(String [] arg) {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Total number of hyperlink present on webpage
        System.out.println(driver.findElements(By.tagName("a")).size());

        //Total number of hyperlink present on footer

        WebElement footerHyperLink = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerHyperLink.findElements(By.tagName("a")).size());

        //Total number of hyperlink present on particular section
        WebElement subSection = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        System.out.println(subSection.findElements(By.tagName("a")).size());

        for(int i=1; i<subSection.findElements(By.tagName("a")).size(); i++)
        {
            String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            subSection.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);

        }
        Set<String> w = driver.getWindowHandles();
        Iterator<String> it = w.iterator();
        while(it.hasNext())
        {
            System.out.println(driver.switchTo().window(it.next()).getTitle());
        }
    }

}
