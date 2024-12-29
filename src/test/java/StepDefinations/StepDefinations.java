package StepDefinations;

import PractProjModule1.PageObjectModel.*;
import PractProjModule1.TestComponent.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class StepDefinations extends BaseTest
{

    public LandingPage lpage ;
    public ProductCatalogue prd;
    public ConfirmationPage com;
    public CartPage crt;


    @Given ("I landed on ecommerce page")
    public void I_landed_on_ecommerce_page() throws IOException {
        lpage=loginApplication();
    }

    @Given("Logged in to given userID {} and pasword {}")
    public void loggedInToGivenUserIDAndPasword(String userID, String pwd)
    {
            prd=lpage.loginPage(userID,pwd);
    }

    @When("I add product {} to cart")
    public void iAddProductToCart(String productnm) throws InterruptedException {
        List<WebElement> product = prd.getProductList();
         crt= prd.addProductToCart(productnm);
    }

    @And("Checkout {} and submit the order")
    public void checkoutAndSubmitTheOrder(String productnm)
    {
        crt.goToCartPage();
        boolean match = crt.checkOutProduct(productnm);
        Assert.assertTrue(match);
        CheckoutPage ch = crt.checkout();
        ConfirmationPage pg=ch.addCheckOutDetails("India", jr);
        String message = pg.getConfrimationMessage();
    }

    @Then("{string} message is displayed on ConfirmationPage")
    public void messageIsDisplayedOnConfirmationPage(String message)
    {
        Assert.assertTrue(message.equalsIgnoreCase("Thankyou for the order."));
        driver.close();
    }
}
