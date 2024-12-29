package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase
{
    public WebDriver driver ;

    public WebDriver WebDriverManager() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"src//test//resources//global.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String browser_properties = prop.getProperty("browser");
        String url = prop.getProperty("QAUrl");

        if(driver == null)
        {
            if (browser_properties.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Megha\\CoffeeCartAutomation\\driver\\chromedriver.exe");
                driver = new ChromeDriver();

            } else if (browser_properties.equalsIgnoreCase("msedge")) {
                System.setProperty("webdriver.Edge.driver", "C:\\Megha\\CoffeeCartAutomation\\driver\\msedgedriver.exe");
                driver = new EdgeDriver();
            }

            driver.get(url);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }


     return driver;
    }
}
