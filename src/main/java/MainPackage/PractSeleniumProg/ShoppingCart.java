package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {

    public static void main(String [] str)
    {
         System.setProperty("webdriver.Edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");


        String[] wishlist= {"Brocolli", "Carrot","Tomato"};
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));


        driver.manage().window().maximize();
        addItemsCart(driver,wishlist);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
       // driver.close();

    }

    public static void addItemsCart(WebDriver driver, String[] wishlist)
    {

        //To get all list of products
        List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
        //To get count of how many item user want to search on page
        int count = wishlist.length;
        int j=0;
        // To travers to all items on portal and select wishlisted item
        for(int i=0; i<product.size();i++)
        {
            //format = the portal test as per user input
            String[] s = product.get(i).getText().split("-");
             String formattedname = s[0].trim();
             //convert the array into arraylist
            List itemNedeed = Arrays.asList(wishlist);

           if(itemNedeed.contains(formattedname))
            {
                System.out.println(formattedname);
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                j++;
                if( count==j)
                    break;


            }


        }
        //add to cart
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        //proceed with card
        WebDriverWait waitTime =new WebDriverWait(driver,Duration.ofSeconds(5));
       driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

        //apply coupon code
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

    }

}

