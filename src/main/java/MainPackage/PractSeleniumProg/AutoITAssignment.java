package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;
import java.time.Duration;

public class AutoITAssignment
{

    @Test
    public void UpDownPDF() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        try
        {
            WebElement uploadfile = driver.findElement(By.id("uploadfile"));
            uploadfile.click();

            Runtime.getRuntime().exec("C:\\Megha\\My_First_Project\\data\\fileUpload.exe");
        }
        catch(InvalidArgumentException e)
        {
            System.out.println(e.getMessage());
        }

      //  driver.close();

    }
}
