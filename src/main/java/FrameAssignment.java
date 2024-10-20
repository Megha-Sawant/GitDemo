import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameAssignment {

    public static void main(String[] arg) {
        System.setProperty("webdriver.Edge.driver", "C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
        System.out.println(driver.findElements(By.tagName("frameset")).size());

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//frameset[@name='frameset-middle']")).click();
        //driver.switchTo().frame("frame-middle");
        driver.switchTo().frame(1);

       String s= driver.findElement(By.xpath("//div[@id='content']")).getText();
        System.out.println(s);
    }

}
