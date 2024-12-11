import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SSLCertificateTest
{
    @Test
    public void chromeSSLError()
    {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--headless");
        co.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://self-signed.badssl.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }

//    @Test
//    public void edgeSSLError()
//    {
//        EdgeOptions eo = new EdgeOptions();
//        eo.setAcceptInsecureCerts(true);
//        WebDriver driver = new EdgeDriver(eo);
//        driver.get("https://self-signed.badssl.com/");
//        System.out.println(driver.getTitle());
//        driver.quit();
//
//    }
}
