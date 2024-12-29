package PractProjModule1.TestComponent;
import PractProjModule1.PageObjectModel.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ecomPageCart extends BaseTest {


      @Test(dataProvider = "getData", groups={"Purchase"})
      public void submitOrder(HashMap<String,String>data) throws InterruptedException {
        ProductCatalogue ad = lpage.loginPage(data.get("email"), data.get("pwd"));
        List<WebElement> productnm = ad.getProductList();
        CartPage crt= ad.addProductToCart(data.get("product"));
        crt.goToCartPage();
        boolean match = crt.checkOutProduct(data.get("product"));
        Assert.assertTrue(match);
        CheckoutPage ch = crt.checkout();
        ConfirmationPage pg=ch.addCheckOutDetails("India", jr);
        String message = pg.getConfrimationMessage();
        Assert.assertTrue(message.equalsIgnoreCase("Thankyou for the order."));

    }
    @Test(dependsOnMethods={"submitOrder"})
    public void orderHistoryTest()
    {
        ProductCatalogue productCatalogue = lpage.loginPage("meghasawant99@gmail.com", "Smile@99");
        OrderPage ordPg= productCatalogue.goToOrderPage();
        ordPg.verifyOrderDisplay();


    }
    @DataProvider
    public Object[][] getData() throws IOException {

        List<HashMap<String,String>> data= getJsonDatatoMap(System.getProperty("user.dir")+"//src//test//java//PractProjModule1//Data//PurchaseOrder.json");
        return new Object[][]  {{data.get(0)}, {data.get(1) } };

//        HashMap<String,String> data = new HashMap<String,String>();
//        data.put("email","meghasawant99@gmail.com");
//        data.put("pwd","Smile@99");
//        data.put("product","ZARA COAT 3");
//        HashMap<String,String> data1 = new HashMap<String,String>();
//        data1.put("email","shetty@gmail.com");
//        data1.put("pwd","Iamking@000");
//        data1.put("product","ADIDAS ORIGINAL");

      //  return new Object[][]{{data},{data1}};
        //return new Object[][] {{"meghasawant99@gmail.com","Smile@99","ZARA COAT 3"},{"shetty@gmail.com","Iamking@000","ADIDAS ORIGINAL"}};
    }


}