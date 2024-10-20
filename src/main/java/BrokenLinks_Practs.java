import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks_Practs
{

    public static void main(String[] avg) throws IOException {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
       // EdgeOptions op = new EdgeOptions();
      //  op.setAcceptInsecureCerts(true);


        WebDriver driver = new EdgeDriver();


        //access the webpage
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        SoftAssert a =new SoftAssert();
        //To get the all hyperlink on webpage
        List<WebElement> hyperLink=driver.findElements(By.cssSelector("li[class='gf-li'] a"));

        for(WebElement link : hyperLink)
        {
            String url= link.getAttribute("href");
            HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
            con.setRequestMethod("HEAD");
            con.connect();
            int respCode =con.getResponseCode();
            a.assertTrue(respCode<400,"The Link with Text"+link.getText()+"is broken code"+respCode);


        }
        a.assertAll();



    }
}
