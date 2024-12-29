package PractProjModule1.TestComponent;

import PractProjModule1.PageObjectModel.CartPage;
import PractProjModule1.PageObjectModel.LandingPage;
import PractProjModule1.PageObjectModel.ProductCatalogue;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class ErrorValidationTest extends BaseTest
{
    @Test (groups={"ErrorsValidations"})
    public void errorValidationLoginPg() throws IOException {

        ProductCatalogue ad = lpage.loginPage("meghaaasawant99@gmail.com", "Smile@99");
        Assert.assertEquals("Incorrrrect email or password.", lpage.getErrorMessage());
    }
    @Test(groups={"ErrorsValidations"})
    public void errorValidationCartPage() throws IOException, InterruptedException {
        String item_nm = "ZARA COAT 3";

        ProductCatalogue ad = lpage.loginPage("meghasawant99@gmail.com", "Smile@99");
        List<WebElement> productnm = ad.getProductList();
        CartPage crt= ad.addProductToCart(item_nm);
        crt.goToCartPage();
        boolean match = crt.checkOutProduct("ZARA COAT 33");
        Assert.assertFalse(match);
    }

}
