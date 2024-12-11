package demoPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class DownloadFile
{

    @Test
    public void downloadFile() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        WebElement download = driver.findElement(By.linkText("Download CSV File"));
        download.click();
        Runtime.getRuntime().exec("");
    }
}
