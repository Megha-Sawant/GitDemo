package MainPackage.PractSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class LocatorPractice
{
    public static void main(String [] arg) throws InterruptedException {
        System.setProperty("webDriver.edge.driver","C:\\Megha\\My_First_Project\\driver\\msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //*************** Add implicit wait to load the element before executing the code .

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //************************************* Locate by id *************************

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

      //************************************* Locate by name *************************
        driver.findElement(By.name("inputPassword")).sendKeys("rahul123");

        //************************************* Locate by class Name *************************

        driver.findElement(By.className("signInBtn")).click();

        //************************************* Locate by css tagname.className *************************

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        //************************************ Locate by Link Text **************************************

        driver.findElement(By.linkText("Forgot your password?")).click();

        //************************************ Locate by CSS custamized tag **************************************

        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("rahul");

        //************************************ Locate by xpath  **************************************

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahul@gmail.com");

        //************************************ Locate by xpath using index **************************************

        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("12345");

        //************************************ Locate by CSS using class name **************************************


        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        //************************************ Locate by CSS using parent tag **************************************

        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        //************************************ Locate by xpath using parent tag **************************************

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

        //************************************ Locate by CSS using id **************************************

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        //************************************ Locate by CSS using regular expression **************************************

        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        //************************************* Locate by id **************************************************************
        Thread.sleep(1000);

        driver.findElement(By.id("chkboxTwo")).click();

        //************************************ Locate by xpath using regular expression contains **************************************

        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        //button[contains(@class,'submit')]

        System.out.println(driver.findElement(By.cssSelector(".login-container")).getText());

        driver.findElement(By.xpath("//button[@class='logout-btn']")).click();

        driver.close();



    }
}
