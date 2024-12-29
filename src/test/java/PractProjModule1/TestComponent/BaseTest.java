package PractProjModule1.TestComponent;
import PractProjModule1.PageObjectModel.LandingPage;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class BaseTest
{
   public WebDriver driver;
   public LandingPage lpage ;
   public  JavascriptExecutor jr;


    @BeforeTest
    public WebDriver initializeDriver() throws IOException
    {
        Properties prop =new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//PractProjModule1//GlobalData.properties");
         prop.load(fis);
         String browserName= prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome"))
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver(options);

        }
        else if (browserName.equalsIgnoreCase("Edge"))
        {
            System.setProperty("webdriver.edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
            driver=new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
         jr =(JavascriptExecutor) driver;
        return driver;



    }

    public List<HashMap<String, String>> getJsonDatatoMap(String filepath) throws IOException
    {
        //read data from json to String
        String jsonContent = FileUtils.readFileToString(new File(filepath), StandardCharsets.UTF_8);
       //Convert String into hashmap using jakson Databind
        ObjectMapper obj =new ObjectMapper();
        List<HashMap<String,String>> data = obj.readValue(jsonContent, new TypeReference<List<HashMap<String,String>>>(){});
        return data;

    }
    public  String getScreenshot(String testname,WebDriver driver) throws IOException {
        TakesScreenshot ts =(TakesScreenshot) driver;
        File source =ts.getScreenshotAs(OutputType.FILE);
        File path = new File (System.getProperty("user.dir")+"//reports"+testname+".png");
        FileUtils.copyFile(source,path);
        return System.getProperty("user.dir")+"//reports"+testname+".png";
    }
    @BeforeMethod(alwaysRun = true)
    public LandingPage loginApplication() throws IOException {
        driver=initializeDriver();
        lpage= new LandingPage(driver);
        lpage.getLink();
        return lpage;
    }
    @AfterMethod(alwaysRun = true)
    public void closeDiver()
    {
        driver.quit();
    }
}
