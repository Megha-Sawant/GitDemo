package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class AS_DPDW_Assignment
{

    public static void main(String[] s)
    {
        System.setProperty("webdriver.Edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");

        driver.findElement(By.id("justAnInputBox")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@id='comboTree890309DropDownContainer']//span[text()='choice 2'][0]")).click();
        //System.out.println(chbx.getText());
//        String str ="choice 2";
//
//
//        for(int i=0; i< chbx.size(); i++)
//        {
//            if (chbx.get(i).getText().contains(str))
//            {
//                driver.findElements(By.cssSelector(".ComboTreeItemChlid")).get(i).click();
//            }
//
//        }



    }
}
