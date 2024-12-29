package BasicPract;

import Files.PayLoad;
import Files.ReuseableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DynamicJson
{
    JsonPath js;


    @Test(dataProvider="BookID")
    public void addBook(String isbn, String asile)
    {
         RestAssured.baseURI="http://216.10.245.166";
        String response =given().header("Content-Type","application/json").body(PayLoad.addBook(isbn,asile)).when().post("Library/Addbook.php").then().assertThat().statusCode(200).extract().response().asString();
         js=ReuseableMethods.rawToJson(response);

        System.out.println(js.getString("ID"));
    }

    @DataProvider(name="BookID")
    public Object[][] getData()
    {
        //array=collection of elements
       //multidimensional array= collection of arrays
        return new Object [][]{{"abcd","8999"},{"efgh","98888"},{"ijkl","97777"}};

    }

    @Test(dataProvider = "BookID")
    public void deleteBook(String isbn, String asile)
    {
         RestAssured.baseURI="http://216.10.245.166";
         String delResponse =given().header("Content-Type","application/json").body("{\n" +
                 " \n" +
                 "\"ID\" : \""+isbn+asile+"\"\n" +
                 " \n" +
                 "} \n").when().delete("/Library/DeleteBook.php").then().statusCode(200).extract().response().asString();
        js=ReuseableMethods.rawToJson(delResponse);
         Assert.assertEquals(js.getString("msg"),"book is successfully deleted");



    }
}
