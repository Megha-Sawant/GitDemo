import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ScreeShot
{
    public static void main(String[] avg) throws IOException {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();


        //access the webpage
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        File srcfile =( (TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(srcfile,new File("C:\\Megha\\My_First_Project\\ScreenShot\\scrfile.png"));

    }
}
