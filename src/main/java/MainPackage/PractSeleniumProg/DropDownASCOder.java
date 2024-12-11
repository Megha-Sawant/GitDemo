package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DropDownASCOder
{
    @Test
    public void dropdown()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement drp=driver.findElement(By.name("my-select"));

        List<WebElement> drp1= driver.findElements(By.name("my-select"));
//        drp1.stream().map(WebElement::getText).sorted().collect(Collectors.toList());
       List<String> ls1 =drp1.stream().map(WebElement::getText).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for(String l:ls1)
        {
            System.out.println(l);
        }
        for(int i=0; i<drp1.size();i++)
         {
             System.out.println(drp1.get(i).getText());
         }

        Select s =new Select(drp);

        List<String> ls = s.getOptions().stream().map(WebElement::getText).sorted().collect(Collectors.toList());
        int size =s.getOptions().size();
        System.out.println(size);
        s.selectByIndex(size-1);

       for(String l:ls)
       {
           System.out.println(l);
       }

    }
}
