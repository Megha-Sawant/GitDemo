package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuPageStepDefinations
{
    WebDriver driver ;
    @Given("User is on menupage and select the {} coffee")
    public void user_is_on_menupage_and_select_the_coffee(String CoffeeItem)
    {

        List<WebElement> items = driver.findElements(By.cssSelector("div[class='cup-body']:nth-child(1)"));
        WebElement ele= items.stream().filter(it->it.getText().equalsIgnoreCase(CoffeeItem)).findFirst().orElse(null);
        System.out.println(ele.getText());
        ele.click();



    }
    @When("User check the cartpage details")
    public void user_check_the_carpage_details() {
    driver.findElement(By.xpath("//a[@aria-label='Cart page']")).click();

    }
    @Then("User selected list should exist on cartpage")
    public void user_selected_list_should_exist_on_cartpage() {
        // Write code here that turns the phrase above into concrete actions

    }

}
