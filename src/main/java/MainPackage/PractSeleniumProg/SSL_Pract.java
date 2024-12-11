package MainPackage.PractSeleniumProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSL_Pract
{
    public static void main(String[] avg) {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        EdgeOptions op = new EdgeOptions();
        op.setAcceptInsecureCerts(true);



        WebDriver driver = new EdgeDriver(op);


        //access the webpage
        driver.get("https://expired.badssl.com/");

    }
    }
